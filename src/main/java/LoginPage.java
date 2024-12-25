import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private By login = By.linkText("Signup / Login");
    private By emailField = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div[1]/form/input[2]");
    private By passwordField = By.name("password");
    private By loginBtn = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div[1]/form/button");

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public void login(String email, String password) {
        driver.findElement(login).click();
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginBtn).click();

    }
}
