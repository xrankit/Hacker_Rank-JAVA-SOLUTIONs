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
public class ExtraLongFactorials {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.extraLongFactorials(n);

        bufferedReader.close();
	}
	
	static class Result {

	    /*
	     * Complete the 'extraLongFactorials' function below.
	     *
	     * The function accepts INTEGER n as parameter.
	     */

	    public static void extraLongFactorials(int n) 
	    {
	        BigInteger factorial = new BigInteger("1");
	        
	        while (n>1)
	        {
	            factorial = factorial.multiply(BigInteger.valueOf(n));
	            n--;
	        }
	        System.out.println(factorial);
	    }
	}
}
