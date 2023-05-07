package PharmaGest;

import java.sql.Date;

public class Fourni {
    private String nom;
    private String prenom;
    private String adresse;
    private String email;
    private int tel;

    public Fourni( String nom, String prenom, String adresse, String email, int tel){
        this.nom=nom;
        this.prenom =prenom;
        this.adresse=adresse;
        this.email=email;
        this.tel=tel;
    }


    public String getNom() {
        return nom;
    }

    public String getPrenom() {

        return prenom;
    }
    public String getAdresse() {

        return adresse;
    }

    public String getEmail() {

        return email;
    }

    public int getTel() {

        return tel;
    }


}
