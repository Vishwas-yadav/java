import java.util.*;
 class Cc
{
  public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t>0)
	{
	
int a=sc.nextInt();
int b=sc.nextInt();
int n=sc.nextInt();
int dif=a-b;
if(dif<0)
dif*=-1;
int gcd=0;
if(dif==0)
gcd=0;
int sum=(int)(Math.pow(a,n)+Math.pow(b,n));
for(int i = 1; i <= sum && i <= dif; ++i)
        {
            
            if(sum % i==0 && dif % i==0)
                gcd = i;
        }

System.out.println(gcd);






t--;
	}




}

}