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
public class CamelCase {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.camelcase(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

	}
	static class Result {

	    public static int camelcase(String s) 
	    {
	        int terms = 1;
	        for (int i = 0; i < s.length(); i++) 
	        {
	            String letter = Character.toString(s.charAt(i));
	            if (letter == letter.toUpperCase()) 
	            {
	                terms++;
	            }
	        }
	        return terms;
	    }

	}
}
