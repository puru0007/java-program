

import java.util.*;
class lcm
{
    
    public static void main(String[] args)
    {
        int num1,num2;
        int i,g=0;
        Scanner scan=new Scanner(System.in);
        num1=scan.nextInt();
        num2=scan.nextInt();
        
        if(num1%num2==0)
        {
            System.out.println("Lcm is"+num1);
        }
        else if(num2%num1==0)
        {
            System.out.println("Lcm is"+num2);
        }
        else
        {
            for(i=1;i<=num1 || i<=num2;i++)
            {
                if(num1%i==0 && num2%i==0)
                {
                    g=i;
                }
            }
            System.out.println("lcm is"+((num1*num2)/g));
            
        }


    }
}

