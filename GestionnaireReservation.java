import java.util.ArrayList;
import java.util.List;

public class GestionnaireReservation {
    private List<Reservation> reservations = new ArrayList<>();
    private List<Salle> salles = new ArrayList<>();

    public boolean estDisponible(Salle salle, String creneau) {
        for (Reservation r : reservations) {
            // Modifié pour correspondre au String de Reservation.java
          if (r.getSalle().equals(salle) && r.getTemps_reservation().equals(creneau)) {
                return false;
            }
        }
        return true;
    }

    public boolean existeSalle(String nomS) {
        for (int i = 0; i < salles.size(); i++) {
            if (salles.get(i).getNom().equalsIgnoreCase(nomS)) return true;
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
            for (Reservation r : reservations) {
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

    public static void main(String[] args) {
        System.out.println("ok");
    }
   //Le code d'erreur
     private List<Resarvation> reservations = new ArrayList<>();
     public boolean estDisponible(Salle salle, String creneau) {
      for (Reservation r : reservations) {
         if (r.getSalle().getNom().equals(salle.getNom())&& r.getCreneau().equals(creneau)) {
            return true;
         }
      }
      return false;
     }

     public static void main(string[] args){
        System.out.println();
     }
}
public static void
testSallelibre() {
   Salle salle = new Salle("Salle Test");
   GestionnaireReservation g = new GestionnaireReservation();
   if (g.estDisponible(salle"8H-10H")){
      System.out.println("Test ok : salle libre");
   } else {
System.out.println("Test Echec");
   }
}
public static void
testDoubleReservation(){
   Salle salle = new salle("salle test");
   GestionnaireReservation g = new GestionnaireReservation();
   g.reserver("Ali", salle, "8H-10H");
   g.reservation("Paul", salle, "8H-10H");
   system.out.println("Test double reservation excecuter");
}