package introductions;
import java.util.*;

public class EndOfFile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        for( int i = 1; sc.hasNext() == true; i++  )
        {
            String s = sc.nextLine();
            System.out.println(i+" "+s);
        }

	}

}
