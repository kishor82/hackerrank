
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;

class solution{
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String[] left=new String[n];
		String[] right=new String[n];
		for(int i =0 ;i<n;i++){

			left[i]=in.next();
			right[i]=in.next();
		}in.close();

		//solution without hashset
		// int count = 0;
		// boolean found;
		// if(n>=1 && n<=100000){
		// 	for(int i=0 ;i<left.length && i<right.length;i++){
		// 		found=false;
		// 		for(int j=0;j<i;j++){
		// 			if(left[i].equals(left[j])){
		// 				if(right[i].equals(right[j])){
		// 					found = true;
		// 					break;
		// 				}
		// 			}
		// 		}

		// 		if(!found){
		// 			count+=1;
		// 		}

		// 		System.out.println(count);
		// 	}
		// }

		//Solution using hashset

		HashSet<String> pairs=new HashSet<String>();
		for(int i=0;i<left.length;i++){
			pairs.add("("+left[i]+" ,"+right[i]+")");
			System.out.println(pairs.size());
		}
	}
}