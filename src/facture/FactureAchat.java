package facture;

public class FactureAchat extends Facture{
	public Fournisseur f;
	public FactureAchat(int numFact ,String date,int nbLigneFact,Fournisseur f) {
		super(numFact , date, nbLigneFact);
		this.f=f;
		}
	
public Fournisseur getF() {
	return f;
}
	public void saisirFactureAchat() {
		Fournisseur f=new Fournisseur();

		this.f=f;
		super.saisirfacture();
	}
	
	public void afficherFacture() {
		this.f.afficherFour();
		super.affichefacture();
	}
	
	public  double totalFacture() {
		 return super.totalfacture();
	}

	
}
