package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousesiulation2 {

	public static void main(String[] args) throws Exception {
		// setting the property of chrome and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "D:\\Training Materials\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://www.flipkart.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
        Thread.sleep(2000);
        
        // create electronics web element ref
         WebElement electro = driver.findElement(By.xpath("*//*[text()='Electronics']"));
         
         // mouse simulation using action class
         Actions act = new Actions(driver);
         
         //mouse hover to Electronics
         Thread.sleep(2000);
         act.moveToElement(electro).build().perform();
         
         //keyboard operation
         Thread.sleep(2000);
         driver.navigate().refresh();
         Thread.sleep(2000);
         WebElement fash = driver.findElement(By.xpath("*//*[text()='Fashion']"));
         Thread.sleep(2000);
         act.sendKeys(fash,Keys.ENTER).build().perform();
         System.out.println("fashion option click");
         
         //right click on web page
         Thread.sleep(2000);
         act.contextClick().build().perform();
         
         
         
         
         
	
	}

}
