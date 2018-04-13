
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.api.PendingException;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ABS {

    public static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        System.out.println("*******************");
        System.out.println("launching IEEEEEEEEEEE browser");
        System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe ");
        driver = new InternetExplorerDriver();

    }

    @Test
    @Given("^User Is On HomePage$")
    public void User_Is_On_HomePage() throws Throwable {
        driver.navigate().to("https://ppr-hiris.soprahronline.com/hra-space/portal/wsid:1/root/professional/business-domains/PAY?entering=true");
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        String strPageTitle = driver.getTitle();
        System.out.println("Page title: - " + strPageTitle);
    }

    @Test
    @Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_and(String loginid, String password) throws Throwable {

        WebElement firstNameTextBox = driver.findElement(By.id("loginid"));
        firstNameTextBox.sendKeys("loginid");

        WebElement PasswordTextBox = driver.findElement(By.id("password"));
        PasswordTextBox.sendKeys("password");

        WebElement Connex = driver.findElement(By.className("hrportal-self-submit-center"));
    }

    @Then("^I click Button \"([^\"]*)\" Located By ClassName$")
    public void I_click_Button_Located_By_ClassName(String arg1) {
        WebElement Connex = driver.findElement(By.className("hrportal-self-submit-center"));
        Connex.click();
        throw new PendingException();
    }

    @Then("^User Click On Menu$")
    public void User_Click_On_Menu() throws InterruptedException {
        WebElement Menu = driver.findElement(By.className("hrsp_root_label"));

        Menu.click();

        Thread.sleep(4000);
        throw new PendingException();
    }

    @Then("^User Click On Dossier$")
    public void User_Click_On_Dossier() {
        WebElement Dossier = driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[1]/div/div"));
        Dossier.click();
        throw new PendingException();
    }

    @Then("^User Click On Absence$")
    public void User_Click_On_Absence() {
        WebElement Entree = driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[1]/ul/li[5]/div/div"));

        Entree.click();
        throw new PendingException();
    }

    @Then("^User Click On Saisir une absence$")
    public void User_Click_On_Saisir_une_absence() {
        WebElement Embauche = driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[1]/ul/li[5]/ul/li[1]/div/div[1]"));
        Embauche.click();
        throw new PendingException();
    }

    @Then("^User Type Matricule '(\\d+)'$")
    public void User_Type_Matricule_(int arg1) {
        driver.switchTo().defaultContent();
        driver.switchTo().frame("technologyFrame");
        driver.switchTo().frame("OpFrmsFrame");
        driver.switchTo().frame("AppFrmsFrame");
        driver.switchTo().frame("BannerFrame");

        WebElement Matricule = driver.findElement(By.id("PROMPT-1-1"));
        Matricule.sendKeys("01010101");
        throw new PendingException();
    }

    @Then("^User Click On Rechercher$")
    public void User_Click_On_Rechercher() {
        WebElement Men = driver.findElement(By.className("HRBUTTON_BUT07"));

        Men.click();
        throw new PendingException();
    }

    @Then("^User Switch To body$")
    public void User_Switch_To_body() throws InterruptedException {
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
        throw new PendingException();
    }

    @Then("^User Type Motif 'ABR'$")
    public void User_Type_Motif_ABR() {
        WebElement MOTIF = driver.findElement(By.id("D*ZYAGMOTIFA-0-0_0"));
        MOTIF.sendKeys("MAL");
        throw new PendingException();
    }

    @Then("^User Type DateDebut '(\\d+)/(\\d+)/(\\d+)'$")
    public void User_Type_DateDebut_(int arg1, int arg2, int arg3) {
        WebElement DATEDEBUT = driver.findElement(By.id("D*ZYAGDATDEB-0-0_0"));
        DATEDEBUT.sendKeys("05/04/18");
        throw new PendingException();
    }

    @Then("^User Type DateFin '(\\d+)/(\\d+)/(\\d+)'$")
    public void User_Type_DateFin_(int arg1, int arg2, int arg3) {
        WebElement DATEFIN = driver.findElement(By.id("D*ZYAGDATFIN-0-0_0"));
        DATEFIN.sendKeys("08/04/18");
        throw new PendingException();
    }

    @Then("^User Check HorsPaie$")
    public void User_Check_HorsPaie() {
        WebElement HORSP = driver.findElement(By.id("D*ZYAGGESTIO-0-0_0"));
        HORSP.click();
        throw new PendingException();
    }

    @Then("^User Click On Soumettre$")
    public void User_Click_On_Soumettre() {
        driver.switchTo().defaultContent();
        driver.switchTo().frame("technologyFrame");
        driver.switchTo().frame("OpFrmsFrame");
        driver.switchTo().frame("AppFrmsFrame");
        driver.switchTo().frame("BannerFrame");

        WebElement MenA = driver.findElement(By.id("A*COMMIT_2"));

        MenA.click();
        throw new PendingException();
    }
}
