package page.objects;

import driver.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainPage {

    @FindBy(id = "keywords")
    private WebElement search;
    @FindBy(id = "searchBtn")
    private WebElement searchBtn;
    @FindBy(id = "mainOfferList")
    private WebElement offerts;

    public MainPage() {
        PageFactory.initElements(DriverManager.getWebdriver(), this);
    }

    public MainPage searchJob(String text) {
        search.sendKeys(text);
        DriverManager.getWebdriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchBtn.click();
        return this;
    }
    public boolean isDisplayedResult() {
        return offerts.isDisplayed();
    }

}
