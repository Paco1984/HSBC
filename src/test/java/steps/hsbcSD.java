package steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class hsbcSD {
	
	WebDriver driver;
	
	@Given("^the user is located at the HSBC page$")
	public void the_user_is_located_at_the_HSBC_page() throws Throwable {
		   System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.hsbc.com.mx/");
	}

	@When("^the user clicks on Cuentas y Tarjetas$")
	public void the_user_clicks_on_Cuentas_y_Tarjetas() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/div/header/div[3]/div/div[2]/div/div/nav/ul/li[1]/div[1]/span[2]")).click();
	    Thread.sleep(1000);
	    
	}

	@When("^the user selects Conoce Nomina HSBC$")
	public void the_user_selects_Conoce_N_mina_HSBC() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/div/header/div[3]/div/div[2]/div/div/nav/ul/li[1]/div[2]/div/div[1]/div/div[2]/div/div[1]/ul/li[1]/a")).click();
	    Thread.sleep(3000);
	}

	@When("^the user clicks on Solicita tu Nomina$")
	public void the_user_clicks_on_Solicita_tu_N_mina() throws Throwable {
	    driver.findElement(By.xpath("//*[@id=\"content_intro_button_1\"]")).click();
	    Thread.sleep(1500);
	}

	@When("^the user clicks on No eres cliente aun$")
	public void the_user_clicks_on_No_eres_cliente_a_n() throws Throwable {
	    driver.findElement(By.xpath("//*[@id=\"content_main_button_3\"]")).click();
	    Thread.sleep(2500);
	}


	@When("^the user clicks on He leido y acepto\\.\\.\\.$")
	public void the_user_clicks_on_He_le_do_y_acepto() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"contFormPers\"]/div/div[1]/div/label")).click();
		Thread.sleep(500);
	}

	@Then("^the user enters the following info$")
	public void the_user_enters_the_following_info(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		String value5 = data.get(1).get(0);
		String value6 = data.get(1).get(1);
		String value7 = data.get(1).get(2);
		String value8 = data.get(1).get(3);
	
		driver.findElement(By.id("desNompar")).sendKeys(value5);
	    Thread.sleep(1000);
	    driver.findElement(By.id("desApepat")).sendKeys(value6);
	    Thread.sleep(1000);
	    driver.findElement(By.id("desApepat")).sendKeys(Keys.TAB);
	    Thread.sleep(1000);
		driver.findElement(By.id("desEmail")).sendKeys(value7);
	    Thread.sleep(1000);
	    driver.findElement(By.id("numTelcel")).sendKeys(value8);
	    Thread.sleep(1000);
	}
	
	@And("^the user clicks on Continue button$")
	public void continue_button_is_displayed() throws Throwable {
	    driver.findElement(By.id("btnDataPers")).click();
	    
	}
	
	@Then("^a message alert is displayed$")
	public void a_message_alert_is_displayed() throws Throwable {
		boolean btnStatus = driver.findElement(By.xpath("/html/body/main/div[11]/i")).isDisplayed();
		//System.out.println("The edit box display status is " + btnStatus);
		Assert.assertEquals(true,btnStatus);
		driver.quit();
	    
	}
	

//			


}
