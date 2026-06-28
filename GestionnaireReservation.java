import java.util.ArrayList;
import java.util.List;

public class GestionnaireReservation {
     //Le squelette de base que l'equipe va faire evoluer
     private List<Resarvation> reservations = new ArrayList<>();
     public boolean estDisponible(Salle salle, String creneau) {
      for (Resarvation r : reservations) {
         if (r.getSalle().getNom().equals(salle.getNom())&& r.getCreneau().equals(creneau)) {
            return false;
         }
      }
      return true;
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