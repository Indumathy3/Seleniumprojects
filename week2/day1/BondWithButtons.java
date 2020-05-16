package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class BondWithButtons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.findElementById("home").click();
		driver.navigate().back();
		System.out.println(driver.findElementById("position").getLocation());
		System.out.println(driver.findElementById("color").getCssValue("color"));
		System.out.println(driver.findElementById("size").getSize());
		driver.close();
		
	}

}
