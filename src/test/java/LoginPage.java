import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {


public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

// driver.get("https://google.co.in");

// Steps to open any url//
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              


driver.get("http://app.orgzstack.com/");
driver.manage().window().maximize();


         //signup page

//driver.findElement(By.xpath("(//img[@alt='Signup Image'])[1]")).click();
//driver.findElement(By.name("name")).sendKeys("Humane Security Society Industrial Hub");
//driver.findElement(By.name("no_of_employee")).sendKeys("25000");
//driver.findElement(By.xpath("//div[@id='demo-simple-select']")).click();
//Thread.sleep(1500); 
//driver.findElement(By.xpath("//li[normalize-space()='India']")).click();
//driver.findElement(By.name("orgemail")).sendKeys("sikchhalol608@muzitp.com");
//driver.findElement(By.name("authorisedPerson_name")).sendKeys("Ashish Agnihotri");
//driver.findElement(By.name("authorisedPerson_mobile_no")).sendKeys("9856344356");
//Thread.sleep(1500); 
////ok handle alert
//driver.switchTo().alert().accept();
//driver.switchTo().alert().accept();
//driver.findElement(By.xpath("//button[normalize-space()='Signup']")).click();
//driver.findElement(By.xpath("//a[normalize-space()='Have an account? Sign In']")).click();
//Thread.sleep(1500);                  
//driver.findElement(By.xpath("(//button[normalize-space()='Login'])[1]")).click();

driver.findElement(By.name("email")).sendKeys("demotest@orgzstack.com");
driver.findElement(By.id("outlined-adornment-password")).sendKeys("changeMeNow");
driver.findElement(By.xpath("//input[contains(@type,'checkbox')]")).click();
driver.findElement(By.xpath("(//a[normalize-space()='Forgot Password ?'])[1]")).click();
driver.findElement(By.xpath("//input[@value='demo@test.com']")).sendKeys("demotest@orgzstack.com");
Thread.sleep(1500);
driver.findElement(By.xpath("(//button[normalize-space()='Submit'])[1]")).click();
Thread.sleep(1500);
driver.findElement(By.xpath("(//button[normalize-space()='Go Back'])[1]")).click();
Thread.sleep(1500);
driver.findElement(By.name("login_button")).click();      



//       Create orgination

WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[name()='svg'][@class='MuiSvgIcon-root'])[3]")));
//driver.findElement(By.xpath("(//*[name()='svg'][@class='MuiSvgIcon-root'])[3]")).click();
Thread.sleep(1500);
driver.findElement(By.name("name")).sendKeys("Testing Club");
driver.findElement(By.name("code")).sendKeys("TCLUB345");
driver.findElement(By.name("no_of_employee")).sendKeys("30000");
driver.findElement(By.name("org_email")).sendKeys("testingclub@ipsgroup.co.in");
driver.findElement(By.name("mobile_number")).sendKeys("8789674534");
driver.findElement(By.name("address1")).sendKeys("C32 Pavitra Township Maneja Crossing");
driver.findElement(By.name("address2")).sendKeys("Near City Hospital");
driver.findElement(By.name("org_city")).sendKeys("Baroda");
driver.findElement(By.xpath("(//div[@id='demo-simple-select'])[1]")).click();
Thread.sleep(1500);
driver.findElement(By.xpath("//li[normalize-space()='Gujarat']")).click();
driver.findElement(By.xpath("(//div[@id='demo-simple-select'])[2]")).click();
Thread.sleep(1500);
driver.findElement(By.xpath("(//li[normalize-space()='India'])[1]")).click();
Thread.sleep(1500);
driver.findElement(By.xpath("//input[@name='org_pincode']")).sendKeys("800056");
driver.findElement(By.xpath("(//div[@id='demo-simple-select'])[3]")).click();
driver.findElement(By.xpath("(//li[normalize-space()='Pvt Ltd'])[1]")).click();
driver.findElement(By.name("gstin")).sendKeys("22AAAAA0000A1Z5");
driver.findElement(By.xpath("//input[@name='org_pan']")).sendKeys("AAJFN2389N");
driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-colorInherit']")).click();
driver.findElement(By.xpath("(//div[normalize-space()='Organisation Setup'])[1]")).click();







}

}
