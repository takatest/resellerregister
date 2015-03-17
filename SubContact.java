package RegisterReseller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SubContact extends Contactinfo{
	
	public void auinfo(WebDriver driver){
		
	    driver.findElement(By.id("registrant_organisation_id")).sendKeys("MELBOURNE IT LTD");
	    driver.findElement(By.id("btn_lookup")).click();
	    new Select(driver.findElement(By.id("au_registrantidtype_id"))).selectByVisibleText("ABN");
	    driver.findElement(By.id("au_registrantidnumber_id")).clear();
	    driver.findElement(By.id("au_registrantidnumber_id")).sendKeys("21073716793");
	  
	    new Select(driver.findElement(By.id("au_eligibilitytype_id"))).selectByVisibleText("Company");
	    driver.findElement(By.name("warrant")).click();
	    driver.findElement(By.name("autoregflag")).click();

	    super.Contactinfo(driver);																			// normal contact
	    driver.findElement(By.name("registrant_organisation")).clear();
	    driver.findElement(By.name("registrant_organisation")).sendKeys("tester");

	    driver.findElement(By.xpath("//fieldset[3]/div/div[2]/input")).clear();
	    driver.findElement(By.xpath("//fieldset[3]/div/div[2]/input")).sendKeys("tester");

	}
	// .Asian
	public void asiacontact(WebDriver driver){
		new Select(driver.findElement(By.name("asia_contacttype"))).selectByVisibleText("Registrant Contact");
		new Select(driver.findElement(By.name("asia_legalentitytype"))).selectByVisibleText("Corporation");
	    driver.findElement(By.name("asia_otherletype")).clear();
	    driver.findElement(By.name("asia_otherletype")).sendKeys("tester");
	    new Select(driver.findElement(By.name("asia_identform"))).selectByVisibleText("Certificate");
	    driver.findElement(By.name("asia_otheridentform")).clear();
	    driver.findElement(By.name("asia_otheridentform")).sendKeys("112223333");
	    driver.findElement(By.name("asia_identnumber")).clear();
	    driver.findElement(By.name("asia_identnumber")).sendKeys("12334444");
	    new Select(driver.findElement(By.name("asia_localitycc"))).selectByVisibleText("Australia");
	
	    super.Contactinfo(driver);																			// normal contact
	}
	// .uk
	public void ukcontact(WebDriver driver){
		new Select(driver.findElement(By.name("uk_regtype"))).selectByVisibleText("PLC");
		driver.findElement(By.name("uk_regnumber")).clear();
		driver.findElement(By.name("uk_regnumber")).sendKeys("12345677");
		  
	    super.Contactinfo(driver);																			// normal contact
	}
	
}
