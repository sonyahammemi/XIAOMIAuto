package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class XIAOMIHome {
	
	@FindBy(xpath="/html/body/div[1]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li/a")
	List<WebElement> menus;
	@FindBy(xpath="/html/body/div[1]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li[3]/div/div/div/div/section/div/div/div/div/div/a/div/div[2]/h4")
	List<WebElement> submenus;
	
	@FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/div[3]/div/div/div/div[2]/div[1]/figure/a/img")
	List<WebElement> productList;
	

	
	public XIAOMIHome(WebDriver driver) {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void mouseHoverOnMenu(String menuTitle, String submenuTitle) throws Exception {
		try {
			for(WebElement menu:menus) {
			Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			if(menu.getText().contains(menuTitle)) {
				Config.actions = new Actions(Config.driver);
				Config.actions.moveToElement(menu).perform();
				Thread.sleep(3000);
				for(WebElement submenu:submenus) {
					System.out.println("submenu");
		
					//Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					if(submenu.getText().contains(submenuTitle)) 
						System.out.println("test");
						submenu.click();
					
					
				}
				
			}
		}
		
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		

	}
	

}
