/**
 * A Classe Framework Select é responsável por validar os textos visiveis em tela..
 *
 * @author Rodrigo Arriel <rodrigoarriel56@gmail.com>
 * @version 1.0
 */

package framework;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FrameworkSelect extends Select {

	public FrameworkSelect(WebElement element) {
		super(element);
		
	}

	public void selectByVisibleText(String text)
	{
		
	}
}
