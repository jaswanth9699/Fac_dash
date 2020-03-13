package selenium.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2 {
  
  WebDriver driver;
  
  
  public void profileinvoke(){
	    
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
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//a[@onclick='openNav()']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//a[@href='profile.php']")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.id("schedulebtn")).click();
	      Thread.sleep(2500);
	      driver.findElement(By.name("adelete")).click();
	      
		  
	      	    } 
	    catch (Exception e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
	  }
  
  public void leaves_fac(){
    
	  try {
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\mrudulsai\\eclipse-workspace\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.manage().deleteAllCookies();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	      
	      driver.get("http://localhost/project/dashboard.php");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//a[@onclick='openNav()']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//a[@href='main.php']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.name("user")).sendKeys("20171521");
	      Thread.sleep(2000);
	      driver.findElement(By.name("pass")).sendKeys("srihitha");
	      Thread.sleep(2000);
	      driver.findElement(By.className("btn")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//a[@onclick='openNav()']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//a[@href='profile.php']")).click();
	      Thread.sleep(2500);
	      driver.findElement(By.id("leavebtn")).click();
	      Thread.sleep(2500);
	      driver.findElement(By.id("apply")).click();
	      Thread.sleep(2500);
	      driver.findElement(By.id("leaves")).click();
	      Thread.sleep(2500);
	      driver.findElement(By.id("remaining")).click();
	      Thread.sleep(2500);
	      driver.findElement(By.id("leaves")).click();
	      Thread.sleep(2500);
	      driver.findElement(By.name("delete")).click();
	      
	      
		  
	      	    } 
	    catch (Exception e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
	  }
  public void secques_fac(){
	    
	  try {
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\mrudulsai\\eclipse-workspace\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.manage().deleteAllCookies();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	      
	      driver.get("http://localhost/project/dashboard.php");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//a[@onclick='openNav()']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//a[@href='main.php']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.name("user")).sendKeys("20171521");
	      Thread.sleep(2000);
	      driver.findElement(By.name("pass")).sendKeys("srihitha");
	      Thread.sleep(2000);
	      driver.findElement(By.className("btn")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//a[@onclick='openNav()']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//a[@href='profile.php']")).click();
	      Thread.sleep(2500);
	      driver.findElement(By.id("secquesbtn")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.id("pwd")).sendKeys("srihitha");
	      Thread.sleep(2500);
	      driver.findElement(By.id("conpwd")).sendKeys("srihitha");
	      Thread.sleep(2500);
	      driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	      Thread.sleep(2500);
	     
	      
	      
		  
	      	    } 
	    catch (Exception e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
	  }
  

  public void hodschedule(){
    
    try {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\mrudulsai\\eclipse-workspace\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
      
      driver.get("http://localhost/project/dashboard.php");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//a[@onclick='openNav()']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//a[@href='main.php']")).click();
      Thread.sleep(2000);
      driver.findElement(By.name("user")).sendKeys("10012001");
      Thread.sleep(2000);
      driver.findElement(By.name("pass")).sendKeys("f2001");
      Thread.sleep(2000);
      driver.findElement(By.className("btn")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//a[@onclick='openNav()']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//a[@href='profile.php']")).click();
      Thread.sleep(2500);
      driver.findElement(By.id("schedulebtn")).click();
      Thread.sleep(2000);
     // driver.findElement(By.id("mdelete")).click();
     // Thread.sleep(2500);
      driver.findElement(By.id("meetnotify")).click();
      Thread.sleep(2500);
      driver.findElement(By.id("sbtbtn")).click();
      Thread.sleep(2500);
    } 
    catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    
  }
  public void hodleave(){
	    
	    try {
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\mrudulsai\\eclipse-workspace\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.manage().deleteAllCookies();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	      
	      driver.get("http://localhost/project/dashboard.php");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//a[@onclick='openNav()']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//a[@href='main.php']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.name("user")).sendKeys("10012001");
	      Thread.sleep(2000);
	      driver.findElement(By.name("pass")).sendKeys("f2001");
	      Thread.sleep(2000);
	      driver.findElement(By.className("btn")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//a[@onclick='openNav()']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//a[@href='profile.php']")).click();
	      Thread.sleep(2500);
	      driver.findElement(By.id("leavebtn")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.name("lapprove")).click();
	      Thread.sleep(2000);
	      
	    } 
	    catch (Exception e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
	    
	    
	  }
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    Day2 obj = new Day2();
    obj.profileinvoke();
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
   obj.leaves_fac();
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    obj.secques_fac();
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    obj.hodschedule();
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
   obj.hodleave();
    
  }

}


