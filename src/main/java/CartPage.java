import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CartPage extends BasePage {
    private By proceedToCheckoutButton = By.linkText("Proceed To Checkout");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void proceedToCheckout(){
        driver.findElement(proceedToCheckoutButton).click();
    }

}
