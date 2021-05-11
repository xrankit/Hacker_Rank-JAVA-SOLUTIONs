package strings;
import java.util.*;
public class JavaStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int len=A.length();
        /* Enter your code here. Print output to STDOUT. */
        char S[] = A.toCharArray();
        boolean palindrome = true;
        for(int i = 0; i<len/2;i++)
        {
            if(S[i] != S[len-i-1])
            {
                System.out.println("No");
                palindrome = false;
                break;
            }
        }
        if(palindrome)
        {
            System.out.println("Yes");
        }
	}
}


