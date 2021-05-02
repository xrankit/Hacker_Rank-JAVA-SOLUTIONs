package introductions;
import java.util.*; 
public class JavaLoopsI {

	
		  private static final Scanner scanner = new Scanner(System.in);

		    public static void main(String[] args) {
		        int N = scanner.nextInt();
		          for(int i=1;i<=10;i++)
		        {
		            int result=N*i;
		             System.out.printf("%d x %d = %d%n", N, i, result);
		        }

	}

}
