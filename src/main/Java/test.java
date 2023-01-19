import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class test {
@Test
    public void openChrome(){
    String path = "C:\\Users\\Komputer\\Downloads\\chromedriver_win32";
    System.setProperty("webdriver.chome.driver", path);
        WebDriver chrome = new ChromeDriver();
        System.out.println("hello");
        chrome.get("https://www.google.pl/");
        chrome.close();



    }
}
