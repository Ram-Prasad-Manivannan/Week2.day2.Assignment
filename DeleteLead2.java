package week2.day2.assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead2 
{
        public static void main(String[] args) throws InterruptedException 
        {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
	    driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();

		driver.findElement(By.linkText("Phone")).click();
		
		driver.findElement(By.linkText("Phone")).click();
		
		Thread.sleep(5000);
		
		String leadId =  driver.findElement(By.xpath("(//button[@class='x-btn-text x-tbar-page-first']/preceding::div[@class='x-grid3-scroller']//a)[1]")).getText();				
		
		System.out.println("LeadId is :" + leadId);
		
		driver.findElement(By.xpath("(//button[@class='x-btn-text x-tbar-page-first']/preceding::div[@class='x-grid3-scroller']//a)[1]")).click();

		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		if(driver.getTitle().contains("TestLeaf"))
		{
			System.out.println("The title is verified");
		}
		else 
		{
			System.out.println("No records to display");
		} 
		
		Thread.sleep(5000);
		
		driver.close();

	}

}