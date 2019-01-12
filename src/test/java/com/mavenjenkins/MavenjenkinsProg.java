package com.mavenjenkins;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class MavenjenkinsProg {
	WebDriver driver;
		@BeforeMethod
		public void SetUp() {
			System.setProperty("webdriver.chrome.driver", "G:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https:/www.google.com");
		}
		
		@Test(priority=1,groups="title")
		public void GoogletitleTest() {
			String Title=driver.getTitle();
			System.out.println(Title);
		}
		
		@Test(priority=3,groups="logo")
		public void GoogleLogoTest() {
			boolean b=driver.findElement(By.id("hplogo")).isDisplayed();
			System.out.println(b);
		}
		
		/*@Test(priority=2,groups="link test")
		public void mailLinkTest() {
			boolean b=driver.findElement(By.linkText("mail")).isDisplayed();
			System.out.println(b);
		}*/
		
		@Test(priority=3,groups="test")
		public void Test2() {
			
			System.out.println("simple test");
		}
		
		@Test(priority=4,groups="test")
		public void Test3() {
			
			System.out.println("simpler test");
		}
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}

	}

	

