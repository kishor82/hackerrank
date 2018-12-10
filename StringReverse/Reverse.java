import java.io.*;
import java.util.*;

class Solution {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String A=sc.next();

		StringBuilder sb=new StringBuilder(A);
		String reverse=sb.reverse().toString();

		if(A.compareTo(reverse)==0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}
}