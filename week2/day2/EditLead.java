package week2.day2;


import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		driver.findElementByXPath("(//input[@type='text'and @autocomplete='off' and  @name='firstName' ])[3]").sendKeys("Indumathy");
		driver.findElementByXPath("(//td[@class='x-btn-center'])[7]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		System.out.println(driver.getTitle());
		driver.findElementByXPath("//a[@class='subMenuButton'][3]").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Volante");
		driver.findElementByXPath("//input[@class='smallSubmit'and @name ='submitButton']").click();
		Thread.sleep(3000);
		System.out.println(driver.findElementById("viewLead_companyName_sp").getText());
		driver.close();
		

	}

}
