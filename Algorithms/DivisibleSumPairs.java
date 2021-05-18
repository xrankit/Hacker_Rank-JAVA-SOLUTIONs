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

public class DivisibleSumPairs {

	public static void main(String[] args) throws IOException{
		
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        int n = Integer.parseInt(firstMultipleInput[0]);

	        int k = Integer.parseInt(firstMultipleInput[1]);

	        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());

	        int result = Result.divisibleSumPairs(n, k, ar);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();

	}
	static class Result {


	    public static int divisibleSumPairs(int n, int k, List<Integer> ar) 
	    {
	       Collections.sort(ar);
	       int count=0;
	       for(int i =0;i<ar.size();i++)
	       {
	           for(int j =i+1;j<ar.size();j++)
	           {
	              int c = ar.get(i)+ar.get(j);
	               if(c%k==0)
	               {
	                   count++;
	               }
	           }
	       }
	    return count;
	    }

	}

}
