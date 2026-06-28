import java.util.ArrayList;
import java.util.List;

public class GestionnaireReservation {
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