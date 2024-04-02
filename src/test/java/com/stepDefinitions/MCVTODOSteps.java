package com.stepDefinitions;

import com.pageObjects.Homepage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class MCVTODOSteps {
	
	WebDriver driver;
	Homepage hp;
	
	@Given("User launches the chrome browser")
	public void user_launches_the_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C://Users//Bhargav//Documents//chromedriver.exe");
        driver = new ChromeDriver();  // Launches chrome browser
	}

	@When("User opens TODOMVC page")
	public void user_opens_todomvc_page() throws InterruptedException {
		driver.get("https://todomvc.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}

	@Then("User verifies the text on the landing page")
	public void user_verifies_the_text_on_the_landing_page() {
		String title = driver.getTitle();
		   Assert.assertEquals("TodoMVC", title);
	}

	@Then("User should be able to navigate between options under examples")
	public void user_should_be_able_to_navigate_between_options_under_examples() throws InterruptedException {
		this.hp = new Homepage();
		String txtEx = hp.txtExamples.getText();
		System.out.print(txtEx);
		  hp.option2.click(); //Verify the options under Compile to js-Not exploring deep
		  Thread.sleep(2000);
		  hp.option3.click(); // verifying the options under Labs
		  Thread.sleep(2000);
		  hp.option1.click();
	}

	@Then("User clicks on React Text")
	public void user_clicks_on_react_text() throws InterruptedException {
		//Click on the option react
		driver.findElement(By.xpath("(//*[text()='React'])[1]")).click();
		Thread.sleep(2000);
	}

	@Then("User enters the tasks in the input field")
	public void user_enters_the_task_in_the_input_filed() throws InterruptedException {
		//Click on the option react
		Thread.sleep(3000);
		WebElement inPutfield = driver.findElement(By.xpath("//input[@type='text']"));
		inPutfield.click();
		Thread.sleep(2000);
		inPutfield.sendKeys("Training");
		inPutfield.click();
		Thread.sleep(2000);
		inPutfield.sendKeys("Debugging");
		inPutfield.click();

	}

	@Then("User marks debugging task as complete")
	public void user_marks_debugging_tasks_as_complete() throws InterruptedException {
		Thread.sleep(3000);
		//Select the task toggle and mark as complete
		WebElement debuggingTextToggle = driver.findElement(By.xpath("(//*[@class='destroy'])[1]"));
		debuggingTextToggle.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Completed']")).click();
		driver.quit();
	}


}
