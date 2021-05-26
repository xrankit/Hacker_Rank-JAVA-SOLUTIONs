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
public class ChoclateFeast {

	public static void main(String[] args) throws IOException {
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int t = Integer.parseInt(bufferedReader.readLine().trim());

	        IntStream.range(0, t).forEach(tItr -> {
	            try {
	                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	                int n = Integer.parseInt(firstMultipleInput[0]);

	                int c = Integer.parseInt(firstMultipleInput[1]);

	                int m = Integer.parseInt(firstMultipleInput[2]);

	                int result = Result.chocolateFeast(n, c, m);

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

		   
	    public static int chocolateFeast(int n, int c, int m) 
	    {
	        int choco = n/c;
	        int eat = 0;
	        int wrappers = 0;
	        while(choco>0)
	        {  
	            eat = eat +choco;
	            wrappers = wrappers + choco;   
	            choco = wrappers / m;  
	            wrappers = wrappers % m;     
	        }
	        return eat ;   
	    }

	}
}
