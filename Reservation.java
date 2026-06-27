//Le developpeur 2
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

    @Override
    public String toString() {
        return "Reservation{" +
               "id=" + id + "
               , etudiant='" + etudiant + "'
               , salle='" + salle + "' 
               , temps_reservation='" + temps_reservation + "'}";
    }
}