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

public class EqualizeTheArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.equalizeArray(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
	}
	static class Result {

	    public static int equalizeArray(List<Integer> arr) 
	    {
	        int count=1,max=0;
	        for(int i=0;i<arr.size();i++)
	        {   
	            count=1;
	            for(int j=i+1;j<arr.size();j++)
	            {
	                if(arr.get(i)==arr.get(j))
	                    count++;
	            }
	        
	            if(count>=max)
	            {
	                max=count;
	            }
	        
	    }

	    return arr.size()-max;
	    }

	}

}
