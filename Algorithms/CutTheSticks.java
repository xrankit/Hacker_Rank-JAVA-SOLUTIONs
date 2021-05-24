package algorithmsJava;
import java.util.*;
public class CutTheSticks {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] freq = new int[1001];
        for(int i = 0; i < n; i++){
            freq[in.nextInt()]++;
        }

        for(int i = 0; i < freq.length; i++){
            if(freq[i] != 0){
                System.out.println(n);
                n -= freq[i];
            }
        }

	}

}
