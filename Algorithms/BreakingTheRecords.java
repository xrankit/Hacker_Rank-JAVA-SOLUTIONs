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

public class BreakingTheRecords {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.breakingRecords(scores);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
	}
	
	static class Result {

	    /*
	     * Complete the 'breakingRecords' function below.
	     *
	     * The function is expected to return an INTEGER_ARRAY.
	     * The function accepts INTEGER_ARRAY scores as parameter.
	     */

	    public static List<Integer> breakingRecords(List<Integer> scores)
	    {
	        List<Integer> result = new ArrayList<Integer>();
	        int count_max = 0;
	        int count_min = 0;
	        int max = scores.get(0); 
	        int min = scores.get(0);
	        for(int i = 1; i< scores.size(); i++)
	        {
	            if(scores.get(i)>max)
	            {
	                max = scores.get(i);
	                count_max++;
	            }
	            if(scores.get(i)<min)
	            {
	                min = scores.get(i);
	                count_min++;
	            }
	        }
	        result.add(0,count_max);
	        result.add(1,count_min);
	        
	        return result;
	    }

	}

}
