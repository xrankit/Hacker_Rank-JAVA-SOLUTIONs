package algorithmsJava;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class PlusMinus {

	public static void main(String[] args) throws IOException {
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());

	        Result.plusMinus(arr);

	        bufferedReader.close();

	}
	static class Result {

	    public static void plusMinus(List<Integer> arr) 
	    {   
	        float count1 = 0;
	        float count2 = 0;
	        float count3 = 0;
	        Collections.sort(arr);
	        for(int i=0;i<arr.size();i++)
	        {   
	            if(arr.get(i)<0)
	            {
	                count1++; 
	            }
	            else if(arr.get(i)>0)
	            {
	                count2++;
	            }
	            else
	            {
	                count3++;
	            }
	        }
	            
	            System.out.println(count2/arr.size());
	            System.out.println(count1/arr.size());
	            System.out.println(count3/arr.size());
	        
	    }

	}

}
