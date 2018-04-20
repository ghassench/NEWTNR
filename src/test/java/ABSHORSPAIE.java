
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ABSHORSPAIE {

    public static WebDriver driver;

    

    
    @Given("^I am on the homepageHP$")
    public void I_am_on_the_homepageHP() {
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

    @When("^I loginHP$")
    public void I_loginHP() {
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
    
    @Then("^User Click On MenuHP$")
    public void User_Click_On_MenuHP() throws Throwable {
        
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

    @Then("^User Click On DossierHP$")
    public void User_Click_On_DossierHP() throws Throwable {
       
             WebElement Dossier = driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[1]/div/div"));
            Dossier.click();
        

    }

    @Then("^User Click On AbsenceHP$")
    public void User_Click_On_AbsenceHP() throws Throwable {
        try {
            WebElement Entree = driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[1]/ul/li[5]/div/div"));

            Entree.click();
        } catch (Exception e) {
            //This catch block catches all the exceptions
        }

    }

    
    @Then("^User Click On Saisir une absenceHP$")
    public void User_Click_On_Saisir_une_absenceHP() throws Throwable {
        try {
            WebElement Embauche = driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[1]/ul/li[5]/ul/li[1]/div/div[1]"));
            Embauche.click();
        } catch (Exception e) {
            //This catch block catches all the exceptions
        }

    }

    
    @Then("^User Type MatriculeHP '(\\d+)'$")
    public void User_Type_MatriculeHP(String Matricule) throws Throwable {
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

    
    @Then("^User Click On RechercherHP$")
    public void User_Click_On_RechercherHP() throws Throwable {
        try {
            WebElement Men = driver.findElement(By.className("HRBUTTON_BUT07"));

            Men.click();
        } catch (Exception e) {
            //This catch block catches all the exceptions
        }
    }

    
    @Then("^User Switch To bodyHP$")
    public void User_Switch_To_bodyHP() throws Throwable {
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

    
    @Then("^User Type MotifHP$")
    public void User_Type_MotifHP() throws Throwable {
        try {
            WebElement MOTIF = driver.findElement(By.id("D*ZYAGMOTIFA-0-0_0"));
            MOTIF.sendKeys("ABR");
        } catch (Exception e) {
            //This catch block catches all the exceptions
        }

    }

    
    @Then("^User Type DateDebutHP '(.+)'$")
    public void User_Type_DateDebutHP(String DateDebut) throws Throwable {
        try {
            WebElement DATEDEBUT = driver.findElement(By.id("D*ZYAGDATDEB-0-0_0"));
            DATEDEBUT.sendKeys(DateDebut);

        } catch (Exception e) {
            //This catch block catches all the exceptions
        }

    }

    
    @Then("^User Type DateFinHP '(.+)'$")
    public void User_Type_DateFinHP(String DateFin) throws Throwable {
        try {
            WebElement DATEFIN = driver.findElement(By.id("D*ZYAGDATFIN-0-0_0"));
            DATEFIN.sendKeys("DateFin");

        } catch (Exception e) {
            //This catch block catches all the exceptions
        }

    }

   
    @Then("^User Check HorsPaieHP$")
    public void User_Check_HorsPaieHP() throws Throwable {
        try {
            WebElement HORSP = driver.findElement(By.id("D*ZYAGGESTIO-0-0_0"));
            HORSP.click();

        } catch (Exception e) {
            //This catch block catches all the exceptions
        }
    }

    
    @Then("^User Click On SoumettreHP$")
    public void User_Click_On_SoumettreHP() throws Throwable {
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
