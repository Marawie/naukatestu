import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class nauka1 {

WebDriver driver = getDriver("ChromeDrivere");
    @Test
    public WebDriver getDriver(String browser) {
        WebDriver chromeDriver = new ChromeDriver();
        WebDriver firefoxDriver = new FirefoxDriver();
        try {


            if (browser.equals(chromeDriver)) {
                chromeDriver.get("https://www.google.pl/");
                chromeDriver.close();
                return chromeDriver;

            } else if (browser.equals(firefoxDriver)) {
                firefoxDriver.get("https://www.google.pl/");
                firefoxDriver.close();
                return firefoxDriver;
            }
        } catch (IllegalArgumentException x) {
            System.out.println("Nie ma takiej przeglądarki");
        } finally {
            System.out.println("Test skończony!");
        }

    return null;
    }



}
