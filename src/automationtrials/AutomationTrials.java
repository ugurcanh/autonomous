/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automationtrials;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
import org.openqa.selenium.chrome.ChromeDriver;
/**
 *
 * @author xuhosafci
 */
public class AutomationTrials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {
        // TODO code application logic here
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\xuhosafci\\Desktop\\ChromeDrive_new\\chromedriver.exe");
 
        // Initialize browser
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.phptravels.net/en");
        SignUp sign = new SignUp(driver);
        
        
        sign.fillScreen(driver);
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
        
        
        
        
        
 /*       driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.xpath("(//*[@id=\"dropdownCurrency\"])[last()]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div/div[2]/div/ul/li[3]/div/div/div/a[2]")).click();
        
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/section/div/div/div[2]/div/form/div[3]/div[1]/div/label/input")).sendKeys("ugurcan");
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/section/div/div/div[2]/div/form/div[3]/div[2]/div/label/input")).sendKeys("hosafci");
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/section/div/div/div[2]/div/form/div[4]/label/input")).sendKeys("5396619833");
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/section/div/div/div[2]/div/form/div[5]/label/input")).sendKeys("asdsfsdf");
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/section/div/div/div[2]/div/form/div[6]/label/input")).sendKeys("aaa2");
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/section/div/div/div[2]/div/form/div[7]/label/input")).sendKeys("aaa2");
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/section/div/div/div[2]/div/form/div[8]/button")).click();
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);*/

        
    }
    
}
