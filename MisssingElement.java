package week2.day2;

import java.util.Arrays;

public class MisssingElement {
	public static void main(String[] args) 
	{
		int[] arr = {2,3,4,6,8,10};
		Arrays.sort(arr);
		int arrlen=arr.length;
		System.out.println(arrlen);
		for(int i=0;i<arr.length;i++)
		{
			int arr1=i+1;
			{
			if(arr1!=arr[i])
			{
				System.out.println(arr1);
			break;

			}
			}


		}


	}
}
