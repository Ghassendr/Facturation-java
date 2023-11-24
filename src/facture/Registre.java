package facture;

public class Registre {
	public Facture tabFact[] ;
	int nbfact;


	public Registre(int capacite) {
		tabFact=new Facture [ capacite];
		 nbfact=0;
	}
	
	public boolean ajouterFact(Facture facture){
	
		if (nbfact<tabFact.length) {
			tabFact[nbfact]=facture;
			nbfact++;
			return true;
		}
		return false;	
		 
	}
	public boolean supprimerfact (Facture facture) {
		for(int i=0;i<tabFact.length;i++) {
			if(tabFact[i].getNumFact()==facture.getNumFact()) {
				for(int j=i;j<nbfact;j++) {
					tabFact[j]=tabFact[j+1];
				}
				nbfact--;
				return true;}}
	 
		return false;	
	}
	public void afficheFactureFourn( Fournisseur four) {
		for(int i=0;i<nbfact;i++) {
			 if(tabFact[i] instanceof FactureAchat) {
				 	
				 	
				 if (((FactureAchat)tabFact[i]).getF().getCin()==four.getCin() ) {
					 ((FactureAchat)tabFact[i]).affichefacture();
				 }
			 }
		
		}
	}

	public void afficher() {
		for(int i=0;i<nbfact;i++) {
				tabFact[i].affichefacture();
		}
	}
	public void afficherTotauxFactureVente() {
		for(int i=0;i<nbfact;i++) {
			if(tabFact[i] instanceof FactureVente) {
				System.out.println("Num Fact :"+tabFact[i].getNumFact()+"Totale :"+tabFact[i].totalfacture());
			}
		}
	}
}
