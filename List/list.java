import java.util.Scanner;
import java.util.LinkedList;

class Solution {
	public static void main(String[] args) {
		//Create and fill Linked List of Integers 
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		LinkedList<Integer>  list= new LinkedList<>();
		for(int i=0;i<N;i++){
			int value=scan.nextInt();
			list.add(value);
		}
		//perform queries on Linked List

		int q=scan.nextInt();
		for(int i =0;i<q;i++){
			String action = scan.next();
			if(action.equals("Insert")){
				int index = scan.nextInt();
				int value = scan.nextInt();
				list.add(index,value);
			}else{
				//Delete
				int index = scan.nextInt();
				list.remove(index);
			}
		}
		scan.close();

		//Print out updated Linked List

		for (Integer num:list){
			System.out.print(num + " ");
		}
		
	}
}