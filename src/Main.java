


import Classes.*;
import Services.*;
import databaseConnection.syseducDatabase;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;
import controlleurClass.*;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Scanner firstChoice=new Scanner(System.in);
        System.out.println("-------System de Gestion--------");
        System.out.println("1-Departement");
        System.out.println("2-Enseignant");
        System.out.println("enter your choice:");
        Integer c1=firstChoice.nextInt();
        switch (c1){
            case 1:
                controlleurDepartement cd=new controlleurDepartement();
                cd.affichermenuDepartement();
                break;
            case 2:
                controlleurEnsaignant ce=new controlleurEnsaignant();
                ce.affichermenuEnseignant();
                break;
        }
    }
}

