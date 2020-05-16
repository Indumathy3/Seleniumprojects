package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Testleaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Indumathy");
		driver.findElementById("createLeadForm_lastName").sendKeys("Krishnaraj");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("indumathy97@gmail.com");
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dropdown = new Select(source);
		dropdown.selectByVisibleText("Employee");
		WebElement marketSource =driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropdown2 = new Select(marketSource);
		dropdown2.selectByValue("9001");
		Select dropdown3 = new Select(driver.findElementById("createLeadForm_ownershipEnumId"));
		dropdown3.selectByIndex(6);
		Select country = new Select(driver.findElementById("createLeadForm_generalCountryGeoId"));
		country.selectByVisibleText("India");
		driver.findElementByName("submitButton").click();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);		
        driver.close();
	}

}
