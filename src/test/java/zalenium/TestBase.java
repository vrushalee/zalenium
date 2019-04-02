package zalenium;

import java.util.Properties;

import zalenium.utils.ConfigurationsUtils;

public class TestBase {

	Properties properties = ConfigurationsUtils.getConfig();
	protected String seleniumGridURL = properties.getProperty("seleniumGridUrl");

	


	
}
