import java.util.*;
import java.math.*;
class CCD
{
  public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t>0)
	{
	
long a=sc.nextLong();
long b=sc.nextLong();
long n=sc.nextLong();
long dif=a-b;
if(dif<0)
dif*=-1;
long gcd=0;
if(dif==0)
gcd=0;
long sum=(long)(Math.pow(a,n)+Math.pow(b,n));

for(long i = 1; i <= sum && i <= dif; ++i)
        {
            
            if(sum % i==0 && dif % i==0)
                gcd = i;
        }

System.out.println(gcd);






t--;
	}




}

}