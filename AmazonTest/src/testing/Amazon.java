package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class Amazon {
	
	
  @Test
  
  public void verifyLogin() throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Judu\\Desktop\\geckodriver-v0.21.0-win64\\geckodriver.exe");
	WebDriver d = new FirefoxDriver();
	d.get("https://www.amazon.in");
	
	Thread.sleep(3000);
    WebElement e =d.findElement(By.xpath("//a [@id='nav-link-yourAccount']"));
    e.click();
    Thread.sleep(3000);
    boolean un= d.findElement(By.xpath("//input[@id='ap_email']")).isDisplayed();
    System.out.println(un);
    if(un){
    	System.out.println("Amazon login un is dissplayed");
    }else{
    	System.out.println("not dissplayed");
    }
    d.findElement(By.xpath("//input[@id='ap_email")).sendKeys("kirtideep94@gmail.com");
    	d.findElement(By.xpath("//input[@id='continue']")).click();
    	Thread.sleep(3000);
    	boolean pwd= d.findElement(By.xpath("//input[@id='ap_password']")).isDisplayed();
    	System.out.println(pwd);
    	if(pwd){
    		System.out.println("pwd is dissplayed");
    	}else{
    		System.out.println("not dissplayed");
    	}
    	d.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(" kirti345");
    	
    	d.findElement(By.xpath("//input[@id='signInSubmit']")).click();
    	
    }
  
  @Test
  public void verifyResult() throws InterruptedException{
	  System.setProperty("WebDriver.gecko.driver","C:\\Users\\Judu\\Desktop\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("https://www.amazon.in");
		Thread.sleep(3000);
	    WebElement e =d.findElement(By.xpath("//a [@id='nav-link-yourAccount']"));
	    e.click();
	    d.findElement(By.xpath("//input[@id='ap_email")).sendKeys("kirtideep94@gmail.com");
    	d.findElement(By.xpath("//input[@id='continue']")).click();
    	Thread.sleep(3000);
d.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("kirti345");
    	
    	d.findElement(By.xpath("//input[@id='signInSubmit']")).click();
    	Thread.sleep(3000);
    	d.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("kindle");
    	d.findElement(By.xpath("//input[@value='Go']")).click();
    	Thread.sleep(3000);
    	Actions ac= new Actions(d);
    	WebElement cl = d.findElement(By.xpath("//option[@value='search-alias=fashion']"));
    	ac.moveToElement(cl).click();
    	ac.perform();
    	ac.sendKeys("K").perform();
    	ac.sendKeys(Keys.ENTER).perform();
    	 
    	String expecText= "Showing most relevant results. See all results for kindle.";
    	String actText= d.findElement(By.xpath("//a[contains(text(),'kindle')]")).getText();
    	if(actText.equals(expecText)){
    		System.out.println("PASS");}else{
    			System.out.println("failed");}
    	}
    			
	  
  }
      
    
    
    
				
	  
	  
	  
  

