package zalenium;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DockerTestWithFirefoxBrowser extends TestBase {

	protected static RemoteWebDriver driver;

	@BeforeTest
	public void setUpMethod() throws Exception {

		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setPlatform(Platform.LINUX);
		driver = new RemoteWebDriver(new URL(seleniumGridURL), capabilities);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void f() {
		driver.get("https://www.google.com/");
	}

	@AfterTest
	public void quite() throws Exception {
		driver.quit();
	}

}
