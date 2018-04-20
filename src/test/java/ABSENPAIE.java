
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.api.PendingException;
import static java.lang.System.console;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ABSENPAIE {

    public static WebDriver driver;

    

    
    @Given("^I am on the homepage$")
    public void I_am_on_the_homepage() {
        try {
            System.out.println("*******************");
        System.out.println("launching IEEEEEEEEEEE browser");
        System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe ");
        driver = new InternetExplorerDriver();
            driver.navigate().to("https://ppr-hiris.soprahronline.com/hra-space/portal/wsid:1/root/professional/business-domains/PAY?entering=true");
            driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            String strPageTitle = driver.getTitle();
            System.out.println("Page title: - " + strPageTitle);
        } catch (Exception e) {
            System.out.println("erreuur");        }
    }

    @When("^I login$")
    public void I_login() {
        try {
            WebElement firstNameTextBox = driver.findElement(By.id("loginid"));
            firstNameTextBox.sendKeys("TYOUSFI");

            WebElement PasswordTextBox = driver.findElement(By.id("password"));
            PasswordTextBox.sendKeys("HRA");

            WebElement Connex = driver.findElement(By.className("hrportal-self-submit-center"));
            Connex.click();
            Thread.sleep(1000);

        } catch (Exception e) {
            //This catch block catches all the exceptions
        }
    }

//  
    
    @Then("^User Click On Menu$")
    public void User_Click_On_Menu() throws Throwable {
        
            WebElement Menu = driver.findElement(By.className("hrsp_root_label"));

            Menu.click();
       

    }
//    @Then("^__wait '(.*)'$")
//    public void __wait_X(String typeWait) throws Throwable{
//        switch(typeWait){
//            case "low" : 
//                Thread.sleep(ITContext.getSleepDurationLow());
//        }
//    }

    @Then("^User Click On Dossier$")
    public void User_Click_On_Dossier() throws Throwable {
       
             WebElement Dossier = driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[1]/div/div"));
            Dossier.click();
        

    }

    @Then("^User Click On Absence$")
    public void User_Click_On_Absence() throws Throwable {
        try {
            WebElement Entree = driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[1]/ul/li[5]/div/div"));

            Entree.click();
        } catch (Exception e) {
            //This catch block catches all the exceptions
        }

    }

    
    @Then("^User Click On Saisir une absence$")
    public void User_Click_On_Saisir_une_absence() throws Throwable {
        try {
            WebElement Embauche = driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[1]/ul/li[5]/ul/li[1]/div/div[1]"));
            Embauche.click();
        } catch (Exception e) {
            //This catch block catches all the exceptions
        }

    }

    
    @Then("^User Type Matricule '(\\d+)'$")
    public void User_Type_Matricule(String Matricule) throws Throwable {
        try {
            driver.switchTo().defaultContent();
            driver.switchTo().frame("technologyFrame");
            driver.switchTo().frame("OpFrmsFrame");
            driver.switchTo().frame("AppFrmsFrame");
            driver.switchTo().frame("BannerFrame");

            WebElement Matriculee = driver.findElement(By.id("PROMPT-1-1"));
            Matriculee.sendKeys(Matricule);
        } catch (Exception e) {
            //This catch block catches all the exceptions
        }

    }

    
    @Then("^User Click On Rechercher$")
    public void User_Click_On_Rechercher() throws Throwable {
        try {
            WebElement Men = driver.findElement(By.className("HRBUTTON_BUT07"));

            Men.click();
        } catch (Exception e) {
            //This catch block catches all the exceptions
        }
    }

    
    @Then("^User Switch To body$")
    public void User_Switch_To_body() throws Throwable {
        try {
            driver.switchTo().defaultContent();
            System.out.println(driver.getTitle());
            Thread.sleep(1000);

            System.out.
                    println(driver.getTitle());
            ArrayList<String> allWindows = new ArrayList<>(driver.getWindowHandles());

            driver.switchTo().window(allWindows.get(0));
            System.out.println(driver.getTitle());
            Thread.sleep(4000);

            driver.switchTo().defaultContent();
            driver.switchTo().frame("technologyFrame");
            driver.switchTo().frame("OpFrmsFrame");
            driver.switchTo().frame("AppFrmsFrame");
            driver.switchTo().frame("ViewerFrmsFrame");
            driver.switchTo().frame("MainFrame");
            driver.switchTo().frame("body");
        } catch (Exception e) {
            //This catch block catches all the exceptions
        }

    }

    
    @Then("^User Type Motif$")
    public void User_Type_Motif() throws Throwable {
        try {
            WebElement MOTIF = driver.findElement(By.id("D*ZYAGMOTIFA-0-0_0"));
            MOTIF.sendKeys("MAL");
        } catch (Exception e) {
            //This catch block catches all the exceptions
        }

    }

    
    @Then("^User Type DateDebut '(.+)'$")
    public void User_Type_DateDebut(String DateDebut) throws Throwable {
        try {
            WebElement DATEDEBUT = driver.findElement(By.id("D*ZYAGDATDEB-0-0_0"));
            DATEDEBUT.sendKeys(DateDebut);

        } catch (Exception e) {
            //This catch block catches all the exceptions
        }

    }

    
    @Then("^User Type DateFin '(.+)'$")
    public void User_Type_DateFin(String DateFin) throws Throwable {
        try {
            WebElement DATEFIN = driver.findElement(By.id("D*ZYAGDATFIN-0-0_0"));
            DATEFIN.sendKeys(DateFin);

        } catch (Exception e) {
            //This catch block catches all the exceptions
        }

    }

   

    
    @Then("^User Click On Soumettre$")
    public void User_Click_On_Soumettre() throws Throwable {
        try {
            driver.switchTo().defaultContent();
            driver.switchTo().frame("technologyFrame");
            driver.switchTo().frame("OpFrmsFrame");
            driver.switchTo().frame("AppFrmsFrame");
            driver.switchTo().frame("BannerFrame");

            WebElement MenA = driver.findElement(By.id("A*COMMIT_2"));

            MenA.click();

        } catch (Exception e) {
            //This catch block catches all the exceptions
        }

    }
}
