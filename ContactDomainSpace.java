package RegisterReseller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactDomainSpace {
	CheckGroup	CheckGroup = new CheckGroup();														// create check group object
	SubContact SubContact = new SubContact();														// create AU contact object
	
	public void update(WebDriver driver, String domain, String year){
		if ( CheckGroup.checkyear(domain) == true || CheckGroup.domainspace(domain)== "new"){		// if can select year or new gTLD
			 // select year
			new Select(driver.findElement(By.name("domain_period0"))).selectByVisibleText(year);
		}
		if (domain.endsWith("com.au")  || domain.endsWith("net.au") || domain.endsWith("org.au")){	// AU contact
			SubContact.auinfo(driver);
		}else if ( domain.endsWith(".asia")){														// .asia
			SubContact.asiacontact(driver);
		}else if ( domain.endsWith(".uk")){															// .uk
			SubContact.ukcontact(driver);
		}else{																						// com/net/org/biz
			 Contactinfo Contactinfo = new Contactinfo();											// create contact object
			 Contactinfo.Contactinfo(driver);														// enter contact info(basic one)
			 
		}
		if (CheckGroup.domainspace(domain)== "new"){
		    driver.findElement(By.name("newgtld_warrant")).click();									// check box for Warrant*
		}
	    driver.findElement(By.cssSelector("button.btn")).click();									// click submit
	}
}