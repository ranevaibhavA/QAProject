package Learnselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hello");
System.setProperty("webdriver.chrome.driver", "D:\\OneDrive - PTC\\LocaldiskD_bkp\\Soft\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();              //to maximize the chrome window

driver.get("https://www.selenium.dev");
String title=driver.getTitle();
if ("Selenisum".equals(title)) {
	System.out.println("title matched");
	
	
}else {
	System.out.println("title doest matched and test case failed");
}

driver.close();
	
	}

}
