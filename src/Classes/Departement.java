package Classes;
import java.util.List;

public class Departement {
    private String intitule;
    private Enseignant responsable;
    private List<Filiere> filiere;

    // Constructeur
    public Departement(String intitule, Enseignant responsable) {
        this.intitule = intitule;
        this.responsable = responsable;
        this.filiere = new ArrayList<>();
    }

    // Méthodes d'accès (getters)
    public String getIntitule() {
        return intitule;
    }

    public Enseignant getResponsable() {
        return responsable;
    }

    public List<Filiere> getFiliere() {
        return filiere;
    }

    // Méthodes de modification (setters)
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public void setResponsable(Enseignant responsable) {
        this.responsable = responsable;
    }
