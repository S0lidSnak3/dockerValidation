package remoteTesting.dockerValidation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.ImmutableCapabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class chromeStandaloneTest {

	public static void main(String[] args) throws MalformedURLException {
		// RemoteDriverClass
		Capabilities capabilities = new ImmutableCapabilities("browserName", "chrome");
		URL url = new URL("http://192.168.0.18:4444/");
		RemoteWebDriver driver = new RemoteWebDriver(url, capabilities);
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		// driver.close();
	}

}
