package week8.day1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Ass1Nykaa {
private static final Object Guest = null;

public static void main (String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get(" https://www.nykaa.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement brand=driver.findElement(By.xpath("//a[text()='brands']"));
    Actions build=new Actions(driver);
    build.moveToElement(brand).perform();
	//WebElement findElement = driver.findElement(By.xpath("//a[text()='brands']"));
	

	WebElement findElement1 = driver.findElement(By.id("brandSearchBox"));
	findElement1.sendKeys("L'Oreal Paris");
	WebElement findElement2=driver.findElement(By.linkText("L'Oreal Paris"));
	findElement2.click();
	//String title=driver.getTitle();
	//System.out.println(title);
	
	WebElement findElement3=driver.findElement(By.xpath("//span[text()='Sort By : popularity']"));
	findElement3.click();
	
	
	WebElement findElement4 = driver.findElement(By.xpath("//span[text()='customer top rated']"));
	findElement4.click();
	WebElement findElement5=driver.findElement(By.xpath("//span[text()='Category']"));
	findElement5.click();
	
	WebElement findElement6=driver.findElement(By.xpath("(//span[@class='filter-name '])[2]"));
	findElement6.click();
	//WebElement DropDown = driver.findElement(By.className("arrow-icon"));
	 //Select drop =new Select(DropDown);
	 //drop.selectByValue("Hair Care");
	// WebElement findElement = driver.findElement(By.xpath("//span[text()='Hair Care']"));
	 //Select drop1 =new Select(DropDown);
	 //drop1.selectByValue("Shampoo");
	
	WebElement findElement7=driver.findElement(By.xpath("//span[text()='Hair Care']"));
	findElement7.click();
	WebElement sha=driver.findElement(By.xpath("(//div[@class='control-indicator checkbox '])[1]"));
	sha.click();
	WebElement concern=driver.findElement(By.xpath("//span[text()='Concern']"));
	concern.click();
	WebElement color=driver.findElement(By.xpath("//span[text()='Color Protection']"));
	color.click();

	WebElement shampoo=driver.findElement(By.xpath("//div[@class='css-43m2vm']"));
	
	shampoo.click();
	Set<String>w1=driver.getWindowHandles();
	for (String newwin : w1) {
		driver.switchTo().window(newwin);
		
	}
	
	WebElement MRP=driver.findElement(By.xpath("//span[@class='css-u05rr']"));
	String MRP1=MRP.getText();
	System.out.println(MRP1);
	
	WebElement ADDToBag=driver.findElement(By.xpath("//span[@class='btn-text']"));
	ADDToBag.click();
	
	
	WebElement Shoppingbag=driver.findElement(By.xpath("//button[@class='css-g4vs13']"));
	Shoppingbag.click();
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("(//button[@class='css-guysem e8tshxd0'])[2]")).click();
	
	WebElement TotalAmount=driver.findElement(By.xpath("//div[@class='css-15py5ir e25lf6d2']/span"));
	String TotalAmount1=TotalAmount.getText();
	System.out.println(TotalAmount1);
	WebElement findElement = driver.findElement(By.xpath("(//button[@class='css-guysem e8tshxd0'])[2]"));
	findElement.click();
	
	WebElement Guest4=driver.findElement(By.xpath("(//p[@class='css-masf0q eka6zu20'])[2]"));
	String TotalAmount2=Guest4.getText();
	System.out.println(TotalAmount2);
	
	if(Guest.equals(TotalAmount)) {
		System.out.println("same");
		
	}
	driver.quit();
}
}
