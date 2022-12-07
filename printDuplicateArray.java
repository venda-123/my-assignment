package week2.day2;

public class printDuplicateArray {
	public static void main(String[] args)
	{
		int[] array= {25,10,33,50,18,45,28,65,39,10,60,50,79};
		
		int arraylength=array.length;
	for(int i=0;i<arraylength-1;i++) {
		int count=1;
		
	for(int j=i+1;j<arraylength-1;j++) {
		if(array[i]==array[j]) {
			count=count+1;
			}
		}
			if(count>1) {
				System.out.println(array[i]);
				}
			}

	}

}
