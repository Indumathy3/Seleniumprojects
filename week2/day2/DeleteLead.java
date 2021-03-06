package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[2]").click();
		driver.findElementByXPath("(//input[@name='phoneNumber'])").sendKeys("99");
        driver.findElementByXPath("//button[text()='Find Leads']").click();
        Thread.sleep(2000);
        String text =driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
        System.out.println(text);
        driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
        driver.findElementByXPath("//a[@class='subMenuButtonDangerous' and text()='Delete']").click();
        driver.findElementByXPath("//a[text()='Find Leads']").click();
        driver.findElementByXPath("//input[@type='text'and @autocomplete='off' and  @name='id' ]").sendKeys(text);
        driver.findElementByXPath("//button[text()='Find Leads']").click();
        driver.close();
        
	}

}
