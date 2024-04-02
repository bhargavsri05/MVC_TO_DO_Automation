package com.pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Homepage {
		private WebDriver driver;

	    @FindBy(xpath ="//*[text()='Examples']")
	    public WebElement txtExamples;
	    
	    @FindBy(xpath ="//*[text()='JavaScript']")
	    public WebElement option1;
	    
	    @FindBy(xpath ="//*[text()='Compile-to-JS']")
	    public WebElement option2;
	    
	    @FindBy(xpath ="//*[text()='Labs']")
	    public WebElement option3;
	    
	    @FindBy(xpath ="//*[text()='React']")
	    public WebElement txtReact;
	    

	    @FindBy(id = "username")
	    private WebElement usernameField;

	    @FindBy(id = "password")
	    private WebElement passwordField;
	    
	     public void setUsername(String username) {
		        usernameField.sendKeys(username);
		    }

}
