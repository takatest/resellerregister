package RegisterReseller;

import static org.testng.AssertJUnit.assertEquals;

import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ManageresellerDomain.logintoResellerPage;
import ManageresellerDomain.ResultPage;

/*
 * reseller register Test
 */
public class RegisterMainReseller {

		private FirefoxDriver 		driver;									// FireFox driver
		private String 				baseUrl = "https://reseller.php5.mit/";	//URL stage
		private String 				reseller = "test";						// reseller ID
		private String				resellerpw = "test";					// reseller password
		private static int			domain_num = 2;			
		private static String[] 	domain = {"takatestjavatesta2","takarenewreseller","takatestb5","takatestb10"};// domain name
		private static String []	domainspace = {"sydney","net.au","net","com","net.au"};	// domain space
		private int 				year = 2;											// year	
		private static String 		years;
		private static	String 		today;
		private static int 			unique_num;
		
		private logintoResellerPage	logintoResellerPage = new logintoResellerPage();	// login to reseller
		private SearchRegister		SearchRegister		= new SearchRegister();			// search domain
		private	ResultPage			ResultPage			= new ResultPage();				// Result page
		private ClickTab			ClickTab			= new ClickTab();				// change Tab
		private ContactDomainSpace	ContactDomainSpace	= new ContactDomainSpace();		// contact update
		private TaskBar				TaskBar				= new TaskBar();				// go back to search page

		@BeforeTest
		public void BeforeTest() {
			driver = new FirefoxDriver();
			driver.get(baseUrl+"login");							// open reseller page
			logintoResellerPage.login(driver,reseller,resellerpw);	// login to reseller page

			driver.findElement(By.id("domainsearch_nav")).click();	// click search and register Tab
			
			// create year 
			if ( year == 1){
				years = year +" year";
			}else{
				years = year +" years";
			}
		}

	/*	@BeforeMethod
		public void BeforeMethod(){
//			driver.get(baseUrl); 
		}
	*/	
		// set up data
		@DataProvider(name = "GetDomain")
		// crate date object
		public static Object[][] domainName() {
			Object[][] data = new Object[domain_num][2];
			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
			today = formatter.format( new java.util.Date() );
			unique_num = (int) (Math.random() * 50 + 1);
			for (int k = 0; k<domain_num; k++){
				data[k][0] = k; 
				data[k][1]= "takatest" + today + unique_num +"."+domainspace[k];
			}
			return data;
		}

	/********************************************************************************************
	 * 	
	 * Manage domain name test for reseller
	 * 
	 ********************************************************************************************/
		@Test(dataProvider = "GetDomain")
		public void registerreseller(int count, String domain){
		
			System.out.println((count+1)+"-"+domain+" - "+years);
		    
		    ClickTab.tab(driver, domain);						// click Tab
		    
		    SearchRegister.search(driver, domain);				// search domain
		    
		    ContactDomainSpace.update(driver, domain, years);
		    
		    ResultPage.regresult(driver, domain);				// result page
		    TaskBar.register(driver);							// go back to 
		    System.out.println("");
		}
		
		// wait method
		public void waitwhle(int time){
		    try {
		    	Thread.sleep(time);	// wait 10 second
		    } catch (InterruptedException e) {
		    }
		}
		
		@AfterClass
		public void afterClass() {
			System.out.println("Register Domain Completed");
		    System.out.println("");
			driver.quit();
		}
	}
