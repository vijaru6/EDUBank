package packAndGoPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class LoginVerification {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.linkText("Login")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.id("usernameLogin")).sendKeys("pgGru");
	  driver.findElement(By.id("passwordLogin")).sendKeys("freezeray");
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ruttala.vijay\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("file:///C:/Users/ruttala.vijay/Downloads/PackAndGov21649135836042/PackAndGo_v2/index.html");
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
