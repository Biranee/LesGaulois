package personnages;

public class Gaulois {
	private string nom;
	private int force;
	private int effetPotion=1;
	
	
	public Gaulois(string nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
		
	}


	public string getNom() {
		return nom;
	}


	public void setNom(string nom) {
		this.nom = nom;
	}


	@Override
	public String toString() {
		return "Gaulois [force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	
	

}
