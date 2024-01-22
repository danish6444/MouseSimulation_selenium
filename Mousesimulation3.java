package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousesimulation3 {

	public static void main(String[] args) throws Exception {
		// Setting the property of chrome browser and passing chromedriver path
        System.setProperty("webdriver.chrome.driver", "D:\\Training Materials\\workspace\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.jqueryui.com/draggable/");
		driver.manage().window().maximize();
		
		//switching the frame
		driver.switchTo().frame(0);
		System.out.println("switch to frame");
		
		//draggable web element
		WebElement drag = driver.findElement(By.id("draggable"));
		
		//drag and drop using action class
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.dragAndDropBy(drag, 100, 60).build().perform();
		
		//drag the web element and click and hold using cordinates.
		Thread.sleep(2000);
		act.clickAndHold(drag).dragAndDropBy(drag, 100, 60).build().perform();
		
		
		
		
		
		
		
		

	}

}
