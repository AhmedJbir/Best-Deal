package Entity;

import java.util.Date;


public class Notification {
    
    private int idNotification;
    private User fromUser;
    private User toUser;
    private Date dateNotification;
    private String typeNotification;
    private String message;
    private Deal deal;

    public Notification() {
    }

    public Notification(User toUser, Date dateNotification, String typeNotification, String message) {
        this.toUser = toUser;
        this.dateNotification = dateNotification;
        this.typeNotification = typeNotification;
        this.message = message;
    }

    public int getIdNotification() {
        return idNotification;
    }

    public User getFromUser() {
        return fromUser;
    }

    public User getToUser() {
        return toUser;
    }

    public Date getDateNotification() {
        return dateNotification;
    }

    public String getTypeNotification() {
        return typeNotification;
    }

    public String getMessage() {
        return message;
    }

    public Deal getDeal() {
        return deal;
    }

    public void setIdNotification(int idNotification) {
        this.idNotification = idNotification;
    }

    public void setFromUser(User fromUser) {
        this.fromUser = fromUser;
    }

    public void setToUser(User toUser) {
        this.toUser = toUser;
    }

    public void setDateNotification(Date dateNotification) {
        this.dateNotification = dateNotification;
    }

    public void setTypeNotification(String typeNotification) {
        this.typeNotification = typeNotification;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDeal(Deal deal) {
        this.deal = deal;
    }
    
    
}
