import org.openqa.selenium.*;

public class HomePage extends BasePage {


    private By productsLink = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a");
    private By addToCartButton = By.xpath("(//a[contains(text(),'Add to cart')])[1]");
    private By viewCartButton = By.linkText("Cart");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void addProductToCart() {

        driver.findElement(productsLink).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0, 500)");
        driver.findElement(addToCartButton).click();
        driver.findElement(viewCartButton).click();

    }
}