package Entity;

import java.sql.Date;


public class Client extends User{
    
    private String nom;
    private String prenom;
    private String adresse;
    private String sexe;
    private int telephone;
    private String dateDeNaissance;

    public Client() {
        super();
        this.setRole("Client");
    }

    public Client(String login, String motDePasse) {
        super(login, motDePasse);
        this.setRole("Client");
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
        

    public String getSexe() {
        return sexe;
    }

    public int getTelephone() {
        return telephone;
    }

    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }    

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }
    
    
    
}
