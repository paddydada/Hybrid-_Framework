package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

	public static WebDriver driver;
	public static void initilzation(String browsername) {

		// upcasting
		//		browsername = browsername.toLowerCase();
		if(browsername.equals("chrome")) {

			driver = new ChromeDriver();
		}
		else if(browsername.equals("edge")) {
			driver = new EdgeDriver();

		}
		else if(browsername.equals("congnito")) {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--incognito");
		}

		// maximize window
		driver.manage().window().maximize();

		//apply wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// apply timeOut
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.get("https://callpal.in/#/sign-up");
	}

}
