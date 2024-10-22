import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks
{
    // Variáveis Necessárias
    public static WebDriver driver;
    public static ChromeOptions options;

    @BeforeEach
    public void abrir()
    {
        WebDriverManager.chromedriver().setup(); // Configurando o driver do navegador
        options = new ChromeOptions();
        options.addArguments(("--disable-crash-reporter"));
        options.addArguments(("--disable-extensions"));
        options.addArguments(("--disable-dev-shm"));
        options.addArguments(("--disable-notifications"));
        driver = new ChromeDriver(options);   // abrindo o navegador
        //driver.get("https://google.com.br/");
    }

    @AfterEach
    public void fechar()
    {
        driver.quit();
        driver = null;
    }
}
