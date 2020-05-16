package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/radio.html");
		driver.findElementById("yes").click();
		Boolean val1=driver.findElementByXPath("(//input[@type='radio' and @name ='news'])[1]").isSelected();
		//Boolean val2=driver.findElementByXPath("(//input[@type='radio' and @name ='news'])[2]").isSelected();
		if(val1 ==true)
		{
			System.out.println("The radio button unchecked is selected");}
		
		else
		{
			System.out.println("The radio button checked is selected");
		}
		driver.close();
	}

}
