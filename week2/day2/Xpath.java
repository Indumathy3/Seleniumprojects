package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='username']").sendKeys("Demosalesmanager");
		driver.findElementByXPath("//input[@id='password' and @class='inputLogin']").sendKeys("crmsfa");
		driver.findElementByXPath("(//input)[3]").click();
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[@href='/crmsfa/control/createLeadForm']").click();
		driver.findElementByXPath("(//input[@type='text'][@name='companyName'])[2]").sendKeys("Testleaf");
		driver.findElementByXPath("//input[@type='text'and @id='createLeadForm_firstName' and @class='inputBox']").sendKeys("Indumathy");
		driver.findElementByXPath("//input[@type='text'and @id='createLeadForm_firstName' and @class='inputBox']/following::input").sendKeys("Krishnaraj");
		driver.findElementByXPath("//input[@name='submitButton']").click();
	    driver.close();
	
	}

}
	


