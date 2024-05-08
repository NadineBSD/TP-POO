import java.util.*;

public class Diagnostic {
	
	private Set <Trouble> listeTroubles; 
	
	public Diagnostic() {
		listeTroubles = new HashSet<>();
    }
	
	public void ajouterTrouble(Trouble trouble) {
        listeTroubles.add(trouble);
    }

    public void modifierTrouble(Trouble ancienTrouble, Trouble nouveauTrouble) {
        if (listeTroubles.contains(ancienTrouble)) {
            listeTroubles.remove(ancienTrouble);
            listeTroubles.add(nouveauTrouble);
        } else {
            System.out.println("Le trouble à modifier n'existe pas dans la liste.");
        }
    }

    public void supprimerTrouble(Trouble trouble) {
        listeTroubles.remove(trouble);
    }

}
