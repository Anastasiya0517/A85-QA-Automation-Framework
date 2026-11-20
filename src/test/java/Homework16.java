import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Homework16 {
    public void registrationNavigation(){

        ChromeOptions options= new ChromeOptions();

        WebDriver driver=new ChromeDriver(options);


        String url="https://qa.koel.app/";
        driver.get(url);

        WebElement RegistrationLink= driver.findElement(By.xpath("//a[@href='registration']"));
        RegistrationLink.click();

        String expectedUrl="https://qa.koel.app/registration";



        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);

        driver.quit();

    }

}