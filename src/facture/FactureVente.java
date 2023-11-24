package facture;

public class FactureVente extends Facture{
	Client client;
	public FactureVente(int numFact, String date, int nbLigneFact,Client client) {
		super(numFact, date, nbLigneFact);
		this.client=client;
	}
	
	public Client getClient() {
		return client;
	}
	public void saisirFactureVente() {
		Client c=new Client();
		
		this.client=c;
		super.saisirfacture();
	}
	
	public void afficherFacture() {
		this.client.afficherclient();
		super.affichefacture();
	}
	
	public double totalFacture() {
	  return super.totalfacture();
	}
}
