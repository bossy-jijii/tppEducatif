package Services;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import Classes.Departement;

public class DepartementServices {
    private List<Departement> departements = new ArrayList<>();

    public void addDepartement(Departement departement) {
        departements.add(departement);
    }

    public void deleteDepartement(Departement departement) {
        departements.remove(departement);
    }

    public void updateDepartement(Departement oldDepartement, Departement newDepartement) {
        Iterator<Departement> iterator = departements.iterator();
        while (iterator.hasNext()) {
            Departement currentDepartement = iterator.next();
            if (currentDepartement.equals(oldDepartement)) {
                iterator.remove();
                departements.add(newDepartement);
                break;
            }
        }
    }

    public List<Departement> getAllDepartements() {
        return departements;
    }



    public List<Departement> getDepartements() {
        return departements;
    }
}
