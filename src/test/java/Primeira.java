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
    @DisplayName("Cenário: CENÁRIO LOGIN CORRETO 01")
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
        Thread.sleep(1000);
        System.out.println(msgTela);
    }

   @Test
   @DisplayName("Cenário: SENHA ERRADA 02")
    public void teste02() throws InterruptedException
   {
       // TESTE
       driver.get("http://bug.dev.hill/signin");
       driver.findElement(By.id("email")).click();
       driver.findElement(By.id("email")).sendKeys("lehi@local.dev");
       driver.findElement(By.id("pass")).click();
       driver.findElement(By.id("pass")).sendKeys("qwe321");
       driver.findElement(By.id("login")).click();
       Thread.sleep(2000);
       driver.findElement(By.id("toast_notification"));
       Thread.sleep(1000);
       System.out.println("Incorrect Password");
   }

    @Test
    @DisplayName("Cenário: EMAIL ERRADO 03")
    public void teste03() throws InterruptedException
    {
        driver.get("http://bug.dev.hill/signin");
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("lehi@local.devinho");
        driver.findElement(By.id("pass")).click();
        driver.findElement(By.id("pass")).sendKeys("qwe321");
        driver.findElement(By.id("login")).click();
        // Thread.sleep(2000);
        driver.findElement(By.id("toast_notification"));
        Thread.sleep(1000);
        System.out.println("User not foud");
    }

    @Test
    @DisplayName("Cenário: EMAIL E SENHA ERRADO 04")
    public void teste04() throws InterruptedException {
        driver.get("http://bug.dev.hill/signin");
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("lehi@local.devinho");
        driver.findElement(By.id("pass")).click();
        driver.findElement(By.id("pass")).sendKeys("qwe3210");
        driver.findElement(By.id("login")).click();
        driver.findElement(By.id("toast_notification"));
        Thread.sleep(1000);
        System.out.println("Incorrect Password");

    }
    @Test
    @DisplayName("Cenário: EMAIL CORRETO E SENHA VAZIO 05")
    public void teste05() throws InterruptedException {
        driver.get("http://bug.dev.hill/signin");
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("lehi@local.dev");
        driver.findElement(By.id("pass")).click();
        driver.findElement(By.id("pass")).sendKeys("");
        driver.findElement(By.id("login")).click();
        driver.findElement(By.id("toast_notification"));
        Thread.sleep(1000);
        System.out.println("Fill in Password");
    }

    @Test
    @DisplayName("Cenário: EMAIL VAZIO E SENHA CORRETA 06")
    public void teste06() throws InterruptedException {
        driver.get("http://bug.dev.hill/signin");
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("");
        driver.findElement(By.id("pass")).click();
        driver.findElement(By.id("pass")).sendKeys("qwe123");
        driver.findElement(By.id("login")).click();
        driver.findElement(By.id("toast_notification"));
        Thread.sleep(1000);
        System.out.println("Fill in email");
    }

    @Test
    @DisplayName("Cenário: EMAIL E SENHA VAZIO 07")
    public void teste07() throws InterruptedException {
        driver.get("http://bug.dev.hill/signin");
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("");
        driver.findElement(By.id("pass")).click();
        driver.findElement(By.id("pass")).sendKeys("");
        driver.findElement(By.id("login")).click();
        driver.findElement(By.id("toast_notification"));
        Thread.sleep(1000);
        System.out.println("Fill in email");  // por causa da ordem de precedência
    }
}
