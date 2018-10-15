/*import java.util.Scanner;

 class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                  String s1=sc.next();
                  int x=sc.nextInt();
                  System.out.printf("%-15s%03d%n", s1, x);
                        
            }
            System.out.println("================================");

    }
}
*/
import java.util.*;
import java.math.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-32768 && x<=32767)System.out.println("* int");
                if(x>=-2147483648 && x<= 2147483647)System.out.println("* long");
                if(x>=-(Math.pow(2,63))&& x<=(Math.pow(2, 63))-1)System.out.println("* double");

            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}



