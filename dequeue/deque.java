import java.util.*;

class Solution{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Deque<Integer> deque=new ArrayDeque<>();//generics 
		HashSet<Integer> set=new HashSet<>();
		int n=in.nextInt();//Total Numbers
		int m=in.nextInt();//Sub Array size
		int max=Integer.MIN_VALUE;

		for(int i=0;i<n;i++){
			int input= in.nextInt();//input values

			deque.add(input);
			set.add(input);

			if(deque.size() == m){
				if(set.size() > max) max = set.size();
				int first=deque.remove();
				if(!deque.contains(first)) set.remove(first);
			}
		}
		System.out.println(max);
	}
}