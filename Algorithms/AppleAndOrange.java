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

public class AppleAndOrange {

	public static void main(String[] args) throws IOException {
		
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        int s = Integer.parseInt(firstMultipleInput[0]);

	        int t = Integer.parseInt(firstMultipleInput[1]);

	        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        int a = Integer.parseInt(secondMultipleInput[0]);

	        int b = Integer.parseInt(secondMultipleInput[1]);

	        String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        int m = Integer.parseInt(thirdMultipleInput[0]);

	        int n = Integer.parseInt(thirdMultipleInput[1]);

	        List<Integer> apples = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());

	        List<Integer> oranges = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());

	        Result.countApplesAndOranges(s, t, a, b, apples, oranges);

	        bufferedReader.close();
	}
	static class Result 
	{
	 public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) 
	    {
	        int apples_count = 0;
	        int oranges_count = 0;
	        for(int i=0;i<apples.size();i++)
	        {
	            int c = apples.get(i) + a;
	            if(c>=s && c<=t)
	            {
	                apples_count++;
	            }
	        }
	        for(int i =0; i<oranges.size();i++)
	        {
	            int d =oranges.get(i) + b;
	            if(d>=s && d<=t)
	            {
	                oranges_count++;
	            }
	        }
	        System.out.println(apples_count);
	        System.out.println(oranges_count);
	    }
	}
}
