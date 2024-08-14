
import base.BaseTest;
import pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {
        driver.get("https://accounts.binance.com/en/login");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("Hola mundo");


        // Aquí se puede agregar una validación para verificar el inicio de sesión exitoso
    }
}
