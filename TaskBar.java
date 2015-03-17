package RegisterReseller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskBar{
	/*
	 * go back to Register page
	 */
	public void register(WebDriver driver){
		  driver.findElement(By.id("a_register")).click();
	}
	/*
	 * go to Manage page
	 */
	public void manage(WebDriver driver){
	    driver.findElement(By.id("a_manage")).click();								// click Manage on the top of task bar
	}
}
