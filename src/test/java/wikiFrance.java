import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static org.hamcrest.core.Is.is;

public class wikiFrance {

    WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);//
    }

    @After
    public void closeBrowser()
    {
        driver.quit();
    }

    @Test
    public void testEnter() {
        HomePage homePage = new HomePage(driver);
        homePage.englishPage();
        homePage.rechercheEntrer("france");//new ResultsPage(driver);
        ResultPage resultPage = new ResultPage(driver);
        String result = resultPage.getResult();
        Assert.assertThat(result, is( "France"));
    }

}
