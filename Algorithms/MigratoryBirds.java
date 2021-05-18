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

public class MigratoryBirds {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
	}
	static class Result 
	{

	    public static int migratoryBirds(List<Integer> arr) 
	    {
	        int max = 0;
	        int maxPos =0;
	        int narr[] = new int [6];
	        for(int num : arr)
	        {   
	            narr[num]++;
	            if (narr[num]>max)
	            {
	                maxPos=num;  
	                max = narr[num];
	            }
	            if (narr[num]==max)
	            {
	                if(maxPos>num)
	                {
	                    maxPos=num;
	                }
	                else{
	                    maxPos=maxPos;
	                }
	            }
	        }
	        
	        return maxPos;
	    }

	}


}
