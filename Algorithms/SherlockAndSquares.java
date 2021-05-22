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

public class SherlockAndSquares {

	public static void main(String[] args) throws IOException {
		
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int q = Integer.parseInt(bufferedReader.readLine().trim());

	        IntStream.range(0, q).forEach(qItr -> {
	            try {
	                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	                int a = Integer.parseInt(firstMultipleInput[0]);

	                int b = Integer.parseInt(firstMultipleInput[1]);

	                int result = Result.squares(a, b);

	                bufferedWriter.write(String.valueOf(result));
	                bufferedWriter.newLine();
	            } catch (IOException ex) {
	                throw new RuntimeException(ex);
	            }
	        });

	        bufferedReader.close();
	        bufferedWriter.close();
	}
	
	static class Result {

	    public static int squares(int a, int b) 
	    {
	        int numOfSquares = 0;
	        int x = 1;
	        while(x*x < a)
	        x++;
	        while(x*x <= b)
	        {
	            numOfSquares++;
	            x++;
	        }
	        return numOfSquares;
	    }

	}
}
