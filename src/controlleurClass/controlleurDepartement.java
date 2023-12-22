package controlleurClass;

import Classes.Departement;
import databaseConnection.syseducDatabase;

import javax.lang.model.util.ElementScanner6;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class controlleurDepartement {
    ArrayList<Departement> listOfDepartement;

    public controlleurDepartement() throws SQLException, ClassNotFoundException {
        this.listOfDepartement = new ArrayList<Departement>();
        syseducDatabase connection = new syseducDatabase();
        Connection con = connection.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select d.id,d.intitule,e.nom as chefDepartement from departement d inner join enseignant e on d.enseignant=e.id;");
        while (rs.next()) {
            this.listOfDepartement.add(new Departement(rs.getInt("id"), rs.getString("intitule"), rs.getString("chefDepartement")));
        }
    }

    public void affichermenuDepartement() throws SQLException, ClassNotFoundException {
        Scanner s = new Scanner(System.in);
        System.out.println("------Departement Section------");
        System.out.println("1-Afficher Departement");
        System.out.println("2-Inserez Departement");
        System.out.println("3-Modifier Departement");
        System.out.println("4-Afficher tous les Dpartements");
        System.out.println("enter your choice");
        Integer cd = s.nextInt();
        switch (cd) {
            case 1:
                Scanner idScanner = new Scanner(System.in);
                System.out.println("enter the id of the departement:");
                Integer id = idScanner.nextInt();
                afficherDeppartement(id);
                idScanner.close();
                break;
            case 2:
                Scanner si = new Scanner(System.in);
                System.out.println("enter the name of departement:");
                String nameOfDep = si.nextLine();
                System.out.println("enter the id of departementChef");
                Integer chefId = si.nextInt();
                inserezDepartement(nameOfDep, chefId);
                break;
            case 3:
                Scanner smID = new Scanner(System.in);
                System.out.println("enter the id of departement you wanna modify:");
                Integer idm = smID.nextInt();

                for (Departement d : listOfDepartement)
                    if (d.getId() == idm) {
                        System.out.println("intitule=" + d.getIntitule());
                        System.out.println("chefdep=" + d.getChef());
                    }
                Scanner sm = new Scanner(System.in);
                System.out.println("new intitule=");
                String newIntitule = sm.nextLine();
                System.out.println("new chefDep Id=");
                Integer chefDepId = sm.nextInt();
                modifierDepartement(idm, newIntitule, chefDepId);
                break;
            case 4:
                getAllDepartements();
                break;
        }

    }

    public void afficherDeppartement(Integer id) {
        for (Departement d : this.listOfDepartement)
            if (d.getId() == id) {
                System.out.println(d.getId() + " " + d.getIntitule() + " " + d.getChef());
            }
    }

    public void inserezDepartement(String intitule, Integer chef) throws SQLException, ClassNotFoundException {
        syseducDatabase connection = new syseducDatabase();
        Connection con = connection.getConnection();
        PreparedStatement stmt = con.prepareStatement("insert into departement(intitule,enseignant) values (?,?)");
        stmt.setString(1, intitule);
        stmt.setInt(2, chef);
        boolean s = stmt.execute();
        if (s)
            System.out.println("informations was added succesfuly");


    }

    public void modifierDepartement(Integer id, String intitule, Integer enseignant) throws SQLException, ClassNotFoundException {
        syseducDatabase connection = new syseducDatabase();
        Connection con = connection.getConnection();
        PreparedStatement stm = con.prepareStatement("update departement set intitule=? ,enseignant=? where id=?");
        stm.setString(1, intitule);
        stm.setInt(2, enseignant);
        stm.setInt(3, id);
        boolean s = stm.execute();
        if (s){
            System.out.println("informations updated successfully!!");}
    }

    public void getAllDepartements() {
        for (Departement d : this.listOfDepartement) {
            System.out.println(d.getId() + " " + d.getIntitule() + " " + d.getChef());
        }
    }

}

