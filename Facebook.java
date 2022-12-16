package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
private static final WebElement DropDown = null;

public static void main(String[] args) {
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
	 driver.findElement(By.linkText("Create New Account")).click();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("pooja");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("rajendiran");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("pooja2@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("pooja2@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("pooja2");
	 
	 WebElement DropDown = driver.findElement(By.id("day"));
	 Select drop =new Select(DropDown);
	 drop.selectByValue("4");
	 WebElement DropDown1 = driver.findElement(By.id("month"));
	 Select drop1=new Select(DropDown1);
	 drop1.selectByValue("6");
	 WebElement DropDown2 = driver.findElement(By.id("year"));
	 Select drop2=new Select(DropDown2);
	 drop2.selectByValue("2001");
	 
     WebElement gender = driver.findElement(By.xpath("//input[@type='radio'][1]"));
     gender.click();
     //driver.close();	
      

	 
	 
}
}
