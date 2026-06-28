import java.util.ArrayList;
import java.util.List;

public class GestionnaireReservation {
    private List<Reservation> reservations = new ArrayList<>();
    private List<Salle> salles = new ArrayList<>();

    public boolean estDisponible(Salle salle, String creneau) {
        for (int i = 0; i < reservations.size(); i++) {
            Reservation r = reservations.get(i);
            // Validation avec getSalle() qui renvoie un String
            if (r.getSalle().equalsIgnoreCase(salle.getNom()) && r.getTemps_reservation().equals(creneau)) {
                return false; 
            }
        }
        return true; 
    }

    public boolean ajouterReservation(Reservation r) {
        // Creation d'une instance de Salle pour la verification de disponibilite
        Salle s = new Salle(0, r.getSalle());
        
        if (estDisponible(s, r.getTemps_reservation())) {
            reservations.add(r);
            System.out.println("Reservation ajoutee avec succes");
            return true;
        } else {
            System.out.println("Erreur : La salle est deja prise");
            return false;
        }
    }

    public boolean existeSalle(String nomS) {
        for (int i = 0; i < salles.size(); i++) {
            if (salles.get(i).getNom().equalsIgnoreCase(nomS)) {
                return true;
            }
        }
        return false;
    }

    public int nombreTotalReservations() {
        return reservations.size();
    }

    public void ajouterSalle(Salle s) {
        salles.add(s);
        System.out.println("salle ajoutee");
    }

    public void afficherToutesLesReservations() {
        System.out.println("Liste des reservations :");
        if (reservations.size() == 0) {
            System.out.println("Rien pour l'instant");
        } else {
            for (int i = 0; i < reservations.size(); i++) {
                Reservation r = reservations.get(i);
                System.out.println(r.getSalle() + " - " + r.getTemps_reservation());
            }
        }
    }

    public List<Reservation> obtenirReservationsParSalle(String nom) {
        List<Reservation> liste = new ArrayList<>();
        for (int i = 0; i < reservations.size(); i++) {
            Reservation r = reservations.get(i);
            if (r.getSalle().equalsIgnoreCase(nom)) {
                liste.add(r);
            }
        }
        return liste;
    }

    // Main de test classique et lineaire
    public static void main(String[] args) {
        GestionnaireReservation g = new GestionnaireReservation();

        Salle salleTest = new Salle(1, "Salle Informatique");
        g.ajouterSalle(salleTest);

        // Correspondance parfaite avec le constructeur (int, String, String, String)
        Reservation r1 = new Reservation(1, "Ali", "Salle Informatique", "8H-10H");
        Reservation r2 = new Reservation(2, "Paul", "Salle Informatique", "8H-10H");

        System.out.println("--- Test 1 : Premiere reservation ---");
        g.ajouterReservation(r1);

        System.out.println("--- Test 2 : Tentative de doublon ---");
        g.ajouterReservation(r2);
        
        System.out.println("--- Test 3 : Affichage ---");
        g.afficherToutesLesReservations();
    }
}