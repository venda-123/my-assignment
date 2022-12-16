package week3.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test2Matrimony {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.tamilmatrimony.in");
	driver.manage().window().maximize();
	driver.findElement(By.id("NAME")).sendKeys("venda");
	driver.findElement(By.id("MOTHERTONGUE")).sendKeys("Tamil");
	driver.findElement(By.id("EMAIL")).sendKeys("venda2k1@gmail.com");
	driver.findElement(By.name("PASSWD1")).sendKeys("venda123!");
	WebElement findElement = driver.findElement(By.name("REGISTERED_BY"));
	Select drop=new Select(findElement);
	drop.selectByValue("1");
	driver.findElement(By.id("genderfemale")).click();
	WebElement findElement2 = driver.findElement(By.id("RELIGION"));
	Select drop2=new Select(findElement2);
	drop2.selectByValue("12");
	WebElement findElement3 = driver.findElement(By.id("COUNTRY"));
	Select drop3=new Select(findElement3);
	drop3.selectByValue("98");
	WebElement findElement4 = driver.findElement(By.id("MOTHERTONGUE"));
	Select drop4=new Select(findElement4);
	drop4.selectByValue("47");
	WebElement findElement5 = driver.findElement(By.id("DOBDAY"));
	Select drop5=new Select(findElement5);
	drop5.selectByVisibleText("4");
	WebElement findElement6=driver.findElement(By.id("DOBMONTH"));
	Select drop6=new Select(findElement6);
	drop6.selectByVisibleText("June"
			+ "");
	WebElement findElement7 = driver.findElement(By.id("DOBYEAR"));
	Select drop7=new Select(findElement7);
	drop7.selectByVisibleText("2001");
	
	
	driver.findElement(By.id("MOBILENO")).sendKeys("6382100152");





}
}
