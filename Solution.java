import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution 
{
static String printlcs(String X,String Y,int m,int n)
{
int[][] LCSuff = new int[m + 1][n + 1];
int len = 0;
int row = 0, col = 0;
 for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    LCSuff[i][j] = 0;
 
                else if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    LCSuff[i][j] = LCSuff[i - 1][j - 1] + 1;
                    if (len < LCSuff[i][j]) {
                        len = LCSuff[i][j];
                        row = i;
                        col = j;
                    }
                } else
                    LCSuff[i][j] = 0;
            }
        }
 if (len == 0) {
            String bc=null;
            return bc;
        }
String resultStr = "";
 while (LCSuff[row][col] != 0) {
            resultStr  = X.charAt(row - 1) + resultStr;
            --len;
            row--;
            col--;
        }
return resultStr;
}


    static long uniqueRecycledPairs(int[] A) 
    {
        int r,r1,n1;
long count=0;
        n1=A.length-1;
        for(int i=0;i<n1;i++)
        {
            int j=0,k=0;
            if(A[i]<A[i+1])
            {
                int a=A[i];
                int b=A[i+1];
                String X=Integer.toString(a);
                String Y=Integer.toString(b);
                int m=X.length();
                int n=Y.length();
                if(m==n)
                {
                    String ab=printlcs(X,Y,m,n);
			System.out.println("value of sub: "+ab);
                    if(ab!=null)
                    {
                        String abc=X.replace(ab,"");
                        String bcd=Y.replace(ab,"");
                        if(abc.equals(bcd))
                            count++;
                    }
                }
            }
        }
        return count;

    }

    

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
	System.out.println(uniqueRecycledPairs(a));
    }
}
