package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sel1 {
	
	public void selectdropdwn(WebElement we, String val)
	{
		Select s1= new Select(we);
		s1.selectByValue(val);
	}
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement user=driver.findElement(By.cssSelector("input#email")); //find webelement by tag with ID
		user.sendKeys("Deepak");
		WebElement fname=driver.findElement(By.id("u_0_j")); // element by ID
		fname.sendKeys("Ankita");
		WebElement lname=driver.findElement(By.name("lastname")); //find element by name
		lname.sendKeys("Agarwal");
		WebElement email=driver.findElement(By.cssSelector("input[name=reg_email__]"));
		email.sendKeys("abc.123@gmail.com");
		WebElement reemail=driver.findElement(By.cssSelector("input[name=reg_email_confirmation__]"));
		reemail.sendKeys("abc.123@gmail.com");
		WebElement pwd=driver.findElement(By.name("reg_passwd__"));
		pwd.sendKeys("abc123");
		
		WebElement drpdownday= driver.findElement(By.cssSelector("select#day"));
		sel1 key1=new sel1();
		key1.selectdropdwn(drpdownday, "25");
		WebElement drpdownmonth= driver.findElement(By.cssSelector("select#month"));
		key1.selectdropdwn(drpdownmonth, "3");
		WebElement drpdownyr= driver.findElement(By.cssSelector("select#year"));
		key1.selectdropdwn(drpdownyr, "1998");
		WebElement radiof=driver.findElement(By.id("u_0_9"));
		radiof.click();
		WebElement radiom=driver.findElement(By.id("u_0_a"));
		radiom.click();
		WebElement submit1=driver.findElement(By.cssSelector("button[name=websubmit]"));
		submit1.click();
	}
	
}
