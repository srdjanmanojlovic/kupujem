//Domaći: Otići na kupujemprodajem.com, u pretragu ukucati iphone 13, kliknuti na prvi rezultat.
//        Proveriti da je naslov oglasa onaj koji smo uočili i tokom manuelnog izvođenja kejsa.

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        try {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zli\\Desktop\\QAbootcamp\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.kupujemprodajem.com/");


        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"bodyTag\"]/div[9]/div/div[2]")).click();

        driver.findElement(By.id("searchKeywordsInput")).sendKeys("iphone 13");
//
//      driver.findElement(By.className("searchButton")).click();
        WebElement el = driver.findElement(By.xpath("//*[@id='searchFormHolder']/div/div/div[2]/div[2]/div[2]/div[1]/input"));

        el.click();


        Thread.sleep(5000);
       driver.findElement(By.xpath("//*[@id='adDescription7321776']/div/section[1]")).click();
    //    driver.findElement(By.linkText("Zlatni Oglas")).click();






        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }
}
