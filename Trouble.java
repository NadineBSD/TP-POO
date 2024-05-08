
public class Trouble {

	private String nom;

	private TypeTroubles categorie;

	public Trouble(String nom, TypeTroubles categorie) {
		this.nom = nom;
		this.categorie = categorie;
	}

	public String getNom() {
		return nom;
	}

	public String getCategorie() {

		switch (this.categorie) {

		case TROUBLE_DEGLUTITION:
			return "trouble de la déglutition";
		case TROUBLE_NEURO_DEVELOPPEMENTAL:
			return "trouble neuro-développemental";
		case TROUBLE_COGNITIF:
			return "trouble cognitif";
		default:
			return "";
		}
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setCategorie(TypeTroubles categorie) {
        this.categorie = categorie;
    }
}
