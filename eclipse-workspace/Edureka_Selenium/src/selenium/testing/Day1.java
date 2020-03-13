package selenium.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day1 {
  
  WebDriver driver;
  
  
  public void searchinvoke(){
	    
	    try {
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\mrudulsai\\eclipse-workspace\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.manage().deleteAllCookies();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	      
	      driver.get("http://localhost/project/dashboard.php");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//em[@class='material-icons'][@onclick='openSearch()']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.name("fac_id")).sendKeys("10012001");
	      Thread.sleep(1000);
	      driver.findElement(By.name("fac_fname")).sendKeys("Lily");
	      Thread.sleep(1000);
	      driver.findElement(By.name("fac_lname")).sendKeys("Thomson");
	      Thread.sleep(1000);
	      Select dept = new Select(driver.findElement(By.name("fac_dept")));
		  dept.selectByVisibleText("CSE");
		  Thread.sleep(1000);
		  Select pos = new Select(driver.findElement(By.name("fac_pos")));
		  pos.selectByVisibleText("HOD");
		  Thread.sleep(1000);
	      driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	      Thread.sleep(3500);
	      driver.findElement(By.xpath("//*[@id='profile'][@name='profile']")).click();

	    } 
	    catch (Exception e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
	  }
  
  public void posfacinvoke(){
    
    try {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\mrudulsai\\eclipse-workspace\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
      
      driver.get("http://localhost/project/dashboard.php");
      Thread.sleep(3500);
      driver.findElement(By.xpath("//a[@onclick='openNav()']")).click();
      Thread.sleep(3500);
      driver.findElement(By.xpath("//a[@href='main.php']")).click();
      Thread.sleep(2500);
      driver.findElement(By.name("user")).sendKeys("20171521");
      Thread.sleep(2500);
      driver.findElement(By.name("pass")).sendKeys("srihitha");
      Thread.sleep(3500);
      driver.findElement(By.className("btn")).click();
    } 
    catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
  
  public void poshodinvoke(){
	    
	    try {
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\mrudulsai\\eclipse-workspace\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.manage().deleteAllCookies();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	      
	      driver.get("http://localhost/project/dashboard.php");
	      Thread.sleep(3500);
	      driver.findElement(By.xpath("//a[@onclick='openNav()']")).click();
	      Thread.sleep(3500);
	      driver.findElement(By.xpath("//a[@href='main.php']")).click();
	      Thread.sleep(2500);
	      driver.findElement(By.name("user")).sendKeys("10012001");
	      Thread.sleep(2500);
	      driver.findElement(By.name("pass")).sendKeys("f2001");
	      Thread.sleep(3500);
	      driver.findElement(By.className("btn")).click();
	    } 
	    catch (Exception e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
	  }
  
  public void negunameinvoke(){
    
    try {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\mrudulsai\\eclipse-workspace\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
      
      driver.get("http://localhost/project/dashboard.php");
      Thread.sleep(3500);
      driver.findElement(By.xpath("//a[@onclick='openNav()']")).click();
      Thread.sleep(3500);
      driver.findElement(By.xpath("//a[@href='main.php']")).click();
      Thread.sleep(2500);
      driver.findElement(By.name("user")).sendKeys("20181523");
      Thread.sleep(2500);
      driver.findElement(By.name("pass")).sendKeys("srihitha");
      Thread.sleep(3500);
      driver.findElement(By.className("btn")).click();
    } 
    catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }




  public void negpswdinvoke(){
    
    try {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\mrudulsai\\eclipse-workspace\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
      
      driver.get("http://localhost/project/dashboard.php");
      Thread.sleep(3500);
      driver.findElement(By.xpath("//a[@onclick='openNav()']")).click();
      Thread.sleep(3500);
      driver.findElement(By.xpath("//a[@href='main.php']")).click();
      Thread.sleep(2500);
      driver.findElement(By.name("user")).sendKeys("20171521");
      Thread.sleep(2500);
      driver.findElement(By.name("pass")).sendKeys("jaswanth");
      Thread.sleep(3500);
      driver.findElement(By.className("btn")).click();
    } 
    catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    
  }
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    Day1 obj = new Day1();
    obj.searchinvoke();
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    obj.posfacinvoke();
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    obj.poshodinvoke();
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    obj.negunameinvoke();
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    obj.negpswdinvoke();
    
  }

}


