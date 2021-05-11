package strings;
import java.util.*;
public class JavaSubstringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scan = new Scanner(System.in);
	        String s = scan.next();
	        int k = scan.nextInt();
	        scan.close();
	      
	        System.out.println(getSmallestAndLargest(s, k));
	}
	 public static String getSmallestAndLargest(String s, int k) 
	 {
	        String smallest = s.substring(0,k);
	        String largest = s.substring(0,k);
	        String start = s.substring(0,k);
	        
	        for(int i = 0; i<s.length()-k+1 ; i++)
	        {
	            start = s.substring(i,i+k);
	            if(start.compareTo(largest)>0)
	            {
	                largest = s.substring(i,i+k);
	            }
	            if(start.compareTo(smallest)<0)
	            {
	                smallest = s.substring(i,i+k);
	            }
	        }
	        return smallest + "\n" + largest;
	    }

}
