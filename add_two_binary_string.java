import java.util.*;
public class add_two_binary_string {


        public static String binaryy(String x, String y)
        {   int numb1=Integer.parseInt(x,2);
            int numb2=Integer.parseInt(y,2);

            int c=numb1+numb2;
            String str=Integer.toBinaryString(c);

            return str;
        }


    public static void main(String[] args)
    {
        String x="101";
        String y="011";
        System.out.println(binaryy(x,y));

        
        

    }
    
}
