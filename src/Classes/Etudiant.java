package Classes;


import java.util.ArrayList;

public class Etudiant {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private int apogee;
    private Filiere filiere;

    public Etudiant() {
    }

    public Etudiant(String nom, String prenom, String email, int apogee, Filiere filiere) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.apogee = apogee;
        this.filiere = filiere;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getApogee() {
        return this.apogee;
    }

    public void setApogee(int apogee) {
        this.apogee = apogee;
    }

    public Filiere getFiliere() {
        return this.filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }



    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
