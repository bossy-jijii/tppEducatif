package Services;

import java.util.ArrayList;

import Classes.Module;
import Classes.Enseignant;
import Classes.Etudiant;
import Classes.Filiere;
import Classes.Departement;
import Services.DepartementServices;
import Services.EnseignantServices;
import Services.EtudiantServices;
import Services.FiliereServices;
import Services.ModuleServices;


    public class DB {
        public static int DEPT_ID = 0;
        public static int ENS_ID = 0;
        public static int ETD_ID = 0;
        public static int FIL_ID = 0;
        public static int MOD_ID = 0;
        public static ArrayList<Departement> departements = new ArrayList();
        public static ArrayList<Enseignant> enseignants = new ArrayList();
        public static ArrayList<Filiere> filieres = new ArrayList();
        public static ArrayList<Module> modules = new ArrayList();
        public static ArrayList<Etudiant> etudiants = new ArrayList();

        public DB() {
        }

        public static int getDeptId() {
            ++DEPT_ID;
            return DEPT_ID;
        }

        public static int getEnsId() {
            ++ENS_ID;
            return ENS_ID;
        }
    }

