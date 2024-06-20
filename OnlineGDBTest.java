// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class OnlineGDBTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void onlineGDB() {
    // Test name: OnlineGDB
    // Step # | name | target | value
    // 1 | open | https://www.onlinegdb.com/ | 
    driver.get("https://www.onlinegdb.com/");
    // 2 | setWindowSize | 1296x688 | 
    driver.manage().window().setSize(new Dimension(1296, 688));
    // 3 | click | css=.glyphicon-flash | 
    driver.findElement(By.cssSelector(".glyphicon-flash")).click();
    // 4 | click | linkText=Create New Project | 
    driver.findElement(By.linkText("Create New Project")).click();
    // 5 | mouseOver | linkText=Create New Project | 
    {
      WebElement element = driver.findElement(By.linkText("Create New Project"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 6 | mouseOut | linkText=Create New Project | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 7 | click | css=.ace_content | 
    driver.findElement(By.cssSelector(".ace_content")).click();
    // 8 | mouseDownAt | css=.ace_content | 730,149
    {
      WebElement element = driver.findElement(By.cssSelector(".ace_content"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    // 9 | mouseMoveAt | css=.ace_content | 730,149
    {
      WebElement element = driver.findElement(By.cssSelector(".ace_content"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 10 | mouseUpAt | css=.ace_content | 730,149
    {
      WebElement element = driver.findElement(By.cssSelector(".ace_content"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    // 11 | click | css=.ace_content | 
    driver.findElement(By.cssSelector(".ace_content")).click();
    // 12 | click | css=.ace_content | 
    driver.findElement(By.cssSelector(".ace_content")).click();
    // 13 | runScript | window.scrollTo(0,0) | 
    js.executeScript("window.scrollTo(0,0)");
    // 14 | runScript | window.scrollTo(0,0) | 
    js.executeScript("window.scrollTo(0,0)");
    // 15 | runScript | window.scrollTo(0,0) | 
    js.executeScript("window.scrollTo(0,0)");
    // 16 | runScript | window.scrollTo(0,0) | 
    js.executeScript("window.scrollTo(0,0)");
    // 17 | runScript | window.scrollTo(0,0) | 
    js.executeScript("window.scrollTo(0,0)");
    // 18 | runScript | window.scrollTo(0,0) | 
    js.executeScript("window.scrollTo(0,0)");
    // 19 | runScript | window.scrollTo(0,0) | 
    js.executeScript("window.scrollTo(0,0)");
    // 20 | runScript | window.scrollTo(0,0) | 
    js.executeScript("window.scrollTo(0,0)");
    // 21 | runScript | window.scrollTo(0,0) | 
    js.executeScript("window.scrollTo(0,0)");
    // 22 | runScript | window.scrollTo(0,0) | 
    js.executeScript("window.scrollTo(0,0)");
    // 23 | click | css=#editor_1 .ace_content | 
    driver.findElement(By.cssSelector("#editor_1 .ace_content")).click();
    // 24 | runScript | window.scrollTo(0,0) | 
    js.executeScript("window.scrollTo(0,0)");
    // 25 | mouseOver | id=control-btn-beautify | 
    {
      WebElement element = driver.findElement(By.id("control-btn-beautify"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 26 | mouseOut | id=control-btn-beautify | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 27 | mouseOver | id=control-btn-download | 
    {
      WebElement element = driver.findElement(By.id("control-btn-download"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 28 | mouseOut | id=control-btn-download | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 29 | mouseOver | id=control-btn-beautify | 
    {
      WebElement element = driver.findElement(By.id("control-btn-beautify"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 30 | mouseOut | id=control-btn-beautify | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 31 | mouseOver | id=control-btn-save | 
    {
      WebElement element = driver.findElement(By.id("control-btn-save"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 32 | mouseOut | id=control-btn-save | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 33 | type | css=#editor_1 .ace_content |     printf("Ananya Prabhu Here!");\n\n
    driver.findElement(By.cssSelector("#editor_1 .ace_content")).sendKeys("    printf(\"Ananya Prabhu Here!\");\\n\\n");
    // 34 | click | css=.btn_text | 
    driver.findElement(By.cssSelector(".btn_text")).click();
    // 35 | click | id=project_name | 
    driver.findElement(By.id("project_name")).click();
    // 36 | type | id=project_name | HelloWorld
    driver.findElement(By.id("project_name")).sendKeys("HelloWorld");
    // 37 | click | css=.btn_save:nth-child(3) | 
    driver.findElement(By.cssSelector(".btn_save:nth-child(3)")).click();
    // 38 | click | id=lang-select | 
    driver.findElement(By.id("lang-select")).click();
    // 39 | select | id=lang-select | label=C
    {
      WebElement dropdown = driver.findElement(By.id("lang-select"));
      dropdown.findElement(By.xpath("//option[. = 'C']")).click();
    }
    // 40 | mouseOver | id=control-btn-save | 
    {
      WebElement element = driver.findElement(By.id("control-btn-save"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 41 | mouseOut | id=control-btn-save | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 42 | click | css=.btn_text | 
    driver.findElement(By.cssSelector(".btn_text")).click();
    // 43 | mouseOver | id=control-btn-run | 
    {
      WebElement element = driver.findElement(By.id("control-btn-run"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 44 | mouseOut | id=control-btn-run | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 45 | click | css=#control-btn-run > .glyphicon | 
    driver.findElement(By.cssSelector("#control-btn-run > .glyphicon")).click();
  }
}
