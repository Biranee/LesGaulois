package personnages;

public class Village {
	private String nom; 
	private Chef chef;
	private int nbVillageois;
	private Gaulois[] Villageois;
	
public String getNom() {
		return nom;
	}
public void setNom(String nom) {
		this.nom = nom;
	}
public void setChef(Chef chef) {
		this.chef = chef;
	}
public Chef getChef() {
	return chef;
} 
public Village(String nom) {

	// TODO Auto-generated constructor stub
	this.nom = nom;
	this.Villageois = new Gaulois[100];
	this.nbVillageois = 0;
}
public void ajouterVillageois (Gaulois g){
}
}



