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

public class MiniMaxSum {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();

	}
	
	static class Result {
	    
	    public static void miniMaxSum(List<Integer> arr) 
	    {   
	        Collections.sort(arr);
	        long max = Collections.max(arr);
	        long min = Collections.min(arr);
	        long sum =0;
	        for(int i =0;i<arr.size();i++)
	        {
	            sum = sum + arr.get(i);
	        }
	        System.out.print(sum-max+" ");
	        System.out.print(sum-min);
	 
	    }

	}

}
