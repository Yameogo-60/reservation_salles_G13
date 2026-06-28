import java.util.ArrayList;
import java.util.List;

public class GestionnaireReservation {
    private List<Reservation> reservations = new ArrayList<>();
    private List<Salle> salles = new ArrayList<>();

    public boolean estDisponible(Salle salle, String creneau) {
        for (Reservation r : reservations) {
            if (r.getSalle().getNom().equals(salle.getNom()) && r.getCreneau().equals(creneau)) {
                return false;
            }
        }
        return true;
    }

    public boolean existeSalle(String nom) {
        for (int i = 0; i < salles.size(); i++) {
            Salle s = salles.get(i);
            if (s.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    public int nombreTotalReservations() {
        return this.reservations.size();
    }

    public static void main(String[] args) {
        System.out.println("Outils initialises.");
    }
}