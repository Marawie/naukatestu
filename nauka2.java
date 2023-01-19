import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class nauka2 {

WebDriver getDriver = driver("firefox");
    @Test
    public WebDriver driver(String browser){
        String pathchrome = "C:\\Users\\Komputer\\Downloads\\chromedriver_win32";
        String pathfirefox = "C:\\Users\\Komputer\\Downloads\\geckodriver-v0.32.0-win32";

       switch (browser){

           case "chrome":
               System.setProperty("webdrier.chrome.driver", pathchrome);
               return new ChromeDriver();
           case "firefox":
               System.setProperty("webdriver.geko.driver", pathfirefox);
               return new FirefoxDriver();
           default:
               throw new InvalidArgumentException("Nie ma takiej przeglądarki!");

       }



    };

}
