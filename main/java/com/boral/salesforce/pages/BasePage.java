package com.boral.salesforce.pages;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	 	protected WebDriver driver;
	 	private int timeout;
	 	private int pollingTime;
	 	
	 	@FindBy(css = "a[href*='/lightning/o/Project__c/home']")
		WebElement projectsLink;
	 	
	 	@FindBy(css="a[href*='/lightning/o/Opportunity/home']") 
	 	WebElement opportunitiesLink;
	 	
	
	 	public BasePage (WebDriver driver, int timeout) {
	 		this.driver=driver;
	 		this.timeout=timeout;
	 	}
	 	
	 	public BasePage (WebDriver driver, int timeout, int pollingTime) {
	 		this(driver,timeout);
	 		this.pollingTime=pollingTime;
	 	}
	 	
	 	public void waitFor(ExpectedCondition<WebElement> condition) {
	 		new WebDriverWait(driver,timeout).until(condition);
	 	}
	 	
		public void waitFor(List<ExpectedCondition<WebElement>> conditions) {
	 		for (ExpectedCondition<WebElement> condition: conditions)
			waitFor(condition);
	 	}
	 	
		public void fluentlyWaitFor(ExpectedCondition<WebElement> condition) {
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeout))
					.pollingEvery(Duration.ofMillis(pollingTime))
					.ignoring(NoSuchElementException.class);		
			wait.until(condition);
		}
		
		public void fluentlyWaitFor(List<ExpectedCondition<WebElement>> conditions) {
	 		for (ExpectedCondition<WebElement> condition: conditions)
	 			fluentlyWaitFor(condition);
	 	}
		
		public void clickProjectsLink(){
			projectsLink.click();
		}
		
		public void clickOpportunitiesLink(){
			opportunitiesLink.click();
		}
}
