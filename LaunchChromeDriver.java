package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeDriver {
   
 public static void main(String[] args) {
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("http://leaftaps.com/opentaps/control/main");
	 //maximize the browser
	 driver.manage().window().maximize();
	 //enter the username as DemoCsr
	 driver.findElement(By.id("username")).sendKeys("DemoCsr");
	 //enter the password as crmsfa
	 driver.findElement(By.id("password")).sendKeys("crmsfa");
	 driver.findElement(By.className("decorativeSubmit")).click();
	 //Click crmsfa link
	 driver.findElement(By.linkText("CRM/SFM")).click();
	 //clickon lead tap
	 driver.findElement(By.linkText("lead")).click();
	 //click on create lead button
	 driver.findElement(By.partialLinkText("lead")).click();
	 //enter compayname
	 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
	 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("pooja");
	 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G");
	 driver.findElement(By.name("createLeadForm_firstNameLocal")).sendKeys("pooja");
	 driver.findElement(By.name("createLeadForm_lasttNameLocal")).sendKeys("poo");
	 driver.findElement(By.name("personalTitle")).sendKeys("Cognizant");
	 driver.findElement(By.name("generalProfTitle")).sendKeys("tester");
	 driver.findElement(By.name("departmentName")).sendKeys("scrummaste");
	 driver.findElement(By.name("annualRevenue")).sendKeys("400000");
	 driver.findElement(By.name("numberEmployees")).sendKeys("98");
	 driver.findElement(By.name("tickerSymbol")).sendKeys("*");
	 driver.findElement(By.name("description")).sendKeys("tester");
	 driver.findElement(By.name("importantNote")).sendKeys("tester");
	 driver.findElement(By.name("primaryPhoneAreaCode")).sendKeys("70023");
	 driver.findElement(By.name("primaryPhoneNumber")).sendKeys("8593685038");
	 driver.findElement(By.name("primaryPhoneExtension")).sendKeys("2563");
	 driver.findElement(By.name("primaryPhoneAskForName")).sendKeys("tester");
	 driver.findElement(By.name("primaryEmail")).sendKeys("venda2k1@gmail.com");
	 driver.findElement(By.name("primaryWebUrl")).sendKeys("https://www.google.com/");
	 driver.findElement(By.name("generalToName")).sendKeys("kavi");
	 driver.findElement(By.name("generalAttnName")).sendKeys("kaviyarasan");
	 driver.findElement(By.name("generalAddress1")).sendKeys("chennai");
	 driver.findElement(By.name("generalAddress1")).sendKeys("Arakkonam");
	 driver.findElement(By.name("generalCity")).sendKeys("chennai");
	 driver.findElement(By.name("generalPostalCode")).sendKeys("73536");
	 driver.findElement(By.name("generalPostalCodeExt")).sendKeys("0425");
	 driver.findElement(By.className("smallSubmit")).click();
	 
	 
	 
	 
 }
}
