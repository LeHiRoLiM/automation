import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Primeira extends Hooks
{
//    By pathImputpesquisa = By.xpath("//textarea[@id='pass']");

    @Test
    @DisplayName("Cenario: Primeiro teste do Lehinho.")
    public void teste01() throws InterruptedException
    {
        // TESTE
        driver.get("http://bug.dev.hill/signin");
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("lehi@local.dev");
        driver.findElement(By.id("pass")).click();
        driver.findElement(By.id("pass")).sendKeys("qwe123");
        driver.findElement(By.id("login")).click();
        Thread.sleep(2000);
        By toast = By.cssSelector("#toast_notification div:nth-child(1) div.toast-body");
        String msgTela = driver.findElement(toast).getText();
        Assertions.assertEquals("Login com sucesso!", msgTela);
    }

}
