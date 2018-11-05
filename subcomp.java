import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;

class Solution{
	public static String getSmallestAndLargest(String s,int k){
		String smallest = "";
		String largest = "";
		SortedSet<String> sets=new TreeSet<String>();
		for(int i=0;i<=s.length()-k;i++){
			sets.add(s.substring(i,i+k));
		}
		
		smallest= sets.first();
		largest = sets.last();
		return smallest +"\n" +largest ;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int k=sc.nextInt();

		System.out.println(getSmallestAndLargest(s,k));
	}
}
