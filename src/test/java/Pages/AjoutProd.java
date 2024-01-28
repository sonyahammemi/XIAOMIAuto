package Pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class AjoutProd {
	
	@FindBy(xpath="/html/body/div[1]/div[4]/div/div/div/div/div[3]/div[1]/div/div[3]/div/form/div/button")
	WebElement ajoutAupanier;
	
	@FindBy(xpath="/html/body/div[1]/header/div[1]/div/section/div/div[4]/div/section/div/div[2]/div/div/div/div/div/div/a/span/i")
	WebElement panier;
	@FindBy(xpath="/html/body/div[1]/header/div[1]/div/section/div/div[4]/div/section/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[1]/p[2]/a[1]")
	WebElement voirPanier;
	
	@FindBy(xpath="/html/body/div[1]/div[4]/section[2]/div/div/div/div/form/div/div[1]/div[1]/div[2]/span[1]/span/a")
	WebElement vpanier;

	
	
	public AjoutProd (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void ajoutPrduitAuPanier( ) throws Exception   {
		Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ajoutAupanier.click();
		
		Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		panier.click();
		
		Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		voirPanier.click();		
		
	}
	public String verifPanier() {
		String actualMsg = vpanier.getText();
		return actualMsg;
	}
	
}
