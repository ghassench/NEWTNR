/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
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
        System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe ");
        driver = new InternetExplorerDriver();

    }

    @Test
    public void HraTEST() throws InterruptedException {

        driver.manage().window().maximize();
        driver.navigate().to("https://ppr-hiris.soprahronline.com/hra-space/portal");
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        String strPageTitle = driver.getTitle();
        System.out.println("Page title: - " + strPageTitle);
        WebElement firstNameTextBox = driver.findElement(By.id("loginid"));
        firstNameTextBox.sendKeys("TYOUSFI");

        WebElement PasswordTextBox = driver.findElement(By.id("password"));
        PasswordTextBox.sendKeys("HRA");

        WebElement Connex = driver.findElement(By.className("hrportal-self-submit-center"));
        Connex.click();
        WebElement Menu = driver.findElement(By.className("hrsp_root_label"));

        Menu.click();

        Thread.sleep(4000);
        WebElement Dossier = driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[1]/div/div"));
        Dossier.click();

        WebElement Entree = driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[1]/ul/li[1]/div/div"));

        Entree.click();

        WebElement Embauche = driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[1]/ul/li[1]/ul/li[2]/div/div[1]\n" + ""));
        Embauche.click();
        Thread.sleep(1000);

        driver.switchTo().defaultContent();
        driver.switchTo().frame("technologyFrame");
        driver.switchTo().frame("OpFrmsFrame");
        driver.switchTo().frame("AppFrmsFrame");
        driver.switchTo().frame("BannerFrame");

        WebElement BoutonCreer1 = driver.findElement(By.xpath("//*[@id=\"HRDIV1\"]/table/tbody/tr[1]/td[1]/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input"));

        //   Thread.sleep(1000);
        BoutonCreer1.click();
        

    public class ModalDialog {

        public static void main(String[] args) throws InterruptedException { 
      driver = new InternetExplorerDriver();
      WebDriver driver = new FirefoxDriver(); 
      driver.get("http://samples.msdn.microsoft.com/workshop/samples/author/dhtml/refs/showModalDialog2.htm"); 
      String parent = driver.getWindowHandle(); 
      WebDriverWait wait = new WebDriverWait(driver, 10);
      WebElement push_to_create = wait.until(ExpectedConditions .elementToBeClickable(By .cssSelector("input[value='Push To Create']")));
      push_to_create.click(); 
      waitForWindow(driver);
      switchToModalDialog(driver, parent);
        } 
        public static void waitForWindow(WebDriver driver) throws InterruptedException {
            //wait until number of window handles become 2 or until 6 seconds are completed. int timecount = 1;
            do { driver.getWindowHandles(); 
            Thread.sleep(200);
            } timecount++;
            if (timecount > 30) { break; } } while (driver.getWindowHandles().size() != 2); }
         public static void switchToModalDialog(WebDriver driver, String parent) { 
           //Switch to Modal dialog
            if
            (driver.getWindowHandles().size() == 2) {
              for (String window : driver.getWindowHandles())
              { if (!window.equals(parent)) { driver.switchTo().window(window);
              System.out.println("Modal dialog found"); break; } } } } }

            driver.switchTo().defaultContent();
            System.out.println(driver.getTitle());
            Thread.sleep(1000);

            System.out.
                    println(driver.getTitle());
            ArrayList<String> allWindows = new ArrayList<>(driver.getWindowHandles());

            driver.switchTo().window(allWindows.get(1));

            System.out.println(driver.getTitle());
            driver.switchTo().defaultContent();
            System.out.println(driver.getTitle());

            WebElement DateRecrut = driver.findElement(By.id("D*ZY3XDTEFAS_0"));
            DateRecrut.sendKeys("01/01/2015");
            WebElement Société = driver.findElement(By.id("D*ZY3XIDCY00_0"));
            Société.sendKeys("CGM");
            WebElement Etablissement = driver.findElement(By.id("D*ZY3XIDESTA_0"));
            Etablissement.sendKeys("CGM01");
            // WebElement Matricule   = driver.findElement(By.id("D*ZY00MATCLE-0-0_0"));
            //  Matricule.sendKeys("01010101");
            WebElement Alimenter = driver.findElement(By.className("POPUPFOOTER_BUTTON"));
            Alimenter.click();

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

            WebElement Qualité = driver.findElement(By.id("D*ZY07QUALIT-0-0_0"));
            Qualité.sendKeys("M");
            WebElement Nom = driver.findElement(By.id("D*ZY07NOMUSE-0-0_0"));
            Nom.sendKeys("BRUNO");
            WebElement Prénom = driver.findElement(By.id("D*ZY05NOMPAT-0-0_0"));
            Prénom.sendKeys("PATRICK");
            WebElement Sexe = driver.findElement(By.id("D*ZY10SEXEMP-0-0_0"));
            Sexe.sendKeys("MASCULIN ");
            WebElement Naissance = driver.findElement(By.id("D*ZY10DATNAI-0-0_0"));
            Naissance.sendKeys("01/01/1990");

            System.out.println(driver.getTitle());

        }

        @AfterClass
        public static void tearDown() {
            System.out.println("*******************");

            //o	driver.quit();
        }
    }
