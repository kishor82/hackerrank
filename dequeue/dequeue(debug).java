import java.util.*;
//This programm is to understand, how this code works behind the scene

class debug{
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		Deque<Integer> deque= new ArrayDeque<>();
		HashSet<Integer> set= new HashSet<>();

		int n = in.nextInt();
		int m = in.nextInt();
		int max = Integer.MIN_VALUE;

		for(int i=0;i<n;i++){
			int input = in.nextInt();

			deque.add(input);
			System.out.println("********BREAKING CODE**********"+i);
			System.out.println("Deque: "+deque);
			set.add(input);
			System.out.println("Set: "+set);

			System.out.println("if(deque.size() == m):"+(deque.size() == m));
			if(deque.size() == m){
				System.out.println("max:"+max +", setSize:"+set.size());
				System.out.println("if(set.size() > max):"+(set.size() > max));
				if(set.size() > max) {
					max=set.size();
					System.out.println("setting max to: "+max);
				}
				int first = deque.remove();
				System.out.println("first: "+first);
				System.out.println("checking weather["+first+"] is repeated or not ?");
				System.out.println("if(!deque.contains(first)):"+(!deque.contains(first)));
				if (!deque.contains(first)){
					System.out.println("removing"+first+ "from set:");
					set.remove(first);
					System.out.println("set after removing "+first+":\n"+set);
				}
			}
			System.out.println("max: "+max);
		}
		System.out.println(max);
	}
}