package week2.day2.assignment1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Acme
{
	public static void main(String[] args) 
	{
		  WebDriverManager.chromedriver().setup();
		  ChromeDriver driver=new ChromeDriver();
		  
		  driver.get("https://acme-test.uipath.com/login");
		  
		  driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		  driver.findElement(By.id("password")).sendKeys("leaf@12");
		  driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		  
		  System.out.println("Title of Web Page is :"+driver.getTitle());
		  
		  driver.findElement(By.xpath("//li/a[contains(text(),'Log Out')]")).click();
		  
		  driver.close();
	}	  
}
