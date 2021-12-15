package ActionCommands;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openURL { 
 //To open Firefox browser
 WebDriver driver = new FirefoxDriver();
 
 @Before
 public void beforetest() {

 //To Maximize Browser Window
  driver.manage().window().maximize();

 //To Open URL In browser
  driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
 }
 
 @After
 public void aftertest() {
  driver.quit();
  
 }
 
 @Test
 public void test() 
  {
   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
   String  datentime = driver.findElement(By.className("date-header")).getText();//Locating element by className and store its text to variable datentime.
   System.out.print(datentime);
  }
 
 }