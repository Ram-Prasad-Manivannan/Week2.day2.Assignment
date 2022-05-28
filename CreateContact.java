package week2.day2.assignment1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact 
{

	public static void main(String[] args) 
	{
		  WebDriverManager.chromedriver().setup();
		  ChromeDriver driver=new ChromeDriver();
		  
		  driver.get("http://leaftaps.com/opentaps/control/login");
		  
		  driver.manage().window().maximize();
		 
		  driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		  driver.findElement(By.id("password")).sendKeys("crmsfa");
		  
		  driver.findElement(By.className("decorativeSubmit")).click();
		  driver.findElement(By.linkText("CRM/SFA")).click();
		  
		  driver.findElement(By.linkText("Contacts")).click();
		  
		  driver.findElement(By.linkText("Create Contact")).click();
		  
		  driver.findElement(By.id("firstNameField")).sendKeys("Mysterio");
		  
		  driver.findElement(By.id("lastNameField")).sendKeys("Destiny");
		  
		  driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Ram Prasad");
		  
		  driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("M");
		  
		  driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
		  
		  driver.findElement(By.id("createContactForm_description")).sendKeys("Testing is awesome");
		  
		  driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("seleniumisawesome@gmail.com");
		  
		  WebElement drop=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		  Select dd=new Select(drop);
		  dd.selectByVisibleText("New York");
		  
		  driver.findElement(By.name("submitButton")).click();
		  
		  driver.findElement(By.className("subMenuButton")).click();
		  
		  driver.findElement(By.id("updateContactForm_description")).clear();
		  
		  driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Done with Assignment");
		  
		  driver.findElement(By.xpath("//input[@class='smallSubmit'][@value='Update']")).click();
		  
		  System.out.println("Title of Web Page is :"+driver.getTitle());
	}
}
