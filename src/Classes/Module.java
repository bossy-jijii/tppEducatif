package Classes;


public class Module {
    private String intitule;
    private Filiere filiere;
    private Enseignant responsable;

    // Constructeur
    public Module(String intitule, Filiere filiere, Enseignant responsable) {
        this.intitule = intitule;
        this.filiere = filiere;
        this.responsable = responsable;
    }

    // Méthodes d'accès (getters)
    public String getIntitule() {
        return intitule;
    }

    public Departement getFiliere() {
        return filiere;
    }

    public Enseignant getResponsable() {
        return responsable;
    }

    // Méthodes de modification (setters)
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public void setFiliere(Filiere filiere) {
        this.departement = departement;
    }

    public void setResponsable(Enseignant responsable) {
        this.responsable = responsable;
    }