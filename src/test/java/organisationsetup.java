import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class organisationsetup {


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
driver.findElement(By.xpath("//option[@value='64c22b859eadf63a01fb8dcf']")).click();
driver.findElement(By.xpath("//div[normalize-space()='Organisation Setup']")).click();
Thread.sleep(1500);
driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();


driver.findElement(By.name("name")).sendKeys(" Pvt limited");
driver.findElement(By.name("code")).sendKeys("897");
driver.findElement(By.name("no_of_employee")).sendKeys("786");
driver.findElement(By.name("address1")).sendKeys("  Digha brize");
driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();	
Thread.sleep(1500);
driver.switchTo().alert().accept();  




//zone

    driver.findElement(By.xpath("(//button[@role='tab'])[2]")).click();
//  driver.findElement(By.xpath("//div[contains(text(),'Zone')]")).click();    

Thread.sleep(3000);

driver.findElement(By.name("zone_name")).sendKeys("East-North Zone");
driver.findElement(By.name("zone_code")).sendKeys("East-North-0089");
driver.findElement(By.name("description")).sendKeys("3rd Largest Zone");
driver.findElement(By.xpath("//button[normalize-space()='Add New']")).click();

 
// Branch

  driver.findElement(By.xpath("(//button[@role='tab'])[3]")).click();
  Thread.sleep(3000);
  driver.findElement(By.xpath("(//input[@id='standard-basic'])[1]")).sendKeys(" Electronic Digital Co-operative Branch");
  driver.findElement(By.xpath("(//input[@id='standard-basic'])[2]")).sendKeys("ECo-Digital-0098");
  driver.findElement(By.xpath("(//input[@id='standard-basic'])[3]")).sendKeys("Kotwali thana,satyam complex");
  driver.findElement(By.xpath("(//input[@id='standard-basic'])[4]")).sendKeys("chennai");
  driver.findElement(By.xpath("//button[normalize-space()='Add New']")).click();


  

  //  division

driver.findElement(By.xpath("(//button[@role='tab'])[4]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@id='standard-basic'])[1]")).sendKeys("Navi-Mumbai Division");
driver.findElement(By.xpath("(//input[@id='standard-basic'])[2]")).sendKeys("NVI-990");
driver.findElement(By.xpath("(//input[@id='standard-basic'])[3]")).sendKeys("Main Division");
driver.findElement(By.xpath("//button[normalize-space()='Add New']")).click();

// Department

driver.findElement(By.xpath("(//button[@role='tab'])[5]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@id='standard-basic'])[1]")).sendKeys("IT Marketing");
driver.findElement(By.xpath("(//input[@id='standard-basic'])[2]")).sendKeys("ITMARK-0098");
driver.findElement(By.xpath("(//input[@id='standard-basic'])[3]")).sendKeys("Whole IT Marketing Department");
driver.findElement(By.xpath("//button[normalize-space()='Add New']")).click();

 // designation

driver.findElement(By.xpath("(//button[@role='tab'])[6]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@id='standard-basic'])[1]")).sendKeys("ProjectManager");
driver.findElement(By.xpath("(//input[@id='standard-basic'])[2]")).sendKeys("PROMAN-5678");
driver.findElement(By.xpath("(//input[@id='standard-basic'])[3]")).sendKeys("Handle All HR Groups");
driver.findElement(By.xpath("//button[normalize-space()='Add New']")).click();

  // client

driver.findElement(By.xpath("(//button[@role='tab'])[7]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//button[@name='AddNew']")).click();
driver.findElement(By.name("client_name")).sendKeys("Stan Lee ");
driver.findElement(By.name("client_code")).sendKeys(" Stan-Lee-5674");
driver.findElement(By.name("address1")).sendKeys("Beverly Hills,central mall,Navi Mumbai");
driver.findElement(By.name("line_2")).sendKeys("Near Catholic Church");
driver.findElement(By.id("demo-simple-select")).click();
Thread.sleep(1500);
driver.findElement(By.xpath("(//li[normalize-space()='India'])[1]")).click();
driver.findElement(By.xpath("(//div[@id='demo-simple-select'])[2]")).click();
Thread.sleep(1500);
driver.findElement(By.xpath("(//li[normalize-space()='Maharashtra'])[1]")).click();
driver.findElement(By.name("city")).sendKeys("Mumbai");
driver.findElement(By.name("phone_number")).sendKeys("8014568765");
driver.findElement(By.name("mobile_number")).sendKeys("8798765645");
driver.findElement(By.name("email")).sendKeys("stanlee.co.in@gmail.com");
driver.findElement(By.name("website")).sendKeys("www.stanlee.build.in");
driver.findElement(By.name("pan")).sendKeys("BHXPS7083N");
driver.findElement(By.name("tan")).sendKeys("PDESO3028F");
driver.findElement(By.name("gstin")).sendKeys("07AAECR2971C1Z");
driver.findElement(By.name("industry")).sendKeys("Animation Film Industry");

   //    Upload Image
//driver.findElement(By.xpath("(//img[@class='add-image-css'])[1]")).click();
//Thread.sleep(3000);
//  

driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary'])[1]")).click();
Thread.sleep(1500);
driver.findElement(By.name("name")).sendKeys("Prakit Vats");
driver.findElement(By.name("designation")).sendKeys("General Manager");
driver.findElement(By.name("mobile_no")).sendKeys("8796764514");
driver.findElement(By.name("emailId")).sendKeys("parakitvats345@gmail.com");
driver.findElement(By.name("department")).sendKeys("Marketing Department");
driver.findElement(By.name("anniversary")).sendKeys("03/11/2017");
driver.findElement(By.name("dob")).sendKeys("13/07/1992");
Thread.sleep(1500);
    driver.findElement(By.xpath("(//button[normalize-space()='Add'])[1]")).click();
    driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary'])[1]")).click();
    Thread.sleep(1500);
    driver.findElement(By.name("name")).sendKeys("Rohan Vashist");
driver.findElement(By.name("designation")).sendKeys("General Manager");
driver.findElement(By.name("mobile_no")).sendKeys("7867564534");
driver.findElement(By.name("emailId")).sendKeys("rohanvashist345@gmail.com");
driver.findElement(By.name("department")).sendKeys("Marketing Department");
driver.findElement(By.name("anniversary")).sendKeys("04/08/2017");
driver.findElement(By.name("dob")).sendKeys("09/03/1990");
driver.findElement(By.xpath("(//button[normalize-space()='Add'])[1]")).click();
   

driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]"));
driver.switchTo().alert().accept();










}

}
