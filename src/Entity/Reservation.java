package Entity;

import java.util.Date;


public class Reservation {
    
    private int idReservation;
    private int quantite;
    private Date dateReservation;

    public Reservation() {
    }

    public Reservation(int quantite, Date dateReservation) {
        this.quantite = quantite;
        this.dateReservation = dateReservation;
    }

    public int getIdReservation() {
        return idReservation;
    }

    public int getQuantite() {
        return quantite;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }
    
    
    
}
