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
import java.io.IOException;

public class MarsExploration {
	public static void main(String[] args) throws IOException {
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String s = bufferedReader.readLine();

	        int result = Result.marsExploration(s);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	}
	static class Result {

	    public static int marsExploration(String s) 
	    {
	        String sos = "SOS";
	        int count = 0;
	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i) != sos.charAt(i % 3)) count++;
	        }
	        return count;

	    }

	}
}
