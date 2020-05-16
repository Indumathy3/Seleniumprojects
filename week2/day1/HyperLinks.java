package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.findElementByXPath("//a[@link='blue']").click();
		driver.navigate().back();
        driver.findElementByXPath("(//a[@link='blue'])[2]").click();
		driver.navigate().back();
        driver.findElementByXPath("//a[text()='Verify am I broken?']").click();
		String title = driver.getTitle();
	    String title1 = "HTTP Status 404 – Not Found";
		if (title.equals(title1)) {
			System.out.println("The page is broken");
		} else {
			System.out.println("The page is not broken");
		}
		driver.navigate().back();
        driver.findElementByXPath("(//a[@link='blue'])[3]").click();
		driver.navigate().back();
		driver.close();
	}

}
