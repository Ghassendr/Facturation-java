package facture;


import java.util.Scanner;

public abstract class Facture implements OperationFactures {
	 Scanner sc=new Scanner(System.in);

	int numFact;
	String 	date;
	int nbLigneFact;
	public LigneFacture tabligfact[] ;
	 
public 	Facture ( int numFact ,String 	date,int nbmax ) {
	this.date=date;
	this.numFact=numFact;
	tabligfact=new LigneFacture [nbmax];
	nbLigneFact=0;
}
public boolean ajouterLign(LigneFacture lf) {
	if(nbLigneFact<tabligfact.length) {
		tabligfact[nbLigneFact]=lf;
		nbLigneFact++;
		return true;
	}
	return false;
}
public int getNumFact() {
	return numFact;
}
public void setNumFact(int numFact) {
	this.numFact = numFact;
}
public String getDate() {
	return date;
}public void setDate(String date) {
	this.date = date;
}
public void setTabligfact(LigneFacture[] tabligfact) {
	this.tabligfact = tabligfact;
}public int getNbLigneFact() {
	return nbLigneFact;
}
@Override
public void saisirfacture () {
	System.out.println("Donnez le numero de la facture:");
	numFact=sc.nextInt();
	System.out.println("Donnez la date de la facture :");
	date=sc.next();
	System.out.println("donner nombre lignes :");
	this.nbLigneFact=sc.nextInt();
	for (int i=0;i<this.nbLigneFact;i++) {
		this.tabligfact[i]=new LigneFacture();
	}
	
}@Override
public void affichefacture() {
	System.out.println("le numero : "+ this.numFact+" la date :"+this.date);
	for (int i=0;i<tabligfact.length;i++) {
		tabligfact[i].afficherligneFacture();
	}
	
}
public double totalfacture () {
	double total= 0;
	for (int i=0;i<tabligfact.length;i++) {
total+=( tabligfact[i].getQuantite() *  tabligfact[i].getRb().getPrix());
	
}return total;
	}



}
