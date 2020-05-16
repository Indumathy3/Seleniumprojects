package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='username']").sendKeys("Demosalesmanager");
		driver.findElementByXPath("//input[@id='password' and @class='inputLogin']").sendKeys("crmsfa");
		driver.findElementByXPath("(//input)[3]").click();
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//span[@class='x-tab-strip-text 'and text()='Email']").click();
		driver.findElementByName("emailAddress").sendKeys("indumathy97@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		String s1="Duplicate Lead | opentaps CRM";
		String s2=driver.getTitle();
		if(s1.equals(s2))
		{
			System.out.println("The tab is in Duplicate Lead");
		}
		else
		{
			System.out.println("The tab is not in Duplicate Lead");
		}
		driver.findElementByName("submitButton").click();
		System.out.println(driver.findElementById("viewLead_firstName_sp").getText());
	}
 
}
