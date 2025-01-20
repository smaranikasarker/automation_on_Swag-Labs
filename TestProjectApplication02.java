package TestProjectClass11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestProjectApplication02 {

	static void mywait(int x) {

		try {
			Thread.sleep(x);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	WebDriver driver;

	@Test(priority = 1)
	void setup() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		System.out.println("Setup");
		mywait(3000);

	}

	@Test(priority = 2)
	void login() {

		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("(//div[@class='login-box']//input)[3]")).click();

		System.out.println("Login");
		mywait(3000);

	}

	@Test(priority = 3)
	void purchage1() {
		WebElement sortdropdown = driver.findElement(By.xpath("//span[@class='select_container']//select[1]"));
		Select select = new Select(sortdropdown);
		select.selectByVisibleText("Price (high to low)");
		driver.findElement(By.xpath("//a[@id='item_5_img_link']//img[1]")).click();
		driver.findElement(By.xpath("//div[@class='inventory_details_desc_container']//button[1]")).click();
		driver.findElement(By.xpath("//div[@id='shopping_cart_container']//a[1]")).click();
		driver.findElement(By.xpath("//div[@class='cart_footer']//button[1]")).click();
		System.out.println("Purchage1");
		mywait(3000);

	}

	@Test(priority = 4)
	void purchage2() {
		WebElement dropdown = driver.findElement(By.xpath("//span[@class='select_container']//select[1]"));
		Select select1 = new Select(dropdown);
		select1.selectByVisibleText("Price (low to high)");
		driver.findElement(By.xpath("//a[@id='item_2_img_link']//img[1]")).click();
		driver.findElement(By.xpath("//div[@class='inventory_details_desc_container']//button[1]")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']//span[1]")).click();
		System.out.println("Purchage2");
		mywait(3000);

	}

	@Test(priority = 5)
	void checkout() {

		driver.findElement(By.xpath("(//div[@class='cart_footer']//button)[2]")).click();
		driver.findElement(By.name("firstName")).sendKeys("Influx");
		driver.findElement(By.name("lastName")).sendKeys("Dev");
		driver.findElement(By.name("postalCode")).sendKeys("1209");
		driver.findElement(By.xpath("//div[@class='checkout_buttons']//input[1]")).click();
		driver.findElement(By.xpath("(//div[@class='cart_footer']//button)[2]")).click();
		System.out.println("Checkout");
		mywait(3000);

	}

	@Test(priority = 6)
	void backtohomepage() {

		driver.findElement(By.xpath("//div[@id='checkout_complete_container']//button[1]")).click();

		System.out.println("Back to Home Page");
		mywait(3000);

	}

	@Test(priority = 7)
	void logout() {

		driver.findElement(By.xpath("//div[@class='bm-burger-button']//button[1]")).click();
		driver.findElement(By.xpath("(//nav[@class='bm-item-list']//a)[3]")).click();
		System.out.println("Logout");
		mywait(3000);

	}

	@Test(priority = 8)
	void driverclose() {

		driver.close();
		System.out.println("Driver close");

	}

}
