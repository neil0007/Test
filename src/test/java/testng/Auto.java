package testng;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class Auto {
	
	public static void main(String[] args) throws InterruptedException {
//		ChromeOptions co = new ChromeOptions();
//		co.setBrowserVersion("115");
		WebDriver driver= new ChromeDriver();
		driver .get("https://app.growpital.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	


		
		
		//Singup
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul/a[1]/li")));
//		
//		WebElement createDropAndLogin = driver.findElement(By.xpath("//ul/a[1]/li")); 
//		
//		createDropAndLogin.click();
//		
//		WebElement emailBox = driver.findElement(By.xpath("//input[@id='amplify-id-:r4:']"));
//		
//		emailBox.sendKeys("gixeveji@finews.biz");
//		
//		WebElement firstNameBox = driver.findElement(By.xpath("//input[@id='amplify-id-:r6:']"));
//		
//		firstNameBox.sendKeys("Test");
//		
//		WebElement lastName = driver.findElement(By.xpath("//input[@id='amplify-id-:r8:']"));
//		
//		lastName.sendKeys("Testkar");
//		
//		WebElement passwordBox = driver.findElement(By.xpath("//input[@id='amplify-id-:ra:']"));
//		
//		passwordBox.sendKeys("Liverpool@01");
//		
//		WebElement confirmPasswordBox = driver.findElement(By.xpath("//input[@id='amplify-id-:rc:']"));
//		
//		confirmPasswordBox.sendKeys("Liverpool@01");
//		
//		WebElement phoneNumber = driver.findElement(By.xpath("//input[@class='amplify-field-group__control']"));
//		phoneNumber.sendKeys("9876543210");
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		
//		js.executeScript("window.scrollBy(0,250)", "");
//		Thread.sleep(1000);
//		js.executeScript("window.scrollBy(0,250)", "");
//		Thread.sleep(1000);
//		js.executeScript("window.scrollBy(0,250)", "");
//		Thread.sleep(1000);
//		js.executeScript("window.scrollBy(0,250)", "");
//		
//		
//		WebElement amountInvestDropDown = driver.findElement(By.xpath("(//div[@class='drop-down-wrapper'])[1]"));
//		
//		amountInvestDropDown.click();
//		
//		WebElement amountToBeInvested = driver.findElement(By.xpath("//div[6]/div[3]/div/ul/div[4]"));
//		
//		amountToBeInvested.click();
//		
//		WebElement residentialDropDown = driver.findElement(By.xpath("(//div[@class='drop-down-wrapper'])[2]"));
//
//		residentialDropDown.click();
//		
//		WebElement residentialType = driver.findElement(By.xpath("//div[7]//div[3]//div/ul/div[2]"));
//		
//		residentialType.click();
//		
//		
//		WebElement referralBox = driver.findElement(By.xpath("//input[@id='amplify-id-:re:']"));
//		
//		referralBox.sendKeys("NEIL");
//		
//		//js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//		Thread.sleep(5000);
//		js.executeScript("window.scrollBy(0,150)", "");
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,500)", "");
//		
//		WebElement termsAndConditions = driver.findElement(By.xpath("//span[@aria-hidden='true']"));
//		
//		termsAndConditions.click();
//		
//		WebElement createAccoutButton = driver.findElement(By.xpath("//button[@data-testid='login']"));
//		createAccoutButton.click();
//		
//		WebElement error = driver.findElement(By.xpath("//*[@id='section-email']/div/p"));
//		System.out.println(error.getText());
//		
//		List<WebElement> list = driver.findElements(By.xpath("//a[@href]"));
//		
//		
//		
//		
//		driver.quit();
		
		
		
		
//		WebElement enterOTP = driver.findElement(By.xpath("//input[@id='amplify-id-:rh:']"));
//		
//		Scanner scanner = new Scanner(System.in);
//        String newPhoneNumber = scanner.nextLine();
//        scanner.close();
//        
//        Thread.sleep(5000);
//		enterOTP.sendKeys(newPhoneNumber);
//		Thread.sleep(5000);
//		
//		WebElement confirmEmail = driver.findElement(By.xpath("//button[@data-testid='submit-confirmation-code']"));
//		
//		confirmEmail.click();	
		
		//dashboard Link
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("neil@growpital.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Liverpool@01");
		
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		
		Thread.sleep(5000);
		
		String actualTitle = driver.getTitle().trim();
		System.out.println(actualTitle);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
//		int linksCount = links.size();
//		
//		for (int i = 0; i < linksCount; i++) {
//            WebElement link = links.get(i);
//            String url = link.getAttribute("href");
//            if (url != null && !url.isEmpty()) {
//                System.out.println("Link " + (i + 1) + ": " + url);
//            }
//        }
		
		
	
		for (WebElement link : links)
		{
			String linkUrl = link.getAttribute("href");
			if (linkUrl != null && !linkUrl.isEmpty())
			{
				try {
					HttpURLConnection connection = (HttpURLConnection) new URL (linkUrl).openConnection();
					connection.connect();
					
					int responseCode = connection.getResponseCode();
					if (responseCode == 200 || responseCode == 403)
					{
						//soft.assertTrue(true, "Link" + linkUrl + "is active.");
						System.out.println("Link" + linkUrl + "is active.");
					}
					else 
					{
						//soft.fail("Link" + linkUrl + "reurned status code" + responseCode);
						System.out.println("Link" + linkUrl + "returned status code" + responseCode);
					}
				} catch (Exception e)
				
				{
					//soft.fail("Link" + linkUrl + "is not reachable");
					System.out.println("Link" + linkUrl + "is not reachable");
				}
			}
		}
		
		String dashboardHeading = driver.findElement(By.xpath("//h1[@class='Dashboard_title__nC4kh']")).getText().trim();
		
		System.out.println(dashboardHeading);
		String expected = "Welcome back, NEIL👋";
		
		if (dashboardHeading.equalsIgnoreCase(expected)) {
			System.out.println("Paas");
			
		}
		else {
			System.out.println("fail");
		}
		
		
		
		driver.quit();
		
	
	}
		
	
	}


