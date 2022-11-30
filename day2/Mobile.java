package week1.day2;

public class Mobile {
	String mobileBrandName="OPPO";
	char mobileLogo='O';
	short noOfMobilePiece=1;
	int modelNumber=6;
	long mobileImeiNumber=765478998876L;
	float mobilePrice=25000.25f;
	boolean isDamaged=false;


public static void main(String[] args) {
	Mobile m1=new Mobile();
	System.out.println("mobileBrandName="+m1.mobileBrandName);
	System.out.println("mobileLogo="+m1.mobileLogo);
	System.out.println("noOfMobilePiece="+m1.noOfMobilePiece);
	System.out.println("modelNumber="+m1.modelNumber);
	System.out.println("mobileImeiNumber="+m1.mobileImeiNumber);
	System.out.println("mobilePrice="+m1.mobilePrice);
	System.out.println("isDamaged="+m1.isDamaged);

}

}


