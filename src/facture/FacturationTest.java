package facture;
import java.util.Scanner;

public class FacturationTest {
	
	public static void main(String args[]) {
		
		FactureVente fv=new FactureVente(0,"",2,null) ;
		fv.saisirFactureVente();
		fv.afficherFacture();
		
		FactureAchat fa=new FactureAchat(0, "", 2, null);
		fa.saisirFactureAchat();
		fa.afficherFacture();

	    System.out.println("---tt----- ");
			
		Registre r=new Registre('2');
		r.ajouterFact(fa);
		r.ajouterFact(fv);
		r.afficher();
		if(r.supprimerfact(fv)) {
			
			
			System.out.println("suppression ok");
			r.afficher();
			
		}
		Fournisseur four=new Fournisseur(11,"qksd","qsrf");
		System.out.println("afficher fourn");
		System.out.println("****************************************************");
		r.afficheFactureFourn(four);

		System.out.println("****************************************************");
		r.afficherTotauxFactureVente();
		
	}
	
}
