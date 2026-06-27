public class Salle{
    private int id;
    private String nom;
    //Constructeur
    public Salle(int id, String nom){
        this.id = id;
        this.nom = nom;
    }
    //getters
    public int getId(){
        return id;
    }
    public String getNom(){
        return nom;
    }
    //setters
    public void setId(int id){
        this.id = id;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
}