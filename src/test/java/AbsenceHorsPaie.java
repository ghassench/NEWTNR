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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

/**
 *
 * @author ahamdeni
 */
public class AbsenceHorsPaie {

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

        WebElement Entree = driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[1]/ul/li[5]/div/div"));

        Entree.click();

        WebElement Embauche = driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[1]/ul/li[5]/ul/li[1]/div/div[1]"));
        Embauche.click();
        Thread.sleep(1000);//

        driver.switchTo().defaultContent();
        driver.switchTo().frame("technologyFrame");
        driver.switchTo().frame("OpFrmsFrame");
        driver.switchTo().frame("AppFrmsFrame");
        driver.switchTo().frame("BannerFrame");
        
        WebElement Matricule = driver.findElement(By.id("PROMPT-1-1"));
        Matricule.sendKeys("01010101");
        
        
//
         WebElement Men = driver.findElement(By.className("HRBUTTON_BUT07"));

        Men.click();
//
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
        

        WebElement Alimenter = driver.findElement(By.className("HRONAVIGATOR_TECH_ADDOCC"));
        Alimenter.click();
        Thread.sleep(2000);
               
        driver.switchTo().defaultContent();

        WebElement frame=driver.findElement(By.xpath("//iframe[@src='https://ppr-hiris.soprahronline.com/hr-rich-client/hrservlet/GetHRPage?TREE=TA0FR&LANG=F&NODE=TA0FR00K_AU41000F&VOC=FRP&PAGE=ACTION&IDENT=4394C68C-6E1B-41EE-9A6D-0039E766BECC']")); 
        driver.switchTo().frame(frame);


    
        WebElement MOTIF = driver.findElement(By.id("D*ZYAGMOTIFA-0-0_0"));
        MOTIF.sendKeys("MAL");
        WebElement DATEDEBUT = driver.findElement(By.id("D*ZYAGDATDEB-0-0_0"));
        DATEDEBUT.sendKeys("05/04/18"); 
        WebElement DATEFIN = driver.findElement(By.id("D*ZYAGDATFIN-0-0_0"));
        DATEFIN.sendKeys("08/04/18");  
        WebElement HORSP = driver.findElement(By.id("D*ZYAGGESTIO-0-0_0"));
        HORSP.click();
        
        
        
        WebElement HORSPS = driver.findElement(By.id("A*COMMIT_0"));
        HORSPS.click();
        Thread.sleep(4000);
        WebElement HORSPSD = driver.findElement(By.className("POPUPFOOTER_BUTTON"));
        HORSPSD.click();

}
}