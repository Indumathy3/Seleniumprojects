package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.findElementByXPath("//input[@type='checkbox'][1]").click();
		Boolean selected=driver.findElementByXPath("(//input[@type='checkbox'])[6]").isSelected();
		if(selected==true)
		{
			System.out.println("Selenium is selected");
		}
		else
		{
			System.out.println("Selenium is not selected");
		}
		driver.findElementByXPath("(//input[@type='checkbox'])[8]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[9]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[10]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[11]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[12]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[13]").click();
        driver.close();
	}

}
