package PharmaGest;

import java.sql.DriverManager;
import java.sql.SQLException;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.util.Callback;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class databaseConnection {
    public static void writeToDatabase( String nom_fourniss,String prenom_fourniss, String adresse_fourniss, String email_fourniss, String tel_fourniss){


        String url = "jdbc:postgresql://localhost:5432/pharmacie";
        String databaseuser = "postgres";
        String databasePassword ="Salimiyati06";

        String nom= nom_fourniss;
        String prenom= prenom_fourniss;
        String adresse= adresse_fourniss;
        String email= email_fourniss;
        String tel= tel_fourniss;


        // query
        String query= "insert INTO fournisseur(nom, prenom,adresse,email, tel) VALUES(?,?,?,?,?)";



        try  {


            Connection con  = DriverManager.getConnection(url, databaseuser, databasePassword);
            PreparedStatement pst = con.prepareStatement(query);

            pst.setString(1,nom);
            pst.setString(2,prenom);
            pst.setString(3,adresse);
            pst.setString(4,email);
            pst.setInt(5,Integer.valueOf(Integer.parseInt(tel)));

            pst.executeUpdate();
            System.out.println("Successfully created.");

        }
        catch (Exception ex){
           Logger lgr=Logger.getLogger(databaseConnection.class.getName());
           lgr.log(Level.SEVERE, ex.getMessage(), ex);
           ex.printStackTrace();
        }
    }


}
