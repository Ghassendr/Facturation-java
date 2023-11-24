package facture;

import java.util.Scanner;

public class LigneFacture {
	private int Quantite;
		 private Article rb;
		 
		 Scanner sc=new Scanner(System.in);
	public LigneFacture(int Quantite, Article rb) {
this.Quantite=Quantite;
this.rb=rb;
	}
		 
public LigneFacture() {
	 this.saisirligneFacture();
	}

public Article getRb() {
	return rb;}
public void setArticle (Article rb) {
	this.rb=rb;

}		 public int getQuantite() {
	return Quantite;
}public void setQuantite(int quantite) {
	this.Quantite = quantite;
}

public void  saisirligneFacture() {
	this.rb=new Article();
	System.out.println("Donnez la quantite :");
	this.Quantite=sc.nextInt();
}

public void  afficherligneFacture() {
	this.rb.afficherarticle();
	System.out.println("la quantite est: "+this.Quantite );
}
		 
		}

