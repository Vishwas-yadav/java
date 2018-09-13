import java.util.Scanner;
class A
{
 public static void main(String args[])
  { 
     Scanner scan=new Scanner(System.in);
     int t=scan.nextInt();
     while(t!=0)
     {
        int n=scan.nextInt();
        String s=Integer.toBinaryString(n);
        int count=s.length()-s.replaceAll("1","").length();
        if(count==2) 
        System.out.println("0");
        else
        { 
            int m=n+1,i=1,j=1,add=0,sub=0;
            int p=n-1;
            while(m>n&&p<n)
            {
              String te=Integer.toBinaryString(m);
              int countt=te.length()-te.replaceAll("1","").length();
              if(countt==2) 
             {add=1;break;}
              String r=Integer.toBinaryString(p);
              int countr=r.length()-r.replaceAll("1","").length();
              if(countr==2) 
              {sub=1;break;}
              p--;
              j--;
              m++;
              i++;
            }
            if(add==1)
          System.out.println(i);
          if(sub==1)
          System.out.println(j);
        }
        t--;
     }
  }
}