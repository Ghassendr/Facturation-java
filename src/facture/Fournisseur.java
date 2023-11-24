package facture;

import java.util.Scanner;

public class Fournisseur {
	Scanner sc=new Scanner(System.in);
int cin ;
String mailF;
String nomF;
public Fournisseur(int cin ,String mailF,String nomF) {
	this.cin=cin;
	this.mailF=mailF;
	this.nomF=nomF;
}

public Fournisseur() {
this.saisirDetailsFour();}
public int getCin() {
	return cin;
}public void setCin(int cin) {
	this.cin = cin;
}public String getMailF() {
	return mailF;
}public String getNomF() {
	return nomF;
}public void setMailF(String mailF) {
	this.mailF = mailF;
}public void setNomF(String nomF) {
	this.nomF = nomF;
}
public void saisirDetailsFour() {
	System.out.println("Donnez le cin de fournisseur:");
	this.cin=sc.nextInt();
	System.out.println("Donnez le mail de fournisseur :");
	this.mailF=sc.next();
	System.out.println("Donnez le nom de fournisseur :");
	this.nomF=sc.next();
	
}
public void afficherFour() {
System.out.println("nom fournisseur "+this.nomF+" mail : "+this.mailF+"cin"+this.cin);	
}
}
