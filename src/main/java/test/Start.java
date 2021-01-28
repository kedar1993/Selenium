/**
 * 
 */
package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author tcs_2098597
 *
 */
public class Start {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		String chromeDriver = "W:\\Source\\chromedriver.exe";
		int assystUpdateRow = 1;

//		File file = new File(filePath + "\\" + fileName);
		int runTime = 0;

		// get params from args

		System.setProperty("webdriver.chrome.driver", chromeDriver);

		WebDriver browser = new ChromeDriver();
		browser.manage().window().maximize();

		browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		browser.get("https://www.google.com/");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		browser.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium Automation", Keys.ENTER);

		String actualTitle = browser.getTitle();
		System.out.println("1.actual:" + actualTitle);
		String expectedTitle = "Selenium Automation - Google Search";
		System.out.println("1.expected:" + expectedTitle);
		org.junit.Assert.assertEquals(actualTitle, expectedTitle);

		ScreenShot sc = new ScreenShot();
		sc.getScreenShot(browser);

	}

	@Test
	public void createTicketForTheFailedPDM() throws Exception {

		String chromeDriver = "W:\\Source\\chromedriver.exe";

//		File file = new File(filePath + "\\" + fileName);
		int runTime = 0;

		System.setProperty("webdriver.chrome.driver", chromeDriver);

		WebDriver browser = new ChromeDriver();
		browser.manage().window().maximize();

		browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		browser.get("https://www.google.com/");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		browser.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium Automation", Keys.ENTER);

		String actualTitle = browser.getTitle();
		System.out.println("1.actual:" + actualTitle);
		String expectedTitle = "Selenium Automation - Google Search";
		System.out.println("1.expected:" + expectedTitle);
		org.junit.Assert.assertEquals(actualTitle, expectedTitle);

		ScreenShot sc = new ScreenShot();
		sc.getScreenShot(browser);

	}

}
