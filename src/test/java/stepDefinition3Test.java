/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 *
 * @author ahamdeni
 */
public class stepDefinition3Test {
    
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		System.out.println("*******************");
		System.out.println("launching IEEEEEEEEEEE browser");
		System.setProperty("webdriver.ie.driver","D:\\IEDriverServer.exe ");
                  driver = new InternetExplorerDriver();

		
	}

	@Test
	public void HraTEST() throws InterruptedException {
          
		driver.manage().window().maximize();
		driver.navigate().to("https://ppr-hiris.soprahronline.com/hra-space/portal");
                driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		String strPageTitle = driver.getTitle();
		System.out.println("Page title: - "+strPageTitle);
                    WebElement firstNameTextBox = driver.findElement(By.id("loginid"));
                    firstNameTextBox.sendKeys("TYOUSFI");
                   
                    WebElement PasswordTextBox = driver.findElement(By.id("password"));
                    PasswordTextBox.sendKeys("HRA");
                    
                     WebElement Connex = driver.findElement(By.className("hrportal-self-submit-center"));
                     Connex.click();
                    WebElement Menu=  driver.findElement(By.className("hrsp_root_label"));

                    Menu.click();
                    
                      Thread.sleep(4000);
                      WebElement Dossier = driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[1]/div/div"));
                      Dossier.click();
                    

                     WebElement Entree =  driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[1]/ul/li[1]/div/div"));

                     Entree.click();

                    WebElement Embauche =  driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[1]/ul/li[1]/ul/li[2]/div/div[1]\n" +""));
                    Embauche.click();
                                     Thread.sleep(1000);

            driver.switchTo().defaultContent();
            driver.switchTo().frame("technologyFrame");
            driver.switchTo().frame("OpFrmsFrame");
            driver.switchTo().frame("AppFrmsFrame");
            driver.switchTo().frame("BannerFrame");


                     WebElement BoutonCreer1 =  driver.findElement(By.xpath("//*[@id=\"HRDIV1\"]/table/tbody/tr[1]/td[1]/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input"));
                     //   Thread.sleep(1000);

                BoutonCreer1.click();
                     
                // WebElement BoutonCreer2 =  driver.findElement(By.cssSelector(".HRBUTTON_BUT08"));
                //   BoutonCreer.click();
                                    //   Thread.sleep(1000);


}

	@AfterClass
	public static void tearDown() {
				System.out.println("*******************");

		//o	driver.quit();
		
	}
}
