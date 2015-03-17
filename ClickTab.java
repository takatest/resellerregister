package RegisterReseller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickTab {

	CheckGroup	CheckGroup = new CheckGroup();
	
	public void tab(WebDriver driver, String domain){
	    
		// Global Domain
		if ( CheckGroup.domainspace(domain).equals("global")){							// Global 
			driver.findElement(By.xpath("//a[text()='Global Domains']")).click();
		}else if (CheckGroup.domainspace(domain).equals("au") ){						// AU domain
			driver.findElement(By.xpath("//a[text()='Australian Domains']")).click();		 
		}else if (CheckGroup.domainspace(domain).equals("country")){				    // Country code domain
			driver.findElement(By.xpath("//a[text()='Country Code Domains']")).click(); 		
		}else if (CheckGroup.domainspace(domain).equals("sponsored")){					// Sponsored Domain	
				driver.findElement(By.xpath("//a[text()='Sponsored Domains']")).click();
		}else if (CheckGroup.domainspace(domain).equals("new")){						// New Domains
			driver.findElement(By.xpath("//a[text()='New Domains']")).click();
		}
	}
}
