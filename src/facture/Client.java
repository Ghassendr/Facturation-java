package facture;

import java.util.Scanner;

public class Client {
	Scanner sc=new Scanner(System.in);
int cinC ;
String mailC;
String nomC;
public Client(int cin ,String mailF,String nomC) {
	this.cinC=cin;
	this.mailC=mailF;
	this.nomC=nomC;
}
public Client () {
	saisirDetailsclient();
}

public int getCin() {
	return cinC;
}public void setCin(int cin) {
	this.cinC = cin;
}public String getMailF() {
	return mailC;
}public String getNomF() {
	return nomC;
}public void setMailF(String mailF) {
	this.mailC = mailF;
}public void setNomF(String nomF) {
	this.nomC = nomF;
}

public void saisirDetailsclient() {
	System.out.println("Donnez le cin de client ");
	this.cinC=sc.nextInt();
	System.out.println("Donnez le mail de client :");
	this.mailC=sc.next();
	System.out.println("Donnez le nom de client :");
	this.nomC=sc.next();
	
}
public void afficherclient() {
System.out.println("nom fournisseur "+this.nomC+"Mail : "+this.mailC+" cin :"+this.cinC);	
}
}
