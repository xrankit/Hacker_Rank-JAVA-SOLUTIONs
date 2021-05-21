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

public class UtopianTree {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int result = Result.utopianTree(n);

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

	    public static int utopianTree(int n) 
	    {
	        int height = 0;
	        for(int i=0;i<=n;i++)
	        {
	            if(i==0)
	            {
	                height = 1;
	            }
	            else if(i==1)
	            {
	                height = 2;
	            }
	            else if(i==2)
	            {
	                height = 3;
	            }
	            else
	            {
	                if(i%2!=0)
	                {
	                height = height*2; 
	                }
	                else
	                {
	                    height = height+1;
	                }
	            }
	        }
	        return height;
	    }

	}
}
