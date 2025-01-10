import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {
    private By placeOrderButton = By.xpath("//*[@id=\"cart_items\"]/div/div[7]/a");
    private By nameOnCard = By.name("name_on_card");
    private By cardNumber = By.name("card_number");
    private By cvcNo = By.name("cvc");
    private By expiryMonth = By.name("expiry_month");
    private By expiryYear = By.name("expiry_year");
    private By submit = By.id("submit");

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void placeOrder() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0, 6000)");

        driver.findElement(placeOrderButton).click();
    }

    public void confirmOrder(String name_on_card, String card_number, String cvc, String MM, String YYYY){
        driver.findElement(nameOnCard).sendKeys(name_on_card);
        driver.findElement(cardNumber).sendKeys(card_number);
        driver.findElement(cvcNo).sendKeys(cvc);
        driver.findElement(expiryMonth).sendKeys(MM);
        driver.findElement(expiryYear).sendKeys(YYYY);
        driver.findElement(submit).click();

    }
}