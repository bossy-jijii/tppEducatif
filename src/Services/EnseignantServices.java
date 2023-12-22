package Services;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import Classes.Enseignant;

class EnseignantServices {
    private List<Enseignant> Enseignants = new ArrayList<>();

    public void addEnseignant(Enseignant Enseignant) {
        Enseignants.add(Enseignant);
    }

    public void deleteEnseignant(Enseignant Enseignant) {
        Enseignants.remove(Enseignant);
    }

    public void updateEnseignant(Enseignant oldEnseignant, Enseignant newEnseignant) {
        Iterator<Enseignant> iterator = Enseignants.iterator();
        while (iterator.hasNext()) {
            Enseignant currentEnseignant = iterator.next();
            if (currentEnseignant.equals(oldEnseignant)) {
                iterator.remove();
                Enseignants.add(newEnseignant);
                break;
            }
        }
    }


    public List<Enseignant> getAllEnseignants() {
        return Enseignants;
    }
}
