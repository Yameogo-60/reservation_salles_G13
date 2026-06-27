import java.util.ArrayList;
import java.util.List;

public class GestionnaireReservation {
   //Le code d'erreur
     private List<Resarvation> reservations = new ArrayList<>();
     public boolean estDisponible(Salle salle, String creneau) {
      for (Resarvation r : reservations) {
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