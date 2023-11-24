package facture;

import java.util.Scanner;

public class Article {
private int numArticle ;
private  String Libelle;
private  double Prix ;
private  int count =0;
Scanner sc=new Scanner(System.in);
public Article(String Libelle,double Prix ) {
	this.Libelle=Libelle;
	this.Prix=Prix;
	count++;
	numArticle=count;
}public Article() {
	this.saisirarticle();
}
public double getPrix() {
	return Prix;
}public void setPrix(double prix) {
	Prix = prix;
}public String getLibelle() {
	return Libelle;
}public void setLibelle(String libelle) {
	Libelle = libelle;
}
public void saisirarticle() {
	System.out.println("Donnez le prix de larticle :");
this.Prix=sc.nextDouble();
	System.out.println("Donnez le libelle de larticle :");
this.Libelle=sc.next();
	
}
public void afficherarticle() {
	System.out.println("le libelle : "+Libelle+"le prix : "+Prix);
	
}
}
