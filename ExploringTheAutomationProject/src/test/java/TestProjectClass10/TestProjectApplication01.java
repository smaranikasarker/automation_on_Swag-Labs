package TestProjectClass10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestProjectApplication01 {

	// Declare a method for sleep

	static void mywait(int x) {

		try {
			Thread.sleep(x);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// Main Method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		// WebDriver driver=new FirefoxDriver();
		// WebDriver driver=new InternetExplorerDriver();
		// WebDriver driver=new SafariDriver();

		// windows Maximize
		driver.manage().window().maximize();
		// put url to the browser
		driver.get("https://www.saucedemo.com/");
		mywait(3000);

		// First Name
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		System.out.println("1");
		mywait(3000);

		// Password Name
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		System.out.println("2");
		mywait(3000);

		// click login button
		driver.findElement(By.xpath("(//div[@class='login-box']//input)[3]")).click();
		System.out.println("3");
		mywait(5000);

		// Sort products by price (high to low) and add the highest priced item
		WebElement sortdropdown = driver.findElement(By.xpath("//span[@class='select_container']//select[1]"));
		Select select = new Select(sortdropdown);
		select.selectByVisibleText("Price (high to low)");
		System.out.println("4");
		mywait(3000);

		// click the highest price product
		driver.findElement(By.xpath("//a[@id='item_5_img_link']//img[1]")).click();
		System.out.println("5");
		mywait(3000);

		// Add to cart using the highest price product
		driver.findElement(By.xpath("//div[@class='inventory_details_desc_container']//button[1]")).click();
		System.out.println("5");
		mywait(3000);

		// Click on shopping cart
		driver.findElement(By.xpath("//div[@id='shopping_cart_container']//a[1]")).click();
		System.out.println("6");
		mywait(3000);

		// Click on continue shopping
		driver.findElement(By.xpath("//div[@class='cart_footer']//button[1]")).click();
		System.out.println("7");
		mywait(3000);

		// products by Price (low to high) and add the lowest priced item
		WebElement dropdown = driver.findElement(By.xpath("//span[@class='select_container']//select[1]"));
		Select select1 = new Select(dropdown);
		select1.selectByVisibleText("Price (low to high)");
		System.out.println("8");
		mywait(3000);

		// Click the product image based on lowest price
		driver.findElement(By.xpath("//a[@id='item_2_img_link']//img[1]")).click();
		System.out.println("9");
		mywait(3000);

		// Add to cart using the lowest price
		driver.findElement(By.xpath("//div[@class='inventory_details_desc_container']//button[1]")).click();
		System.out.println("10");
		mywait(3000);

		// Click on shopping cart
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']//span[1]")).click();
		System.out.println("11");
		mywait(3000);

		// Click on checkout
		driver.findElement(By.xpath("(//div[@class='cart_footer']//button)[2]")).click();
		System.out.println("12");
		mywait(3000);

		// Checkout Information
		driver.findElement(By.name("firstName")).sendKeys("Smaranika");
		System.out.println("13");
		mywait(3000);

		// Last Name
		driver.findElement(By.name("lastName")).sendKeys("sarker");
		System.out.println("14");
		mywait(3000);

		// postalCode Name
		driver.findElement(By.name("postalCode")).sendKeys("\"9011\", \"AB1\", \"9980-999\"");
		System.out.println("15");
		mywait(3000);

		// Click on Continue
		driver.findElement(By.xpath("//div[@class='checkout_buttons']//input[1]")).click();
		System.out.println("16");
		mywait(3000);

		// Click on Finish Button
		driver.findElement(By.xpath("(//div[@class='cart_footer']//button)[2]")).click();
		System.out.println("17");
		mywait(3000);

		// Click on back home Button
		driver.findElement(By.xpath("//div[@id='checkout_complete_container']//button[1]")).click();
		System.out.println("18");
		mywait(3000);

		// logout
		driver.findElement(By.xpath("//div[@class='bm-burger-button']//button[1]")).click();
		mywait(3000);

		driver.findElement(By.xpath("(//nav[@class='bm-item-list']//a)[3]")).click();

		// driver logout/Quite

		// driver.close();

	}

}
