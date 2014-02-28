package Entity;


public class Administrateur extends User{
    
    private String nom;
    private String prenom;
    private int telephone;

    public Administrateur() {
        
        super();
        this.setRole("Administrateur");        
    }

    public Administrateur(String login, String motDePasse) {
        super(login, motDePasse);
        this.setRole("Administrateur");
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Administrateur{" + "nom=" + nom + ", prenom=" + prenom + ", telephone=" + telephone + '}';
    }
    
    
        
    
}
