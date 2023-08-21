import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class EmployeeSetup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// driver.get("https://google.co.in");
		               
		// Steps to open any url//
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           


		driver.get("http://app.orgzstack.com/");
		driver.manage().window().maximize();


		driver.findElement(By.name("email")).sendKeys("demotest@orgzstack.com");
		driver.findElement(By.id("outlined-adornment-password")).sendKeys("changeMeNow");
		driver.findElement(By.xpath("//input[contains(@type,'checkbox')]")).click();
		driver.findElement(By.xpath("(//a[normalize-space()='Forgot Password ?'])[1]")).click();
		driver.findElement(By.xpath("//input[@value='demo@test.com']")).sendKeys("demotest@orgzstack.com");
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//button[normalize-space()='Submit'])[1]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//button[normalize-space()='Go Back'])[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.name("login_button")).click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//select[@class='border border-gray-150 rounded-lg text-black h-8 pl-4 pr-8 bg-white hover:border-gray-400'])")));
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//div[@role='button'])[4]")).click();	
		driver.findElement(By.xpath("(//div[@role='button'])[4]")).click();
	    

}
	
}
