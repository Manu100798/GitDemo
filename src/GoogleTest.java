import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GoogleTest {
	
	@Test
	public void HomePageCheck() throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome");
		//or 
		//caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");
 
		//caps.setPlatform(Platform.WIN10);
		//caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.137.1:4444"), caps );
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Manoj R K");
		driver.close();
	}

}
