package RegisterReseller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchRegister {

	public void search(WebDriver driver, String domain){
	    driver.findElement(By.name("domain_name")).sendKeys(domain);
	    driver.findElement(By.cssSelector("span.submitcontainter > button.btn")).click();
	}
}
