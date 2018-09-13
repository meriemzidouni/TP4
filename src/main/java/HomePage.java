import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    @FindBy(id ="searchInput")
    WebElement barreRecherche;

    @FindBy(id = "js-link-box-en")
    WebElement goEnglish;

    public HomePage(WebDriver driver)
    {
         this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    public void rechercheEntrer(String text)
    {
        barreRecherche.sendKeys(text);
        barreRecherche.sendKeys(Keys.ENTER);

        //return new ResultsPage(driver);
    }



    public void englishPage()
    {

        goEnglish.sendKeys(Keys.ENTER);

        //return new ResultsPage(driver);
    }

}
