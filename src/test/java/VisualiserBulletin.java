/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static groovy.xml.dom.DOMCategory.parent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import static org.openqa.selenium.Keys.NULL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

/**
 *
 * @author ahamdeni
 */
public class VisualiserBulletin {

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
        WebElement Dossier = driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[10]/div/div"));
        Dossier.click();

        WebElement Entree = driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[10]/ul/li[1]/div/div"));

        Entree.click();

        WebElement Embauche = driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[10]/ul/li[1]/ul/li[1]/div/div[1]"));
        Embauche.click();
        Thread.sleep(1000);//

        driver.switchTo().defaultContent();
        driver.switchTo().frame("technologyFrame");
        driver.switchTo().frame("OpFrmsFrame");

        driver.switchTo().frame("AppFrmsFrame");
        driver.switchTo().frame("BannerFrame");
//
        WebElement Matricule = driver.findElement(By.id("PROMPT-1-1"));
        Matricule.sendKeys("00000108");

        WebElement Men = driver.findElement(By.className("HRBUTTON_BUT07"));
        Men.click();

        Thread.sleep(1000);

        driver.switchTo().defaultContent();
        driver.switchTo().frame("technologyFrame");
        driver.switchTo().frame("OpFrmsFrame");
        driver.switchTo().frame("OperationFrame");
        WebElement a = driver.findElement(By.id("3"));
        a.click();
        
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

    }
}
