package Classes;

public class Enseignant {
    private String nom;
    private String prenom;
    private String email;
    private String grade;
    private Departement departement;

    // Constructeur
    public Enseignant(String nom, String prenom, String email, String grade, Departement departement) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.grade = grade;
        this.departement = departement;
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

    public String getGrade() {
        return grade;
    }

    public Departement getDepartement() {
        return departement;
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

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }