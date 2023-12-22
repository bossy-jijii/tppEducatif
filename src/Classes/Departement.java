package Classes;
import java.util.ArrayList;

public class Departement {

    private int id;
    private String intitule;
    private String chef;

    ArrayList<Filiere> filieres = new ArrayList<Filiere>();


    public Departement() {
    }

    public Departement(Integer id,String intitule, String chef) {
        this.id=id;
        this.intitule = intitule;
        this.chef = chef;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getChef() {
        return chef;
    }

    public void setChef(String chef) {
        this.chef = chef;
    }

    public ArrayList<Filiere> getFilieres() {
        return filieres;
    }

    public void setFilieres(ArrayList<Filiere> filieres) {
        this.filieres = filieres;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
