package Entity;

import java.util.Date;


public class Deal {

    private int idDeal;
    private PrestataireDeService prestataireDeService;   //On en a besoin pour avoir l'idPrestataireDeService ( clé étrangère ).
    private int quantite;
    private String libelle;
    private String typeDeal;
    private String categorie;
    private String descriptif;
    private String image;
    private String dateDebut;
    private String dateFin;
    private Double prixInitial;
    private Double prixPromotionnel;
    private int Statut;    // Quand un Prestataire de service ajoute un deal, le deal aura un statut 0, quand l'administrateur valide le deal, il aura la valeur 1.

    public Deal() {
    }

    public Deal(int idDeal, int quantite, String libelle, String typeDeal, String categorie, String descriptif, String image, String dateDebut, String dateFin, Double prixInitial, Double prixPromotionnel, int Statut) {
        this.idDeal = idDeal;
        this.quantite = quantite;
        this.libelle = libelle;
        this.typeDeal = typeDeal;
        this.categorie = categorie;
        this.descriptif = descriptif;
        this.image = image;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.prixInitial = prixInitial;
        this.prixPromotionnel = prixPromotionnel;
        this.Statut = Statut;
    }

    public int getIdDeal() {
        return idDeal;
    }

    public PrestataireDeService getPrestataireDeService() {
        return prestataireDeService;
    }
    
    public int getQuantite() {
        return quantite;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getTypeDeal() {
        return typeDeal;
    }

    public String getCategorie() {
        return categorie;
    }

    public String getDescriptif() {
        return descriptif;
    }

    public String getImage() {
        return image;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }

    public Double getPrixInitial() {
        return prixInitial;
    }

    public Double getPrixPromotionnel() {
        return prixPromotionnel;
    }

    public int getStatut() {
        return Statut;
    }

    public void setIdDeal(int idDeal) {
        this.idDeal = idDeal;
    }

    public void setPrestataireDeService(PrestataireDeService prestataireDeService) {
        this.prestataireDeService = prestataireDeService;
    }
    

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setTypeDeal(String typeDeal) {
        this.typeDeal = typeDeal;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public void setPrixInitial(Double prixInitial) {
        this.prixInitial = prixInitial;
    }

    public void setPrixPromotionnel(Double prixPromotionnel) {
        this.prixPromotionnel = prixPromotionnel;
    }

    public void setStatut(int Statut) {
        this.Statut = Statut;
    }
    
        
    
}
