package Learnselenium;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DownloadImg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("test for downloading image");

WebDriver driver3 =new ChromeDriver();
driver3.get("https://the-internet.herokuapp.com/download");

//driver3.findElement(By.xpath("//img[@alt='Free photo blue butterfly on blossom']")).click();

driver3.findElement(By.xpath("//a[normalize-space()='ronaldo.jpg']")).click();
//Actions action =new Actions(driver3);
//action.contextClick(ele).build().perform();
//action.sendKeys(Keys.CONTROL,"V").build().perform();
//action.sendKeys(Keys.CONTROL,"s").build().perform();

	}

}
