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
public class RepeatedString {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

	}
	static class Result {

	    public static long repeatedString(String s, long n) 
	    {
	        long size = s.length();
	        long repeated = n/size;
	        long left = n - (size * repeated);
	        int extra = 0;
	        int count = 0;
	        for(int i = 0; i < size; i++){
	            if(s.charAt(i) == 'a'){
	                ++count;
	            }
	        }

	        for(int i = 0; i < left; i++){
	            if(s.charAt(i) == 'a'){
	                ++extra;
	            }
	        }

	        repeated = (repeated * count) + extra;

	        return repeated;
	    }

	} 
}
