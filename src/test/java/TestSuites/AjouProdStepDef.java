package TestSuites;


import org.junit.Assert;

import Helper.Config;
import Pages.AjoutProd;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AjouProdStepDef {
	
	@Given("utilisateurest sur la page du produit")
	public void utilisateurest_sur_la_page_du_produit() throws Exception {
		Config.ConfigChrome();
		Config.maximizeWindow();
		Config.driver.get("https://mistore.com.tn/product/mi-temperature-and-humidity-monitor-pro/");
	}

		
	@When("utilisateur clique sur le bouton pour ajouter un produit  au panier")
	public void utilisateur_clique_sur_le_bouton_pour_ajouter_un_produit_au_panier() throws Exception   {
		AjoutProd prod = new AjoutProd(Config.driver);
		prod.ajoutPrduitAuPanier();

	}

	
	@Then("le produit ajouter à la liste {string}")
	public void le_produit_ajouter_à_la_liste(String Nprod) {
		AjoutProd panier = new AjoutProd(Config.driver);
		String actualMessage = panier.verifPanier();
		Assert.assertEquals(Nprod, actualMessage);
		Config.driver.quit();

	}

}
