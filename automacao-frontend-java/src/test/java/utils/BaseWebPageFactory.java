/**
 * A Classe BaseWebPageFactory é responsável por validar a chamada da URL.
 *
 * @author Rodrigo Arriel <rodrigoarriel56@gmail.com>
 * @version 1.0
 */

package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseWebPageFactory {
	
	protected WebDriver driver;
	
	public BaseWebPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
	
	public void setUrl(String pUrl) {

		driver.navigate().to(pUrl);

	}

	public void waitUntilElementIsVisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitUntilElementIsClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
}

