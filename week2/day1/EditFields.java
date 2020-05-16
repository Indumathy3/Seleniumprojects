package week2.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditFields {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElementById("email").sendKeys("indumathy97@gmail.com");
		driver.findElementByXPath("(//div[@class=\"large-6 small-12 columns\"]/input)[2]").sendKeys("text",Keys.TAB);
		System.out.println(driver.findElementByName("username").getAttribute("value"));
		driver.findElementByXPath("(//input[@name=\"username\"])[2]").clear();
		System.out.println(driver.findElementByXPath("//input[@disabled=\"true\"]").isEnabled());
        driver.close();
	}

	

}
