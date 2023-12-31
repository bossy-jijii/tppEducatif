package controlleurClass;
import Classes.Departement;
import Classes.Enseignant;
import databaseConnection.syseducDatabase;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class controlleurEnsaignant {

    ArrayList<Enseignant> listOfEnsaignant;

    public controlleurEnsaignant() throws SQLException, ClassNotFoundException {
        this.listOfEnsaignant = new ArrayList<Enseignant>();
        syseducDatabase connection = new syseducDatabase();
        Connection con = connection.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from enseignant;");
        while (rs.next()) {
            this.listOfEnsaignant.add(new Enseignant(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getString("email"), rs.getInt("grade")));
        }
    }

    public void affichermenuEnseignant() throws SQLException, ClassNotFoundException {
        Scanner s = new Scanner(System.in);
        System.out.println("------Ensaignant Section------");
        System.out.println("1-Afficher Ensaignant");
        System.out.println("2-Inserez Ensaignant");
        System.out.println("3-Modifier Ensaignant");
        System.out.println("4-Afficher tous les Enseignants");
        System.out.println("enter your choice");
        Integer cd = s.nextInt();
        switch (cd) {
            case 1:
                Scanner idScanner = new Scanner(System.in);
                System.out.println("enter the id of the Enseignant:");
                Integer id = idScanner.nextInt();
                afficherEnseignant(id);
                break;
            case 2:
                Scanner si = new Scanner(System.in);
                System.out.println("enter nom :");
                String nom = si.nextLine();
                System.out.println("enter prenom :");
                String prenom = si.nextLine();
                System.out.println("enter email :");
                String email = si.nextLine();
                System.out.println("enter grade");
                Integer grade = si.nextInt();
                inserezEtudiant(nom, prenom, email, grade);
                break;
            case 3:
                Scanner smID = new Scanner(System.in);
                System.out.println("enter the id of enseignant you wanna modify:");
                Integer idm = smID.nextInt();

                for (Enseignant e : listOfEnsaignant)
                    if (e.getId() == idm) {
                        System.out.println(e.getNom() + " " + e.getPrenom() + " " + e.getEmail() + " " + e.getGrade());
                    }

                Scanner sm = new Scanner(System.in);
                System.out.println("new nom=");
                String nomM = sm.nextLine();
                System.out.println("new prenom=");
                String prenomM = sm.nextLine();
                System.out.println("new Email=");
                String emailM = sm.nextLine();
                System.out.println("new grade:");
                Integer gradeM = sm.nextInt();
                modifierEnsaignant(idm, nomM, prenomM, emailM, gradeM);
                break;
            case 4:
                getAllEnseignants();
                break;
        }

    }

    public void afficherEnseignant(Integer id) {
        for (Enseignant e : this.listOfEnsaignant)
            if (e.getId() == id) {
                System.out.println(e.getId() + " " + e.getNom() + " " + e.getPrenom() + " " + e.getEmail() + " " + e.getGrade());
            }
    }

    public void inserezEtudiant(String nom, String prenom, String email, Integer grade) throws SQLException, ClassNotFoundException {
        syseducDatabase connection = new syseducDatabase();
        Connection con = connection.getConnection();
        PreparedStatement stmt = con.prepareStatement("insert into enseignant(prenom,nom,email,grade) values (?,?,?,?)");
        stmt.setString(1, prenom);
        stmt.setString(2, nom);
        stmt.setString(3, email);
        stmt.setInt(4, grade);
        boolean s = stmt.execute();
        if (s)
            System.out.println("informations was added successfuly");


    }

    public void modifierEnsaignant(Integer id, String nom, String prenom, String email, Integer grade) throws SQLException, ClassNotFoundException {
        syseducDatabase connection = new syseducDatabase();
        Connection con = connection.getConnection();
        PreparedStatement stm = con.prepareStatement("update enseignant set nom=? ,prenom=?,email=?,grade=? where id=?");
        stm.setString(1, nom);
        stm.setString(2, prenom);
        stm.setString(3, email);
        stm.setInt(4, grade);
        stm.setInt(5, id);
        boolean s = stm.execute();
        if (s){
            System.out.println("informations updated successfully!!");}
    }
    public void getAllEnseignants() {
        for (Enseignant e : this.listOfEnsaignant) {
            System.out.println(e.getNom() + " " + e.getPrenom() + " " + e.getEmail() + " " + e.getGrade() + " " + e.getId());
        }
    }

}
