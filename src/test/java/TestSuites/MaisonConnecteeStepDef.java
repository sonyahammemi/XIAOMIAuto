package TestSuites;

import Helper.Config;
import Pages.MaisonConnectee;
import io.cucumber.java.en.*;



public class MaisonConnecteeStepDef {
	
	
	@Given("utilisateur accédé a la page maison connectée")
	public void utilisateur_accédé_a_la_page_maison_connectée() throws Exception {
		Config.ConfigChrome();
		Config.maximizeWindow();
		Config.driver.get("https://mistore.com.tn/product-category/maison-connectee/");

	}
	@When("utilisateur affectué la tri {string}")
	public void utilisateur_affectué_la_tri(String triprod) throws InterruptedException {
		MaisonConnectee page = new MaisonConnectee(Config.driver);
		page.TrieProduct(triprod);

	}

	@When("utilisateur clique sur le produit {string}")
	public void utilisateur_clique_sur_le_produit(String prod) {
		MaisonConnectee page = new MaisonConnectee(Config.driver);
		page.clickProduit(prod);

	}

	@Then("la page de produit est affichée {string}")
	public void la_page_de_produit_est_affichée(String NomProduit) {
//		MaisonConnectee produit = new MaisonConnectee(Config.driver);
//		String actualMessage = produit.verifProd();
//		Assert.assertEquals(NomProduit, actualMessage);
		Config.driver.quit();
		

	}


}
