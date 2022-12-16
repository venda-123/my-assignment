package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testbank {
public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://uibank.uipath.com/register-account");

	driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


	  driver.findElement(By.id("firstName")).sendKeys("rani");
	  	
	  		
	  WebElement title = driver.findElement(By.id("title"));
       Select  dropdown=new Select(title);
	   dropdown.selectByIndex(0);

	   driver.findElement(By.id("middleName")).sendKeys("v");
	   driver.findElement(By.id("lastName")).sendKeys("venda");

	   WebElement Sex = driver.findElement(By.id("sex"));
       Select  dropdownsex=new Select(Sex);
	   dropdownsex.selectByVisibleText("Female");

	   WebElement employeeStatus = driver.findElement(By.id("employmentStatus"));
       Select  dropdownstatus=new Select(employeeStatus);
       dropdownstatus.selectByVisibleText("Full-time");

	 
	 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("venda");
	
	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("malini23@gmail.com");
	 
	 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("venda123");
	 
}
}
