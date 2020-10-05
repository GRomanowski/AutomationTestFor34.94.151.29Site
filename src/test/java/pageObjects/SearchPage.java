package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends BasePage {

    @FindBy(css = "#main > header > h1")
    private WebElement searchResult;

    public SearchPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }

    public boolean isSearchResultsListCorrect() {
        return searchResult.getText().contains("gold");
    }

    public boolean isSearchResultEmpty() {
        return searchResult.getText().equals("Search results: “”");
    }

    public boolean isSearchResultSilver() {
        return searchResult.getText().equals("Search results: “silver”");
    }

    public boolean isSearchResultBars() {
        return searchResult.getText().equals("Search results: “bars”");
    }

}
