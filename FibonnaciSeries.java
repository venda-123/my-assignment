package week2.day1;

public class FibonnaciSeries {
	public static void main(String[] args) {
		
			   int firstTerm=0;
			    int secondTerm=1;
			    int sum;
			    
	System.out.println(firstTerm +" "+secondTerm);
			 for(int i=2;i<=8;++i)    
		 {    
		  sum=firstTerm+secondTerm;    
		  System.out.println(""+sum);    
		  firstTerm=secondTerm;    
		  secondTerm=sum;    
	}
	}
}
