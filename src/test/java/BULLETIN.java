/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.api.PendingException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 *
 * @author ahamdeni
 */
public class BULLETIN {

    public static WebDriver driver;

    @Given("^I am on the homepageB$")
    public void I_am_on_the_homepageB() {
        System.out.println("*******************");
        System.out.println("launching IEEEEEEEEEEE browser");
        System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe ");
        driver = new InternetExplorerDriver();
        driver.navigate().to("https://ppr-hiris.soprahronline.com/hra-space/portal/wsid:1/root/professional/business-domains/PAY?entering=true");
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        String strPageTitle = driver.getTitle();
        System.out.println("Page title: - " + strPageTitle);
        throw new PendingException();
    }

    @When("^I loginB$")
    public void I_loginB() {
        WebElement firstNameTextBox = driver.findElement(By.id("loginid"));
        firstNameTextBox.sendKeys("TYOUSFI");

        WebElement PasswordTextBox = driver.findElement(By.id("password"));
        PasswordTextBox.sendKeys("HRA");

        WebElement Connex = driver.findElement(By.className("hrportal-self-submit-center"));
        Connex.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BULLETIN.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Then("^User Click On MenuB$")
    public void User_Click_On_MenuB() throws Throwable {
        WebElement Menu = driver.findElement(By.className("hrsp_root_label"));

        Menu.click();
    }

    @Then("^User Click On PaieB$")
    public void User_Click_On_PaieB() throws Throwable {
        WebElement Dossier = driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[10]/div/div"));
        Dossier.click();
    }

    @Then("^User Click On VoirTousLesResultatB$")
    public void User_Click_On_VoirTousLesResultatB() throws Throwable {
        WebElement Entree = driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[10]/ul/li[1]/div/div"));

        Entree.click();
    }

    @Then("^User Click On BulletinB$")
    public void User_Click_On_BulletinB() throws Throwable {
        WebElement Embauche = driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[10]/ul/li[1]/ul/li[1]/div/div[1]"));
        Embauche.click();
        Thread.sleep(1000);
    }

    @Then("^User Type MatriculeB '(\\d+)'$")
    public void User_Type_MatriculeB_(String Matricule) throws Throwable {
        driver.switchTo().defaultContent();
        driver.switchTo().frame("technologyFrame");
        driver.switchTo().frame("OpFrmsFrame");

        driver.switchTo().frame("AppFrmsFrame");
        driver.switchTo().frame("BannerFrame");
//
        WebElement Matriculee = driver.findElement(By.id("PROMPT-1-1"));
        Matriculee.sendKeys(Matricule);
    }

    @Then("^User Click On RechercherB$")
    public void User_Click_On_RechercherB() throws Throwable {
        WebElement Men = driver.findElement(By.className("HRBUTTON_BUT07"));
        Men.click();

        Thread.sleep(1000);
    }

    @Then("^User Switch To BBulletin$")
    public void User_Switch_To_BBulletin() {
        driver.switchTo().defaultContent();
        driver.switchTo().frame("technologyFrame");
        driver.switchTo().frame("OpFrmsFrame");
        driver.switchTo().frame("OperationFrame");
        WebElement a = driver.findElement(By.id("3"));
        a.click();
    }

    @Then("^User Recupere NetAPayerB$")
    public void User_Recupere_NetAPayerB() {
        driver.switchTo().defaultContent();
        driver.switchTo().frame("technologyFrame");
        driver.switchTo().frame("OpFrmsFrame");
        driver.switchTo().frame("AppFrmsFrame");
        driver.switchTo().frame("ViewerFrmsFrame");
        driver.switchTo().frame("MainFrame");
        driver.switchTo().frame("body");

        String time = driver.findElement(By.id("Z*EdtNetAmt-0-0")).getAttribute("value");

        if (time == null) {
            System.out.println("pas de bulletin a afficher");

        } else {
            System.out.println(time);
        }
        throw new PendingException();
    }

}
