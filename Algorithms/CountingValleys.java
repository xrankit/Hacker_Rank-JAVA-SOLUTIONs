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

public class CountingValleys {

	public static void main(String[] args) throws Exception {
		
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int steps = Integer.parseInt(bufferedReader.readLine().trim());

	        String path = bufferedReader.readLine();

	        int result = Result.countingValleys(steps, path);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
		
	}
	
	static class Result {

	    /*
	     * Complete the 'countingValleys' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts following parameters:
	     *  1. INTEGER steps
	     *  2. STRING path
	     */

	    public static int countingValleys(int steps, String path) 
	    {
	        int valley = 0;
	        int count =0;

	        int len = path.length();
	      
	        for(int i =0; i<len;i++)
	        {
	            if(path.charAt(i)=='D')
	            {
	                count--;
	            }
	            else
	            {
	                count++;
	            }
	            if(count==0 && path.charAt(i)=='U')
	            {
	                valley++;
	            }
	            
	        }
	        return valley;
	    }

	}
}
