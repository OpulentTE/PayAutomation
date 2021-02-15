package PageObjects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {

    public static WebDriver driver;
    public static Properties propertyObj;

    public Base() {
        try {
            FileInputStream readPropertyFile = new FileInputStream("/Users/deen/IdeaProjects/DekoAutomation/src/main/resources/config.properties");
            propertyObj = new Properties();

            propertyObj.load(readPropertyFile);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void OpenBrowser() {
        String browser = propertyObj.getProperty("browser");
        WebDriverManager.chromedriver().setup();

            switch (browser) {
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "Edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case "chrome":
                default:
                    driver = new ChromeDriver();
                    break;
            }

            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();

            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            driver.get(propertyObj.getProperty("url"));

            System.out.println(driver.getTitle());
        }

        public void CloseBrowser () {
            driver.quit();
        }
    }
