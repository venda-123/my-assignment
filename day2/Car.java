package week1.day2;

public class Car {
	public void applyBreak()
	{
		System.out.println("apply Break");
	}
	public void applyGear()
	{
		System.out.println("apply Gear");
	}
	public void switchOnAc()
	{
		System.out.println("switch on AC");
	}
	public void applyAcclerate()
	{
		System.out.println("apply Acclerate");
	}
public static void main(String[] args) 
{
	Car ford=new Car();
    ford.applyBreak();
	ford.applyGear();
	ford.switchOnAc();
	ford.applyAcclerate();


	}


}
