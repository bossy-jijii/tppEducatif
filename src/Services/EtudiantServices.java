package Services;





import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import Classes.Etudiant;

public class EtudiantServices {
    private List<Etudiant> Etudiants = new ArrayList<>();

    public void addEtudiant(Etudiant Etudiant) {
        Etudiants.add(Etudiant);
    }

    public void deleteEtudiant(Etudiant Etudiant) {
        Etudiants.remove(Etudiant);
    }

    public void updateEtudiant(Etudiant oldEtudiant, Etudiant newEtudiant) {
        Iterator<Etudiant> iterator = Etudiants.iterator();
        while (iterator.hasNext()) {
            Etudiant currentEtudiant = iterator.next();
            if (currentEtudiant.equals(oldEtudiant)) {
                iterator.remove();
                Etudiants.add(newEtudiant);
                break;
            }
        }
    }


    public List<Etudiant> getAllEtudiants() {
        return Etudiants;
    }
}
