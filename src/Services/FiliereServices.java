package Services;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import Classes.Filiere;

class FiliereServices {
    private List<Filiere> Filieres = new ArrayList<>();

    public void addFiliere(Filiere Filiere) {
        Filieres.add(Filiere);
    }

    public void deleteFiliere(Filiere Filiere) {
        Filieres.remove(Filiere);
    }

    public void updateFiliere(Filiere oldFiliere, Filiere newFiliere) {
        Iterator<Filiere> iterator = Filieres.iterator();
        while (iterator.hasNext()) {
            Filiere currentFiliere = iterator.next();
            if (currentFiliere.equals(oldFiliere)) {
                iterator.remove();
                Filieres.add(newFiliere);
                break;
            }
        }
    }


    public List<Filiere> getAllFilieres() {
        return Filieres;
    }
}
