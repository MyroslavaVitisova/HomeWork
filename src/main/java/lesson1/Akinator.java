package lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.Scanner;

public class Akinator {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "/Users/vitisova/chromedriver");

        WebDriver driver = new ChromeDriver();

        Scanner scanner = new Scanner(System.in);

        driver.get("https://ru.akinator.com/");
        driver.findElement(By.xpath("//div[@class='btn-play']/a")).click();


        WebElement element = null;
        while (element == null) {


            String question = driver.findElement(By.xpath("//div[@class='bubble-body']/p[@class='question-text']")).getText();
            System.out.println(question);

            String v1 = driver.findElement(By.xpath("//div[@class='database-selection selector dialog-box']//li[1]/a")).getText();
            System.out.println(v1);

            String v2 = driver.findElement(By.xpath("//div[@class='database-selection selector dialog-box']//li[2]/a")).getText();
            System.out.println(v2);

            String v3 = driver.findElement(By.xpath("//div[@class='database-selection selector dialog-box']//li[3]/a")).getText();
            System.out.println(v3);

            String v4 = driver.findElement(By.xpath("//div[@class='database-selection selector dialog-box']//li[4]/a")).getText();
            System.out.println(v4);

            String v5 = driver.findElement(By.xpath("//div[@class='database-selection selector dialog-box']//li[5]/a")).getText();
            System.out.println(v5);


            System.out.print("Ваш ответ - ");
            int answer = scanner.nextInt();
            System.out.println();

            switch (answer) {
                case 1:
                    driver.findElement(By.xpath("//div[@class='database-selection selector dialog-box']//li[1]")).click();
                    break;
                case 2:
                    driver.findElement(By.xpath("//div[@class='database-selection selector dialog-box']//li[2]")).click();
                    break;
                case 3:
                    driver.findElement(By.xpath("//div[@class='database-selection selector dialog-box']//li[3]")).click();
                    break;
                case 4:
                    driver.findElement(By.xpath("//div[@class='database-selection selector dialog-box']//li[4]")).click();
                    break;
                case 5:
                    driver.findElement(By.xpath("//div[@class='database-selection selector dialog-box']//li[5]")).click();
                    break;
                default:
                    System.out.println("Вы ввели неправильное значение пожалуйста попробуйте еще раз");
                    break;
            }

            Thread.sleep(2000);

            try {
                element = driver.findElement(By.xpath("//div[@class='col-md-8 col-md-offset-0 col-sm-12 col-sm-offset-7 col-xs-12 col-xs-offset-7']" +
                        "/div[@class='bubble-propose-container']" +
                        "/div[@class='bubble-propose bubble']/p/span[@class='proposal-title']"));
            } catch (Exception e){
            }

            if(element != null){
                System.out.println("Я думаю это - " + element.getText());
            }
        }
        driver.quit();
    }
}
