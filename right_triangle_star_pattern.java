import java.util.*;

public class right_triangle_star_pattern{
    public static void main(String[] args)
    { 
        int i,j;
        Scanner scan =new Scanner(System.in); 
        int n=scan.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(j<=i)
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
}