import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution2 {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int j=0;
        ArrayList<String> al=new ArrayList<String>();
        for(;j<=s.length()-k;j++){
           al.add(s.substring(j,j+k));
            
        }
        smallest=al.get(0);
        largest=al.get(0);
        /*for(String i:al){
            System.out.println(i);
        }*/
        for(int i=1;i<al.size();i++){
            
            if(!(smallest.compareTo(al.get(i))<0)){
                smallest=al.get(i);
            }
            if(!(largest.compareTo(al.get(i))>0)){
                largest=al.get(i);
            }
            
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}