package lesson1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {
    public static void main(String[] args) {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "/Users/vitisova/chromedriver");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://google.com");
        driver.findElement(By.cssSelector("[name='q']")).clear();
        driver.findElement(By.cssSelector("[name='q']")).sendKeys("facebook.com");
        driver.findElement(By.cssSelector("[name='q']")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector(".g h3")).click();
        driver.findElement(By.cssSelector("[name='email']")).clear();
        driver.findElement(By.cssSelector("[name='email']")).sendKeys("testtotest789@gmail.com");
        driver.findElement(By.cssSelector("[name='pass']")).clear();
        driver.findElement(By.cssSelector("[name='pass']")).sendKeys("Aa12345678");
        driver.findElement(By.cssSelector("[aria-label='Войти']")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("[name='mercurymessages']")).click();
        driver.findElement(By.cssSelector("[class='_4djt']")).click();

        try{
            Thread.sleep(3000);
        }
        catch (Exception e){
            System.out.println("Exception in Thgread.sleep()");
        }

        List<WebElement> list = driver.findElements(By.cssSelector("[class='_3oh- _58nk']"));
        System.out.println(list.get(list.size()-1).getText());
    }
}