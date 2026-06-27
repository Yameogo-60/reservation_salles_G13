//Le developpeur 2
import java.util.ArrayList;
import java.util.List;
public class Reservation {

    private int id;
    private String salle;
    private String etudiant;
    private String temps_reservation;

    public Reservation(int id, String salle, String etudiant, String temps_reservation) {
        this.id = id;
        this.salle = salle;
        this.etudiant = etudiant;
        this.temps_reservation = temps_reservation;
    }

    // Getters
    public int getId() { 
        return id;
         }

    public String getSalle() { 
        return salle;
         }

    public String getEtudiant() {
         return etudiant; 
         }

    public String getTemps_reservation() { 
        return temps_reservation; 
        }

     private static ArrayList<Reservation> listeReservations = new ArrayList();
    // Ajout d'une reservation 
    public void reserver(Reservation r){
        listeReservations.add(r);
        System.out.println("votre reservation a été ajouter");
    }
    // Ajout de l'annulation d'une reservation
    public void annuler(int id){
        for(int i = 0; i<listeReservations.size(); i++){
            if(listeReservations.get(i).getId() == id){
                listeReservations.remove(i);
            } 
        }
       
    }

    @Override
    public String toString() {
        return "Reservation{" +
               "id=" + id + "
               , etudiant='" + etudiant + "'
               , salle='" + salle + "' 
               , temps_reservation='" + temps_reservation + "'}";
    }
}