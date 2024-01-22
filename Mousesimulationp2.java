package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousesimulationp2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Training Materials\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("http://www.jqueryui.com/droppable/");
	    
	    //switch to frame
	    driver.switchTo().frame(0);
	    System.out.println("switched to frame");
	    
	    //draggable web element
	    WebElement drag = driver.findElement(By.id("draggable"));
	    //dropable web element
	    WebElement drop = driver.findElement(By.id("droppable"));
	    
	    //drag & drop using action class
	    Thread.sleep(2000);
	    Actions act = new Actions(driver);
	    act.dragAndDrop(drag, drop).build().perform();
	    
	    
	}

}
