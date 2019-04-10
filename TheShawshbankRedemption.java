package lesson1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;

public class TheShawshbankRedemption {

    public static void main(String[] args) {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "/Users/vitisova/chromedriver");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.imdb.com/title/tt0111161/");

        List<String> elements = new ArrayList<>();
        elements.add(driver.findElement(By.xpath("//div[@class='originalTitle']")).getText());
//      elements.add(driver.findElement(By.xpath("//div[@class='originalTitle']/text()[normalize-space() !='']")).getText());
        elements.add(driver.findElement(By.xpath("//div[@class='article']/div[@class='txt-block'][4]")).getText());
//      elements.add(driver.findElement(By.xpath("//div[@class='txt-block'][4]/text()[normalize-space() !='']")).getText());
        elements.add(driver.findElement(By.xpath("//time[@datetime='PT142M']")).getText());
        elements.add(driver.findElement(By.xpath("//span[@itemprop='ratingValue']")).getText());
        elements.add(driver.findElement(By.xpath("//div[@class='subtext']/a[1]")).getText());
        elements.add(driver.findElement(By.xpath("//div[@class='slate']/a")).getAttribute("href"));
        elements.add(driver.findElement(By.xpath("//div[@class='slate']/a/img")).getAttribute("src"));
        elements.add(driver.findElement(By.xpath("//div[@class='credit_summary_item'][1]/a")).getText());
        elements.add(driver.findElement(By.xpath("//div[@class='credit_summary_item'][3]/a[1]")).getText());
        elements.add(driver.findElement(By.xpath("//div[@class='credit_summary_item'][3]/a[2]")).getText());
        elements.add(driver.findElement(By.xpath("//div[@class='credit_summary_item'][3]/a[3]")).getText());
        elements.add(driver.findElement(By.xpath("//div[@class='metacriticScore score_favorable titleReviewBarSubItem']")).getText());
        elements.add(driver.findElement(By.xpath("//div[@class='titleReviewBarItem titleReviewbarItemBorder']//a[1]")).getText().replaceAll("[\\D]", ""));
        elements.add(driver.findElement(By.xpath("//div[@class='titleReviewBarItem titleReviewbarItemBorder']//a[2]")).getText().replaceAll("[\\D]", ""));
        elements.add(driver.findElement(By.xpath("//div[@class='rec_item rec_selected']/a/img")).getAttribute("title"));
        elements.add(driver.findElement(By.xpath("//div[@data-tconst='tt0068646']/a/img")).getAttribute("title"));
        elements.add(driver.findElement(By.xpath("//div[@data-tconst='tt0137523']/a/img")).getAttribute("title"));

        elements.forEach(elem -> System.out.println(elem));

        driver.quit();
    }
}

