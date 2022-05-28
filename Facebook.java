package week2.day2.assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook 
{
 public static void main(String[] args) 
 {
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.linkText("Create New Account")).click();
	
	driver.findElement(By.name("firstname")).sendKeys("Ram Prasad");
	driver.findElement(By.name("lastname")).sendKeys("M");
	driver.findElement(By.name("reg_email__")).sendKeys("seleniumisawesome@gmail.com");
	driver.findElement(By.id("password_step_input")).sendKeys("Selenium_is_awesome");
	
	Select dd0=new Select(driver.findElement(By.id("day")));
	dd0.selectByVisibleText("29");
	
	Select dd1=new Select(driver.findElement(By.id("month")));
	dd1.selectByValue("9");
	
	Select dd2=new Select(driver.findElement(By.id("year")));
	dd2.selectByVisibleText("1994");
	
	driver.findElement(By.className("_58mt")).click();
 }
}