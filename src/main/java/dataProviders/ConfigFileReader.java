package dataProviders;

import java.util.Properties;


public class ConfigFileReader {
	public static Properties properties;

	public String getReportConfigPath() {
		Properties properties = new Properties();
		//properties.load(new FileInputStream(System.getProperty(("user.dir")+"configs\\Configuration.properties\\"+"reportConfigPath")));
		//properties = new Properties();
		String reportConfigPath = properties.getProperty("reportConfigPath");
			
		
		//reportConfigPath="D:\\Selenium_Practice\\in.newtours.demoaut.com.report\\configs\\extent-config.xml";
		//if you write above path then test will pass successfully
		System.out.println("PRI NT...."+reportConfigPath);
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		

		/*
	 	LTS_Prop = new Properties();
		String reportConfigPath = LTS_Prop.getProperty("reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		

		 */

	}
}
