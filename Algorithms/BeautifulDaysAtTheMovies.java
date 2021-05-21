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

public class BeautifulDaysAtTheMovies {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int i = Integer.parseInt(firstMultipleInput[0]);

        int j = Integer.parseInt(firstMultipleInput[1]);

        int k = Integer.parseInt(firstMultipleInput[2]);

        int result = Result.beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
	}
	
	static class Result {

	    public static int beautifulDays(int i, int j, int k) 
	    {
	         int num = 0;
	        for (int x = i ; x <= j ; x ++)  
	        {
	            int temp = x;
	            int reverse = 0;
	            int last_digit = 0;
	            while (temp > 0)   {
	                last_digit = temp % 10;
	                reverse = (reverse * 10) + last_digit;
	                temp = temp / 10;
	            }
	            if ((x - reverse) % k == 0)   {
	                num = num + 1;
	            }
	        }
	        return num;
	    }

	}
}
