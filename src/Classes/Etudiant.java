package Classes;
import java.util.List;

public class Etudiant {
    private String nom;
    private String prenom;
    private String email;
    private int apogee;
    private Filiere filiere;
}
    // Constructeur
    public Etudiant(String nom, String prenom, String email, int apogee, Filiere filiere) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.apogee = apogee;
        this.filiere = filiere;
    }
    // Méthodes d'accès (getters)
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public int getApogee() {
        return apogee;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    // Méthodes de modification (setters)
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setApogee(int apogee) {
        this.apogee = apogee;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }
