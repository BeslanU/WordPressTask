public class WordPress {
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class Practice {

        public static void main(String[] args) throws InterruptedException {
            String login = "login";
            String loginB = "//*[@id=\"usernameOrEmail\"]";
            String continueB = "//*[@id=\"primary\"]/div/main/div/div/form/div[1]/div[2]/button";
            String passwordB = "//*[@id=\"password\"]";
            String password = "password";
            String continueB1 = "//*[@id=\"primary\"]/div/main/div/div/form/div[1]/div[2]/button";
            String firstName = "//*[@id=\"first_name\"]";
            String lastName = "//*[@id=\"last_name\"]";
            String saveD = "//*[@id=\"primary\"]/main/div[2]/form/p/button";
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\bedma\\Desktop\\Codes\\Selenium\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://wordpress.com/me");
            driver.manage().window().maximize();
            driver.findElement(By.xpath(loginB)).sendKeys(login);;
            driver.findElement(By.xpath(continueB)).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath(passwordB)).sendKeys(password);
            Thread.sleep(1000);
            driver.findElement(By.xpath(continueB1)).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath(firstName)).sendKeys("Beslan");
            driver.findElement(By.xpath(lastName)).sendKeys("Uruzbiyev");
            driver.findElement(By.xpath(saveD)).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"secondary\"]/ul/li/div[2]/button")).click();
            driver.quit();
        }
}
