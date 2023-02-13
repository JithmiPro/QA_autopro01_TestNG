package com.example.QA_autopro01_.TestNG_web_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.autoconfigure.web.servlet.WebDriverScope;
import org.testng.annotations.Test;

public class CallingBrowser {
    @Test
    public void CallingBrowser(){                            //// chrome version path
        System.setProperty("webdriver.chrome.driver", "src/main/resources/ChromeDriver/109.exe");
        String testURL_index = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        org.openqa.selenium.WebDriver chrome_driver = new ChromeDriver();
        chrome_driver.manage().window().maximize();
        chrome_driver.get(testURL_index);
    }


//    WebDriver driver;

//    @BeforeSuite
//    public void setUp() {
//
//        driver = new FirefoxDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }
//
//    @Test(description="Tests a successful login")
//    public void testLoginOK() {
//
//        driver.get("http://parabank.parasoft.com");
//        driver.findElement(By.name("username")).sendKeys("john");
//        driver.findElement(By.name("password")).sendKeys("demo");
//        driver.findElement(By.xpath("//input[@value='Log In']")).click();
//        Assert.assertEquals("ParaBank | Accounts Overview",driver.getTitle());
//        driver.findElement(By.partialLinkText("Log Out")).click();
//    }
//
//    @AfterSuite
//    public void tearDown() {
//
//        driver.quit();
//    }


}
