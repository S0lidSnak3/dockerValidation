package remoteTesting.dockerValidation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.ImmutableCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class chromeTest1 {
  @Test
  public void test1() throws MalformedURLException {
		// RemoteDriverClass
		Capabilities capabilities = new ImmutableCapabilities("browserName", "chrome");
		URL url = new URL("http://192.168.0.18:4444/");
		RemoteWebDriver driver = new RemoteWebDriver(url, capabilities);
		driver.get("http://google.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		// driver.close();
  }
}
