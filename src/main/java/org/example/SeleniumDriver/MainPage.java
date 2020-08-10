package org.example.SeleniumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class MainPage {


    public static void main(String[] args) {
        String URL = "http://ntppbirpt0001/Reportes/powerbi/Desarrollo%20y%20Mantenimiento%20de%20Metricas/Ordenes%20de%20Servicio/Backlog%20General";
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
//        System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");

        WebDriver webDriver = new ChromeDriver();
        //WebDriver webDriver = new FirefoxDriver();



        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10).getSeconds());

        webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        try{
            webDriver.get(URL);
            //webDriver.findElement(By.name("q")).sendKeys("cheese" + Keys.ENTER);
            //WebElement firstResult = wait.until(presenceOfElementLocated(By.cssSelector("h3>div")));
            //System.out.println(firstResult.getAttribute("textContent"));
        }finally {
            webDriver.quit();
        }

    }
}
