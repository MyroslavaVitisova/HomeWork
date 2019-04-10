package lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Currency {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "/Users/vitisova/chromedriver");

        WebDriver driver = new ChromeDriver(chromeOptions);

        List<Double> buy = new ArrayList<>();
        List<Double> sell = new ArrayList<>();

        driver.get("https://www.privat24.ua/");
        String privat24 = driver.findElement(By.cssSelector("[class='section-content rate']")).getText();
        String[] privatCurrency = privat24.split("/ ");
        buy.add(Double.parseDouble(privatCurrency[0]));
        sell.add(Double.parseDouble(privatCurrency[1]));

        driver.get("https://my.ukrsibbank.com/ru/personal/operations/currency_exchange/");
        String ukrsibbankBuy = driver.findElement(By.xpath("//div[@class='currency__wrapper']//tbody/tr[1]/td[2]")).getText();
        String ukrsibbankSell = driver.findElement(By.xpath("//div[@class='currency__wrapper']//tbody/tr[1]/td[3]")).getText();
        buy.add(Double.parseDouble(ukrsibbankBuy));
        sell.add(Double.parseDouble(ukrsibbankSell));

        driver.get("https://www.universalbank.com.ua/");
        String universalbankBuy = driver.findElement(By.xpath("//table[@class='rate table table-bordered light fl-left m-t-2']/tbody/tr[2]/td[2]")).getText();
        buy.add(Double.parseDouble(universalbankBuy));
        String universalbankSell = driver.findElement(By.xpath("//table[@class='rate table table-bordered light fl-left m-t-2']/tbody/tr[2]/td[3]")).getText();
        sell.add(Double.parseDouble(universalbankSell));

        driver.get("http://www.oschadbank.ua/ua/");
        String oschadbankBuy = driver.findElement(By.cssSelector("[class='buy-USD']")).getText();
        buy.add(Double.parseDouble(oschadbankBuy));
        String oschadbankSell = driver.findElement(By.cssSelector("[class='sell-USD']")).getText();
        sell.add(Double.parseDouble(oschadbankSell));

        driver.get("http://www.bank.gov.ua/control/uk/curmetal/detail/currency?period=daily");
        String NBU = driver.findElement(By.xpath("//div[@class='content']//tbody/tr[9]/td[5]")).getText();
        buy.add(Double.parseDouble(NBU)/100);
        sell.add(Double.parseDouble(NBU)/100);


        System.out.println(buy.stream().mapToDouble(s -> s).average().getAsDouble());
        System.out.println(sell.stream().mapToDouble(s -> s).average().getAsDouble());

        driver.quit();
    }
}
