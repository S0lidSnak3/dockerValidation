package remoteTesting.dockerValidation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.ImmutableCapabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class firefoxTest1 {
	@Test
	public void main() throws MalformedURLException {
		// RemoteDriverClass
		Capabilities capabilities = new ImmutableCapabilities("browserName", "firefox");
		URL url = new URL("http://192.168.0.18:4444/");
		RemoteWebDriver driver = new RemoteWebDriver(url, capabilities);
		driver.get("http://www.newgrounds.com");
		//driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		//driver.close();
	}

}
