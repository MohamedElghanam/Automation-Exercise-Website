import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileReader;
import java.time.Duration;

public class CheckoutTest {
    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    CartPage cartPage;
    CheckoutPage checkoutPage;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        cartPage = new CartPage(driver);
        checkoutPage = new CheckoutPage(driver);
    }

    @Test(priority = 1)
    public void testLogin() throws Exception {
        JsonObject data = JsonParser.parseReader(new FileReader("src/main/resources/test_data.json")).getAsJsonObject();
        JsonObject loginData = data.getAsJsonObject("login_data");

        String email = loginData.get("email").getAsString();
        String password = loginData.get("password").getAsString();

        loginPage.login(email, password);
    }
    @Test(priority = 2)
    public void testCheckoutProcess() throws Exception {
        // Json reader
        JsonObject data = JsonParser.parseReader(new FileReader("src/main/resources/test_data.json")).getAsJsonObject();
        JsonObject paymentData = data.getAsJsonObject("payment_data");

        String name_on_card = paymentData.get("name_on_card").getAsString();
        String card_number = paymentData.get("card_number").getAsString();
        String cvc = paymentData.get("cvc").getAsString();
        String MM = paymentData.get("MM").getAsString();
        String YYYY = paymentData.get("YYYY").getAsString();


        homePage.addProductToCart();
        cartPage.proceedToCheckout();
        checkoutPage.placeOrder();
        checkoutPage.confirmOrder(name_on_card,card_number,cvc,MM,YYYY);

    }

    @AfterClass
    public void close() {
        driver.quit();
    }
}