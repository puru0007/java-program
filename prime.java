import java.util.*;

public class prime
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
int flag=0;
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            { flag++;
                
            }
        }
        if(flag==1)
        System.out.println(n+""+" is prime");
        else
        System.out.println("not prime");
    }
}