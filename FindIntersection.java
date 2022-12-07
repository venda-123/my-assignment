package week2.day2;

public class FindIntersection {
	public static void main(String[] args) 
	{
		int array[]= {6,4,8,7,2,5,1};
		int array1[]= {5,9,7,8,6,4};
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array1.length;j++)
		{
				if(array[i]==array1[j])
				{
				System.out.println(array[i]);

				}
					
		}
		}

	}
}
