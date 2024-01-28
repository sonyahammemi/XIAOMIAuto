package TestSuites;

import org.junit.Assert;

import Helper.Config;
import Pages.MaisonConnectee;
import Pages.XIAOMIHome;
import io.cucumber.java.en.*;


public class XIAOMIHomeStepDef {
	
	@Given("utilisateur accédé la page d acceuil")
	public void utilisateur_accédé_la_page_d_acceuil() throws Exception {
		Config.ConfigChrome();
		Config.maximizeWindow();
		Config.driver.get("https://mistore.com.tn/");
		

	}

	@When("utilisateur survolé la souris sur le menu {string} et submenu {string}")
	public void utilisateur_survolé_la_souris_sur_le_menu_et_submenu(String menu, String submenu) throws Exception {
		XIAOMIHome home = new XIAOMIHome(Config.driver);
		home.mouseHoverOnMenu(menu, submenu);

	}

//	@Then("utilisateur est dériger vers la page de submenu")
//	public void utilisateur_est_dériger_vers_la_page_de_submenu() {
//		Config.driver.quit();
//
//	}
	
	
	@Then("utilisateur est dériger vers la page de submenu {string}")
	public void utilisateur_est_dériger_vers_la_page_de_submenu(String NomProduit) {
		MaisonConnectee produit = new MaisonConnectee(Config.driver);
		String actualMessage = produit.verifProd();
		Assert.assertEquals(NomProduit, actualMessage);
		Config.driver.quit();
	}
}
