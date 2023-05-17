package newproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewOrange {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        driver.get("http://localhost/orangehrm/orangehrm-5.4/web/index.php/auth/login");

		         driver.findElement(By.name("username")).sendKeys("sameerasp");
		         driver.findElement(By.name("password")).sendKeys("Jesusmylord1*");

		         driver.findElement(By.cssSelector("button.orangehrm-login-button")).click();
		         
		         driver.findElement(By.xpath("//span[contains(@class,'oxd-main-menu-item--name') and text()='PIM']")).click();
		         driver.findElement(By.xpath("//li[@class='oxd-topbar-body-nav-tab']/a[text()='Add Employee']")).click();
		         driver.findElement(By.name("firstName")).sendKeys("Sameera");
		         driver.findElement(By.name("middleName")).sendKeys("S");
		         driver.findElement(By.name("lastName")).sendKeys("P");
		         try {
		             Thread.sleep(5000);
		         } catch (InterruptedException e) {
		             e.printStackTrace();
		         }
		         driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
		         
    }
}	