package Pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Helper.Config;

public class MaisonConnectee {

	
	@FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/div[3]/div/div/div/div[2]/div[2]/h3/a")
	List<WebElement> productList;
	
	@FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/div[2]/div[4]/form/div/select")
	WebElement triProduitSelect;
	
	//@FindBy(xpath="/html/body/div[1]/div[4]/div/div/div/div/div[3]/div[1]/div/div[3]/div/h3")
	@FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/header/h1")
	WebElement verifpage;
	
	public MaisonConnectee(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//tri
	public void TrieProduct(String trieprod) throws InterruptedException {
		Thread.sleep(4000);
		Select select = new Select(triProduitSelect);
		select.selectByVisibleText(trieprod);
	}
	
	public void clickProduit(String productName) {
		
		JavascriptExecutor js = (JavascriptExecutor) Config.driver;
		js.executeScript("window.scrollBy(0,1200)");
		try {
			for(WebElement product:productList) {
				if(product.getText().contains(productName)) {
					Thread.sleep(3000);
					
					product.click();
				}
			}
		}catch (Exception e) {
			// TODO: handle exception
		}		
	}
	
	public String verifProd() {
		String actualMsg = verifpage.getText();
		return actualMsg;
	}
	

}
