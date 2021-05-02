package introductions;
import java.util.*;
public class JavaLoopsII {

	 public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            int c = a;
	            for(int j = 0; j<n ; j++)
	            {
	                int ans = (int)Math.pow(2,j);
	                c = c + (ans * b);
	                System.out.printf("%s",c+" ");
	            }
	            System.out.println( );
	        }

	}

}
