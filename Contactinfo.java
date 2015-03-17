package RegisterReseller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Contactinfo {
		
		// contractor 
		public void Contactinfo( WebDriver driver){
			
		    driver.findElement(By.name("register_domain0")).click();								// check boxk
		    driver.findElement(By.name("registrant_name")).clear();
		    driver.findElement(By.name("registrant_name")).sendKeys("taka");

		    driver.findElement(By.name("registrant_organisation")).clear();
		    driver.findElement(By.name("registrant_organisation")).sendKeys("tester");

		    driver.findElement(By.name("registrant_email")).clear();
		    driver.findElement(By.name("registrant_email")).sendKeys("takashi.komuro@melbourneit.com.au");
		    driver.findElement(By.name("registrant_phone")).clear();
		    driver.findElement(By.name("registrant_phone")).sendKeys("+61.123456778");
		    driver.findElement(By.name("registrant_address_line1")).clear();
		    driver.findElement(By.name("registrant_address_line1")).sendKeys("269 la trobe st");
		    driver.findElement(By.name("registrant_address_city")).clear();
		    driver.findElement(By.name("registrant_address_city")).sendKeys("Melbourne");
		    driver.findElement(By.name("registrant_address_stateprovince")).clear();
		    driver.findElement(By.name("registrant_address_stateprovince")).sendKeys("VIC");
		    driver.findElement(By.name("registrant_address_postalcode")).clear();
		    driver.findElement(By.name("registrant_address_postalcode")).sendKeys("3000");
		    driver.findElement(By.name("copy_details")).click();
		    driver.findElement(By.name("admin_givenname")).clear();
		    driver.findElement(By.name("admin_givenname")).sendKeys("admin");
		    driver.findElement(By.name("admin_familyname")).clear();
		    driver.findElement(By.name("admin_familyname")).sendKeys("komu");
		    driver.findElement(By.name("admin_organisation")).clear();
		    driver.findElement(By.name("admin_organisation")).sendKeys("admintester");
		}
	}


