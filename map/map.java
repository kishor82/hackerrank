import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []args){
		Scanner in= new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		Map<String ,Integer> phonebook = new HashMap<>();

		for(int i=0;i<n;i++){
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
			phonebook.put(name,phone);
		}
		while(in.hasNext()){
			String s=in.nextLine();
			Integer temp=phonebook.get(s);
			if(temp == null){				
				System.out.println("Not found");
			}else{
				System.out.println(s+"=" + temp);
			}
		}
	}
}