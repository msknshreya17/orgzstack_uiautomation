import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Businessunit {

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
        driver.findElement(By.name("login_button")).click();
		Thread.sleep(9000);
	    driver.findElement(By.xpath("(//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root jss252 jss250 Mui-selected MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button Mui-selected'])[1]")).click();
//	    Thread.sleep(1500);
//		driver.findElement(By.xpath("(//button[@name='AddNew'])[1]")).click();
//		Thread.sleep(500);
//	    driver.findElement(By.xpath("//input[@name='client_name']")).sendKeys("ATMOSPHERE REALTY PVT. LTD.");
//	    driver.findElement(By.name("client_code")).sendKeys("ARP");                  
//	    driver.findElement(By.name("address1")).sendKeys("KRUSHAL COMMERCIAL COMPLEX,");
//	    driver.findElement(By.name("line_2")).sendKeys("chittorgard rajasthan");
//	   
//	    driver.findElement(By.xpath("/(//div[@id='demo-simple-select'])[2]")).click();     
//	    Thread.sleep(500);
//	    driver.findElement(By.xpath("//li[normalize-space()='Rajasthan']")).click();
	    
	    
	}

}
