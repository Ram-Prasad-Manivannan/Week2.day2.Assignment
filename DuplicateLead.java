package week2.day2.assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead 
{
public static void main(String[] args) throws InterruptedException 
	
	{
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        
        driver.get("http://leaftaps.com/opentaps/control/main");
        
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.linkText("Email")).click();
		
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("ramprasadmanivannan@gmail.com");
		
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
        
		Thread.sleep(5000);
		
		
		String FirstLeadId = driver.findElement(By.xpath("(//button[@class='x-btn-text x-tbar-page-first']/preceding::div[@class='x-grid3-scroller']//a)[1]")).getText();				
		
		System.out.println("leadId is :" + FirstLeadId);
		
		driver.findElement(By.xpath("(//button[@class='x-btn-text x-tbar-page-first']/preceding::div[@class='x-grid3-scroller']//a)[1]")).click();
		
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		
		String title = driver.getTitle();
		System.out.println("Title of the page: " + title);
		
		if(driver.getTitle().contains("Duplicate Lead"))
		{
			System.out.println("The title of the page is verified");
		}
		else 
		{
			System.out.println("The title is null");
		} 

		driver.findElement(By.xpath("//input[@class='smallSubmit' and @value='Create Lead']")).click();		
		
		Thread.sleep(5000);
		
		driver.close();
		
		
	}
}
	
