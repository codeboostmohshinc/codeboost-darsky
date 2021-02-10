package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

//hasib is gay

public class Execute {

    public static void main (String[]args)  throws InterruptedException {
        //getTemps("Fort Ann");
        //questions(3);
        System.out.print(System.getProperty("user.dir"));
    }

    private static void getTemps(String city){
            String website = "darksky.com";
            String searchButton = "//a[@class='searchbutton" ;
            String textBox= "//input[@type='text]";
            System.setProperty("webdriver.chrome.driver", System.getProperty("/src/test/resources/chromedriver"));

            WebDriver driver= new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.get(website);

            driver.findElement(By.xpath(textBox)).clear();
            driver.findElement(By.xpath(textBox)).sendKeys(city);
            driver.findElement(By.xpath(searchButton)).click();

            driver.quit();



    }
    private static void questions(int x) {
            String website = "darksky.com";
            String helpPageButton="//a[@href='/help/website']";
            String question2="//a[href='#55']";
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/chromedriver");
            WebDriver driver= new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.get(website);

            driver.findElement(By.xpath(helpPageButton)).click();
            System.out.print(driver.findElement(By.xpath(question2)).getText());
            driver.quit();

    }


    }

