package Classes;

public class Filiere {
    public class Etudiant {
        private String intitule;
        private Enseignant responsable ;
        private Departement departement;

    }
    // Constructeur
    public Filiere(String  intitule, Enseignant responsable, Departement departement) {
        this.intitule =  intitule;
        this.responsable = responsable;
        this.departement = departement;
    }
    // Méthodes d'accès (getters)
    public String getIntitule() {
        return intitule;
    }

    public String getResponsable() {
        return responsable;
    }

    public String getDepartement() {
        return departement;
    }

    // Méthodes de modification (setters)
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public void setResponsable(String responsable) {
        this.responsable= responsable;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

}
