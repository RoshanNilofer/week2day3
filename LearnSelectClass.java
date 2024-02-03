package week2.days3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectClass {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("roshan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("nilofer");
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drop = new Select(source);
		drop.selectByIndex(4);
		WebElement source1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drop1 = new Select(source1);
		drop1.selectByVisibleText("Automobile");
		WebElement source2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drop2 = new Select(source2);
		drop2.selectByValue("OWN_CCORP");
		driver.findElement(By.name("submitButton")).click();
}

}
