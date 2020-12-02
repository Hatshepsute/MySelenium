package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.openqa.selenium.support.PageFactory.initElements;

public class SearchPage {

    @FindBy(css = "input.gLFyf.gsfi")
    public WebElement searchInput;

    @FindBy(css = "input.gLFyf.gsfi")
    public List<WebElement> foundResults;

    public SearchPage(WebDriver driver) {
        initElements(driver, this);

    }
}
