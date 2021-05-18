package algorithmsJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
            
        int number = Integer.parseInt(br.readLine());
        
        List<Integer> ans = new ArrayList<Integer>();
        
        for(int i = 0 ; i < number ; i++ )
        {   
           int j = Integer.parseInt(br.readLine());
            ans.add(j);
        }
        for(int i = 0 ; i < number ; i++)
        {
            if(ans.get(i)>=38)
            {
                int k = ans.get(i)/5;
                int diff = ((k+1)*5) - ans.get(i);
                if(diff<3)
                {
                   ans.add(i,((k+1)*5));
                   System.out.println(ans.get(i)) ;
                }
                else
                {
                    System.out.println(ans.get(i));
                }           
            }
            else
            {
                System.out.println(ans.get(i));
            }
        }
	}

}
