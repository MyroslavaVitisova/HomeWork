package lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Cinema {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "/Users/vitisova/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://liniakino.com/showtimes/aladdin/");
        driver.findElement(By.xpath("//div[@class='showtimes']/ul[@class='showtimes-list']/li[@class='showtime-movie'][5]" +
                "//div[@class='day-block showtime-day'][1]//div[@class='showtime-theater']/ul[@class='showtime-time']/li[1]/a")).click();

        Thread.sleep(1000);

        driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='widget-window']/iframe")));
        driver.findElement(By.xpath("//div[@class='window']/div[@class='window-close arcticmodal-close']")).click();

        List<WebElement> freePlaces = driver.findElements(By.xpath("//div[@id='hall-scheme-container']" +
                "//div[@class='seat seat-color1']"));
        List<WebElement> occupiedPlaces = driver.findElements(By.xpath("//div[@id='hall-scheme-container']" +
                "//div[@class='seat seat-occupied']"));

        System.out.println("All places in the hall " + (freePlaces.size() + occupiedPlaces.size()));
        System.out.println("Free places in the hall " + freePlaces.size());
        System.out.println("Occupied places in the hall " + occupiedPlaces.size());

        driver.quit();
    }
}
