package Suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {
    public static WebDriver createChrome() {

        /* Abertura do navegador */
        System.setProperty("webdriver.chrome.driver", "C:/Windows/chromedriver.exe");

        /* Instância do navegador Chrome */
        WebDriver navegador = new ChromeDriver();

        /* Timeout */
        navegador.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);

        /* Maximizar navegador */
        navegador.manage().window().maximize();

        /* URL da página que vamos testar */
        navegador.get("http://automationpractice.com/index.php");

        return navegador;
    }
}
