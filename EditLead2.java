package week2.day2.assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		//driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		 
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
			
		driver.findElement(By.linkText("Leads")).click();
		
		
		driver.findElement(By.linkText("Find Leads")).click();

		
		driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input[@name='firstName']")).sendKeys("Ram Prasad");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//button[@class='x-btn-text x-tbar-page-first']/preceding::div[@class='x-grid3-scroller']//a)[1]")).click();				
		
		String title = driver.getTitle();
		System.out.println("Title of the page: " + title);
		
		if(driver.getTitle().contains("View Lead"))
		{
			System.out.println("The title of the page is verified");
		}else 
		{
			System.out.println("The title is null");
		} 
		
		boolean isTitleEnabled = driver.findElement(By.xpath("//title[text()='View Lead | opentaps CRM']")).isEnabled();
		System.out.println(isTitleEnabled);
		
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		//Thread.sleep(5000);
		
		
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Test Leaf Technologies - Edit changes");
		
		
		driver.findElement(By.xpath("//input[@class='smallSubmit' and @value='Update']")).click();		
		
		Thread.sleep(5000);
		
		driver.close();		
	}	

}

