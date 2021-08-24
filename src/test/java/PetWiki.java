import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PetWiki {
    @Test
    public static String getLoadedData(WebDriver driver) {
        By loadBtn = By.id("load-button");
        By content = By.id("content");

        driver.findElement(loadBtn).click();
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (driver.findElement(loadBtn).isEnabled())
            return driver.findElement(content).getText();
        else
            return null;
    }
}
