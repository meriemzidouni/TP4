import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    @FindBy(id = "searchInput")
    WebElement barreRecherche;

    public HomePage(WebDriver driver)
    {
        //this fait reférence au driver de la classe actuelle
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void rechercheEntrer(String text)
    {
        barreRecherche.sendKeys(text);
        barreRecherche.sendKeys(Keys.ENTER);

        //return new ResultsPage(driver);
    }

}
