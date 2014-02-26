package Entity;

import java.util.Date;


public class Statistique {
    
    private int idStatistique;
    private Administrateur administrateur;
    private PrestataireDeService prestataireDeService;
    private Date dateDebut;
    private Date dateFin;

    public Statistique() {
    }

    public Statistique(int idStatistique, Date dateDebut, Date dateFin) {
        this.idStatistique = idStatistique;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public int getIdStatistique() {
        return idStatistique;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public Administrateur getAdministrateur() {
        return administrateur;
    }

    public PrestataireDeService getPrestataireDeService() {
        return prestataireDeService;
    }

    
    public void setIdStatistique(int idStatistique) {
        this.idStatistique = idStatistique;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public void setAdministrateur(Administrateur administrateur) {
        this.administrateur = administrateur;
    }

    public void setPrestataireDeService(PrestataireDeService prestataireDeService) {
        this.prestataireDeService = prestataireDeService;
    }
    
    
    
}
