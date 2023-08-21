import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Businessunit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// driver.get("https://google.co.in");
		               
		// Steps to open any url//
		
		
		
		driver.get("http://app.orgzstack.com/");  
		driver.manage().window().maximize();
        
        
//		driver.findElement(By.name("email")).sendKeys("demotest@orgzstack.com");
//		driver.findElement(By.id("outlined-adornment-password")).sendKeys("changeMeNow");
//        driver.findElement(By.name("login_button")).click();
//        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
//        w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/div[2]/div[1]/div[1]/div[4]/li[1]/div[2]")));
//	    driver.findElement(By.xpath("//div[4]//li[1]")).click();
//	    
//	    Thread.sleep(1500);
//		driver.findElement(By.xpath("(//button[@name='AddNew'])[1]")).click();
//		Thread.sleep(500);
//	    driver.findElement(By.xpath("//input[@name='client_name']")).sendKeys("ATMOSPHERE REALTY PVT. LTD.");
//	    driver.findElement(By.name("client_code")).sendKeys("ARP");                  
//	    driver.findElement(By.name("address1")).sendKeys("KRUSHAL COMMERCIAL COMPLEX,");
//	    driver.findElement(By.name("line_2")).sendKeys("chittorgard rajasthan");
//	   
//	    driver.findElement(By.xpath("(//div[@id='demo-simple-select'])[2]")).click();     
//	    Thread.sleep(500);
//	    driver.findElement(By.xpath("//li[normalize-space()='Rajasthan']")).click();
//	    driver.findElement(By.xpath("//input[@name='city']")).sendKeys("chittorgard");
//	    driver.findElement(By.xpath("//input[@name='phone_number']")).sendKeys("8978675634");
//	    driver.findElement(By.xpath("//input[@name='mobile_number']")).sendKeys("6905645342");
//	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rgermain@ariglobalsolutions.com");
//	    driver.findElement(By.xpath("(//input[@name='website'])[1]")).sendKeys("http://www.avacarehealth.co.za/");
//	    driver.findElement(By.xpath("(//input[@name='pan'])[1]")).sendKeys("ABCTY1234D");
//	    driver.findElement(By.xpath("(//input[@name='tan'])[1]")).sendKeys("PDESO3028F");
//	    driver.findElement(By.xpath("(//input[@name='gstin'])[1]")).sendKeys("22AAAAA0000A1Z5");
//	    driver.findElement(By.xpath("//input[@name='industry']")).sendKeys("Health Care");
//	    driver.findElement(By.xpath("//button[@type='submit']")).click();
//	    driver.switchTo().alert().accept(); 
//	    driver.switchTo().alert().accept(); 
//	    
//	    //contact
//	    
//	    driver.findElement(By.xpath("//button[@name='AddNew']")).click();
//	    driver.findElement(By.xpath("(//input[@name='name'])[2]")).sendKeys("Ravish Germain");
//	    driver.findElement(By.xpath("(//input[@name='designation'])[2]")).sendKeys("Senior Manager ");
//	    driver.findElement(By.xpath("(//input[@name='mobile_no'])[2]")).sendKeys("9876453423");
//	    driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("rgermain@ariglobalsolutions.com");
//	    driver.findElement(By.xpath("(//input[@name='department'])[2]")).sendKeys("Marketing");
//	    driver.findElement(By.xpath("(//input[@name='anniversary'])[2]")).sendKeys("17/03/2019");
//	    driver.findElement(By.xpath("(//input[@name='dob'])[2]")).sendKeys("30/12/1988");
//	    driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]")).click();
//	    
//	    
//	    //after filling contact data and then click on save button page should be redirect to the next page "employees" but the  page is redirecting to the previous page "basic info"
//	    Thread.sleep(500);
//	    driver.findElement(By.xpath("(//*[name()='svg'][@class='MuiSvgIcon-root'])[4]")).click();
//	    Thread.sleep(1500);
//	    driver.findElement(By.xpath("(//*[name()='svg'][@class='MuiSvgIcon-root'])[5]")).click();
//	    Thread.sleep(1500);
//	    driver.findElement(By.xpath("(//button[@role='tab'])[3]")).click();
	    
	    
	    //Employees
        
		driver.findElement(By.name("email")).sendKeys("demotest@orgzstack.com");
		driver.findElement(By.id("outlined-adornment-password")).sendKeys("changeMeNow");
        driver.findElement(By.name("login_button")).click();
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
        w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/div[2]/div[1]/div[1]/div[4]/li[1]/div[2]")));
	    driver.findElement(By.xpath("//div[4]//li[1]")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("(//*[name()='svg'][@class='MuiSvgIcon-root'])[5]")).click();
	    Thread.sleep(1500);
	    driver.findElement(By.xpath("(//button[@role='tab'])[3]")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("(//button[@name='AddNew'])[1]")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("(//input[@name='emp_id'])[1]")).sendKeys("ADT123IOPS");
	    driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("Rahul");
	    driver.findElement(By.xpath("(//input[@name='m_name'])[1]")).sendKeys("Kumar");
	    driver.findElement(By.xpath("(//input[@name='l_name'])[1]")).sendKeys("shrivastwa");
	    driver.findElement(By.xpath("(//input[@name='dob'])[1]")).sendKeys("17/07/1980");
	    driver.findElement(By.xpath("(//div[@id='demo-simple-select'])[1]")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("(//li[normalize-space()='Male'])[1]")).click();
	    driver.findElement(By.xpath("(//div[@id='demo-simple-select'])[2]")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("(//li[normalize-space()='B+'])[1]")).click();
	    driver.findElement(By.xpath("(//input[@name='employee_email'])[1]")).sendKeys("rahul.srivastwa@thewadhwagroup.com");
	    driver.findElement(By.xpath("(//input[@name='phone_number'])[1]")).sendKeys("9878675645");
	    driver.findElement(By.xpath("(//input[@name='alternate_number'])[1]")).sendKeys("6234567645");
	    driver.findElement(By.xpath("(//input[@name='address'])[1]")).sendKeys("47/4 Chamunda Nagar Ahamdabad");
	    driver.findElement(By.xpath("(//input[@name='pincode'])[1]")).sendKeys("3800567");
	    driver.findElement(By.xpath("(//div[normalize-space()='India']//div[@id='demo-simple-select'])[1]")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("(//li[normalize-space()='India'])[1]")).click();
	    driver.findElement(By.xpath("(//div[@id='demo-simple-select'])[4]")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("(//li[normalize-space()='Gujarat'])[1]")).click();
	    driver.findElement(By.xpath("(//input[@name='city'])[1]")).sendKeys("Ahamdabad");
	    driver.findElement(By.xpath("(//input[@name='personal_email'])[1]")).sendKeys("rahulrush2@gmail.com");
	    driver.findElement(By.xpath("(//button[@type='button'])[11]")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("(//input[@name='from_date_co'])[1]")).sendKeys("01/01/2017");
	    driver.findElement(By.xpath("(//input[@name='to_date_co'])[1]")).sendKeys("30/12/2019");
	    driver.findElement(By.xpath("//input[@name='comapany_name']")).sendKeys("Wipro pvt limited");
	    driver.findElement(By.xpath("(//input[@name='designation'])[1]")).sendKeys("Jr.Manager");
	    driver.findElement(By.xpath("(//input[@name='last_salary'])[1]")).sendKeys("6.7 LPA");
	    driver.findElement(By.xpath("(//input[@name='reporting_to'])[1]")).sendKeys("Senior Manager");
	    driver.findElement(By.xpath("(//input[@name='mo_no'])[1]")).sendKeys("9878675645");
	    driver.findElement(By.xpath("(//textarea[@name='remark'])[1]")).sendKeys("Excellent work");
	    driver.findElement(By.xpath("(//span[normalize-space()='Add'])[1]")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[2]/button[1]")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("(//div[@id='demo-simple-select'])[5]")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//li[normalize-space()='SSC']")).click();
	    driver.findElement(By.xpath("//input[@name='from_date_edu']")).sendKeys("01/03/2011");
	    driver.findElement(By.xpath("//input[@name='to_date_edu']")).sendKeys("30/06/2013");
	    driver.findElement(By.xpath("(//input[@name='percent'])[1]")).sendKeys("70%");
	    driver.findElement(By.xpath("(//input[@name='institute_name'])[1]")).sendKeys("Kvs");
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[2]/div[4]/button[1]")).click();
	    driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[2]/button[1]")).click();
	    driver.findElement(By.xpath("(//div[@id='demo-simple-select'])[5]")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("(//li[normalize-space()='HSC'])[1]")).click();
	    driver.findElement(By.xpath("(//input[@name='from_date_edu'])[1]")).sendKeys("07/07/2013");
	    driver.findElement(By.xpath("(//input[@name='to_date_edu'])[1]")).sendKeys("06/05/2015");
	    driver.findElement(By.xpath("(//input[@name='institute_name'])[1]")).sendKeys("Kvs");
	    driver.findElement(By.xpath("//input[@name='percent']")).sendKeys("70.2%");
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[3]/div[4]/button[1]")).click();
	    driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[2]/button[1]")).click();
	    driver.findElement(By.xpath("(//div[@id='demo-simple-select'])[5]")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("(//li[normalize-space()='Graduation'])[1]")).click();
	    driver.findElement(By.xpath("(//input[@name='from_date_edu'])[1]")).sendKeys("07/07/2015");
	    driver.findElement(By.xpath("(//input[@name='to_date_edu'])[1]")).sendKeys("06/10/2018");
	    driver.findElement(By.xpath("(//input[@name='institute_name'])[1]")).sendKeys("Patna University");
	    driver.findElement(By.xpath("//input[@name='percent']")).sendKeys("85.2%");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained']")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//button[@type='submit']")).click(); 
	    Thread.sleep(1000);
	    driver.switchTo().alert().accept();  
	    
	    //onboarding 
	    
	    driver.findElement(By.xpath("(//input[@id='outlined-basic'])[1]")).sendKeys("ABCTY1234D");
	    driver.findElement(By.xpath("(//input[@id='outlined-basic'])[2]")).sendKeys("000011112222");
	    driver.findElement(By.xpath("(//input[@id='outlined-basic'])[3]")).sendKeys("AA00011122");
	    driver.findElement(By.xpath("(//input[@id='outlined-basic'])[4]")).sendKeys("Ashok");
	    driver.findElement(By.xpath("(//input[@id='outlined-basic'])[5]")).sendKeys("Kumar");
	    driver.findElement(By.xpath("(//input[@id='outlined-basic'])[6]")).sendKeys("Singh");
	    driver.findElement(By.xpath("(//input[@id='outlined-basic'])[7]")).sendKeys("Ridhi");
	    driver.findElement(By.xpath("(//input[@id='outlined-basic'])[8]")).sendKeys("Roy");
        driver.findElement(By.xpath("(//input[@id='outlined-basic'])[9]")).sendKeys("Singh");
	    driver.findElement(By.xpath("(//div[@id='mui-component-select-marital-status'])[1]")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//li[normalize-space()='Married']")).click();
	    driver.findElement(By.xpath("(//input[@id='outlined-basic'])[10]")).sendKeys("Ritika Priya");
	
	    // Not able to peak a new anniversary date
	    driver.findElement(By.xpath("(//input[@id='date-picker-dialog'])[1]")).sendKeys("12/07/2020");
	    
	    driver.findElement(By.xpath("(//div[@id='mui-component-select-number-of-child-status'])[1]")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("(//li[normalize-space()='1'])[1]")).click();
	    driver.findElement(By.xpath("(//input[@id='outlined-basic'])[11]")).sendKeys("Prasant Tripathi");
	    driver.findElement(By.xpath("(//input[@id='outlined-basic'])[12]")).sendKeys("3 year");
	    driver.findElement(By.xpath("(//input[@id='outlined-basic'])[13]")).sendKeys("Ridhi Roy Singh");
	    
	    // Not able to peak a new birth date
	    driver.findElement(By.xpath("(//input[@id='date-picker-dialog'])[2]")).sendKeys("17/07/1970");
	    Thread.sleep(500);
	    driver.findElement(By.xpath("(//input[@id='outlined-basic'])[14]")).sendKeys("Mother");
	    
	    driver.findElement(By.xpath("(//input[@id='outlined-basic'])[15]")).sendKeys("State Bank of India");
	    driver.findElement(By.xpath("(//input[@id='outlined-basic'])[16]")).sendKeys("900878676874");
	    driver.findElement(By.xpath("(//input[@id='outlined-basic'])[17]")).sendKeys("SBIN00085");
	    driver.findElement(By.xpath("//span[normalize-space()='Add Hobbies']//*[name()='svg']")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("(//input[@id='outlined-basic'])[18]")).sendKeys("Book Reading");
	    driver.findElement(By.xpath("//span[normalize-space()='Add Hobbies']//*[name()='svg']")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("/html/body/div/div/div/main/div/div[2]/div/div/div[2]/div/div[4]/div[2]/div/form/div/div[2]/div/div/input")).sendKeys("Painting");
	    driver.findElement(By.xpath("//span[normalize-space()='Add Sports']//*[name()='svg']")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("(//input[@name='sports'])[1]")).sendKeys("swimming");
	    driver.findElement(By.xpath("//span[normalize-space()='Add Sports']//*[name()='svg']")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("/html/body/div/div/div/main/div/div[2]/div/div/div[2]/div/div[4]/div[3]/div/form/div/div[2]/div/div/input")).sendKeys("Playing Badminton");
//	    driver.findElement(By.xpath("(//span[normalize-space()='Save'])[1]")).click(); 
//	    Thread.sleep(1000);
//	    driver.switchTo().alert().accept();  
	    
	    //mapping
	            
	    driver.findElement(By.xpath("(//button[@role='tab'])[3]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//div[contains(@class,'css-1d8n9bt')])[1]")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("(//div[@id='react-select-2-option-5'])[1]")).click();
//	    driver.findElement(By.xpath("(//div[@id='demo-simple-select'])[2]")).click();
//	    Thread.sleep(500);
//	    driver.findElement(By.xpath("(//div[@id='react-select-3-option-3'])[1]")).click();
//	    driver.findElement(By.xpath("(//div[@id='demo-simple-select'])[3]")).click();
//	    Thread.sleep(500);
//	    driver.findElement(By.xpath("(//div[@id='react-select-4-option-2'])[1]")).click();
	 
	     
	    //employment detail
	                         
	    driver.findElement(By.xpath("(//button[@role='tab'])[4]")).click();
//	    Thread.sleep(1500);
	    driver.findElement(By.xpath("(//*[name()='svg'][@class='MuiSvgIcon-root'])[4]")).click();
	    driver.findElement(By.xpath("(//input[@name='employmentName'])[1]")).sendKeys("Software Developer");
//	    driver.findElement(By.xpath("(//div[@id='demo-simple-select'])[1]")).click();
//	    Thread.sleep(500);
//	    driver.findElement(By.xpath("")).click();
//	    driver.findElement(By.xpath("(//span[@class='MuiIconButton-label'])[3]")).sendKeys("01/01/2022");
	    driver.findElement(By.xpath("(//input[@name='notice_expiry'])[1]")).sendKeys("6");
	    driver.findElement(By.xpath("(//input[@name='probation_type'])[1]")).click();
	    Thread.sleep(500);
	    
	    
	   
	    
	
	}
	

}
