package Entity;

import java.util.Date;


public class Reservation {
    
    private int idReservation;
    private Client client;
    private Deal deal;
    private int quantite;
    private Date dateReservation;

    public Reservation() {
    }

    public Reservation(int quantite, Date dateReservation, Client client, Deal deal) {
        this.client = client;
        this.deal = deal;
        this.quantite = quantite;
        this.dateReservation = dateReservation;
    }

    public int getIdReservation() {
        return idReservation;
    }

    public Client getClient() {
        return client;
    }

    public Deal getDeal() {
        return deal;
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

    public void setClient(Client client) {
        this.client = client;
    }

    public void setDeal(Deal deal) {
        this.deal = deal;
    } 

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }
    
    
    
}
