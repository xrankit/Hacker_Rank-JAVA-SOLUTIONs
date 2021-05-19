package twoPointersAlgorithms;

import java.io.*;
import java.util.Arrays;
public class TripletwithSumZero {

	public static void main(String[] args) throws IOException
	{
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
		   arr[i]=Integer.parseInt(br.readLine()); 
		}
		Arrays.sort(arr);
		for(int i =0;i<n-2;i++)
		{
			if(twoSum(arr, -arr[i], i+1))
			{
				System.out.println("found");
				break;
			}
			System.out.println(("not found"));
			
		}
		
	}
	public static boolean twoSum(int arr[], int x, int i)
	{
		int j = arr.length -1;
		while(i<j)
		{
			if(arr[i] + arr[j] > x)
			{
				j--;
			}
			else if(arr[i] + arr[j] < x)
			{
				i++;
			}
			else
			{
				return true;
			}
		}
		return false;
	}
}
