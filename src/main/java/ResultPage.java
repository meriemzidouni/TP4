import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ResultPage {
    WebDriver driver;

    @FindBy(id ="firstHeading")
    WebElement title;

    public ResultPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public String getResult()
    {
        return title.getText();
    }
}