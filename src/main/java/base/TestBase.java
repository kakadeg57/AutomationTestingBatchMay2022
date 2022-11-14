package base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public static void init() {
		try {
		FileInputStream file = new FileInputStream("C:\\Users\\roshan\\eclipse-workspace\\MyMavenProject\\config.properties");
		prop = new Properties();
		prop.load(file);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		if(prop.getProperty("browser").contains("chrome")) {
		// chrome
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if(prop.getProperty("browser").contains("firefox")) {
			// firefox
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		else {
			System.out.println("Please select valid browser");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

}
