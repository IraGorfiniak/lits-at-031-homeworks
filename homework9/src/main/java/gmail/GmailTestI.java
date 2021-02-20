package gmail;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class GmailTestI {
    WebDriver driver;

    @Parameters("browser")
    @BeforeMethod

    public void setup(String browser) throws InterruptedException {
        if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        login();
    }

    public void login() throws InterruptedException {
        driver.get("https://accounts.google.com/AccountChooser/identifier?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=AddSession");
        driver.findElement(By.id("identifierId")).sendKeys("irynakandur@gmail.com");
        driver.findElement(By.id("identifierNext")).click();
        WebDriverWait wait = new WebDriverWait(driver, 15);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));

        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ssdd_1234i");
        driver.findElement(By.id("passwordNext")).click();
        Thread.sleep(2000);
    }

    @Test
    public void checkSubjectFound() {

        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@aria-label='Search mail'])")));
        driver.findElement(By.xpath("(//input[@aria-label='Search mail'])")).sendKeys("subject:Test" + Keys.ENTER);
        String subjectText = driver.findElement(By.xpath("//span[@id=':7e']//span[@class='bqe']")).getText();
        System.out.println(subjectText);
        Assert.assertTrue(subjectText.contains("Test"));
    }


    @Test
    public void checkSubjectNotFound() {

        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@aria-label='Search mail'])")));

        driver.findElement(By.xpath("(//input[@aria-label='Search mail'])")).sendKeys("subject:random" + Keys.ENTER);
        boolean Result = driver.findElement(By.xpath("//*[contains(text(),'No messages matched your search')]")).isDisplayed();
        System.out.println("Email with entered subject was not found" + " " + Result);
        Assert.assertTrue(Result);
    }

    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
    }