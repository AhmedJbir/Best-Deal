package Entity;


public class PrestataireDeService extends User{
    
    private String societe;
    private String adresse;
    private String descriptif;
    private String logo;
    private int telephone;
    private int statut;   // Quand un internaute fait une inscription en tant que Prestataire de service, il aura initialement la valeur 0, Quand l'administrateur accepte sa demande, il aura la valeur 1. 

    public PrestataireDeService() {
        super();
        this.statut = 0;
        this.setRole("PrestataireDeService");
    }

    public PrestataireDeService(String login, String motDePasse) {
        super(login, motDePasse);
        this.statut = 0;
        this.setRole("PrestataireDeService");
    }

    public String getSociete() {
        return societe;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getDescriptif() {
        return descriptif;
    }

    public String getLogo() {
        return logo;
    }

    public int getTelephone() {
        return telephone;
    }

    public int getStatut() {
        return statut;
    }
           
    public void setSociete(String societe) {
        this.societe = societe;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public void setStatut(int statut) {
        this.statut = statut;
    }
    
            
    
}
