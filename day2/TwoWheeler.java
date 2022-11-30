package week1.day2;

public class TwoWheeler {
	int noOfWheels=2;
	short noOfMirrors=2;
	long chassisNumber=76648935L;
	boolean isPunctured=false;
	String bikeName="Rx100";
	double runningKM=85.87;

	public static void main(String[] args) {
		TwoWheeler t1=new TwoWheeler();
		System.out.println("noOfWheels="+t1.noOfWheels);
		System.out.println("noOfMirrors="+t1.noOfMirrors);
		System.out.println("chassisNumber="+t1.chassisNumber);
		System.out.println("isPunctured="+t1.isPunctured);
		System.out.println("bikeName="+t1.bikeName);
		System.out.println("runningKM="+t1.runningKM);


	}
}
