import java.util.*;

    // String input=sc.next().replaceAll("[^\\(\\)\\[\\]\\{\\}]", "");
    // while(input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());
    // System.out.println(input.isEmpty());

class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
			System.out.println(isMatches(input));
        }
        sc.close();
		
	}

	static boolean isMatches(String s){
		Stack<Character> stack = new Stack<Character>();
		for(char c:s.toCharArray()){

			if(c=='('|| c == '[' || c == '{'){
			stack.push(c);
			}else{
				if(stack.isEmpty()){
				return false;
			}
			char top = stack.pop();
			if(!((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{'))){
				return false;
			}
		}
		}
		return stack.isEmpty();

	}
}



