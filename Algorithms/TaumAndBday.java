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
public class TaumAndBday {

	public static void main(String[] args) throws IOException {
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int t = Integer.parseInt(bufferedReader.readLine().trim());

	        IntStream.range(0, t).forEach(tItr -> {
	            try {
	                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	                int b = Integer.parseInt(firstMultipleInput[0]);

	                int w = Integer.parseInt(firstMultipleInput[1]);

	                String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	                int bc = Integer.parseInt(secondMultipleInput[0]);

	                int wc = Integer.parseInt(secondMultipleInput[1]);

	                int z = Integer.parseInt(secondMultipleInput[2]);

	                long result = Result.taumBday(b, w, bc, wc, z);

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

        public static long taumBday(int b, int w, int bc, int wc, int z) 
        {
            long p1 = wc + z;
            long p2 = bc + z;
            long min1 = Math.min(bc,p1);
            long min2 = Math.min(wc,p2);
            long sum = ((min1*b) + (min2*w));
            return sum;

        }

    }
}
