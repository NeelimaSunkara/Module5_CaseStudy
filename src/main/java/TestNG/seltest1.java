package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class seltest1 {
	WebDriver driver;
   @BeforeMethod
   public void launch() {
	   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://18.191.228.236:3001/");
		  driver.manage().window().maximize(); //maximize the window
		  //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
   }

  @Test
  public void verifylogin() {
	  //add test cases here for module5 case study
	  driver.findElement(By.name("login")).sendKeys("neelima");
	  driver.findElement(By.name("password")).sendKeys("neelima");
	  driver.findElement(By.name("click")).click();
	  driver.findElement(By.xpath("//div[@class='row']")).isDisplayed();
	  
	  System.out.println(driver.findElement(By.xpath("//div[@class='row']")).isDisplayed());
  }
   @AfterMethod
   public void close() {
	   driver.close();
   }
  
}
