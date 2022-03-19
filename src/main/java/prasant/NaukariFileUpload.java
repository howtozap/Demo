package prasant;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukariFileUpload {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

		public static void main(String[] args) throws Exception  {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.naukri.com/");
			driver.findElement(By.xpath("//input[@class='err-border']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@class='err-border']")).sendKeys("sinhashaan89@gmail.com");
			//driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("03241265208");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn-primary loginButton']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[.='ADD DETAILS']")).click();
			driver.get("https://www.naukri.com/mnjuser/profile?id=&orgn=homepage");
			
			File f=new File("./data/Resume.docx");
			String apath=f.getAbsolutePath();
			driver.findElement(By.xpath("//input[@value='Upload Resume']")).sendKeys("apath");
		
	
	
  		}

	}


