import java.util.*;
import java.math.*;
import java.io.*;

class Solution1{
	public static void main(String []args){

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();

		for(int i=0;i<t;i++){
			try{

				long x=sc.nextLong();
				System.out.println(x+" can be fitted in:");
				try{
					byte y = (byte) x;
					System.out.println(y);
					if(y ==x){
						System.out.println(" *byte");
					}
				}catch(Exception e){System.out.println(" this is practise");}
				try{
					short y = (short) x;
					System.out.println(y);
					if(y ==x){
						System.out.println(" *short");
					}
				}catch(Exception e){}
				try{
					int y = (int) x;
					System.out.println(y);
					if(y ==x){
						System.out.println(" *int");
					}
				}catch(Exception e){}
				System.out.println(" *long");
			}catch(Exception e){
				System.out.println(sc.next()+" can't be fitted anywhere.");
			}
		}
	}
}