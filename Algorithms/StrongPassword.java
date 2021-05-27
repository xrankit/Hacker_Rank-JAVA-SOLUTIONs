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
public class StrongPassword {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int answer = Result.minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
	}
	static class Result {

	    public static int minimumNumber(int n, String password) 
	    {
	            int count = 0;

	        if(!password.matches(".*[a-z].*")) {
	            count++;
	        }

	        if(!password.matches(".*[A-Z].*")) {
	            count++;
	        }

	        if(!password.matches(".*[0-9].*")) {
	            count++;
	        }

	        if(password.matches("[a-zA-Z0-9]*")) {
	            count++;
	        }

	        int lengthDifference = 6 - password.length();

	        if(lengthDifference > 0 && count <= lengthDifference) {
	            return lengthDifference;
	        }

	        return count;

	    }

	}
}
