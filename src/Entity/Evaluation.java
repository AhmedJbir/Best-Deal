package Entity;


public class Evaluation {
    
    private int idEvaluation;
    private Client client;
    private Deal deal;
    private String commentaire;
    private String note;

    public Evaluation() {
    }

    public Evaluation(String commentaire, String note, Client client, Deal deal) {
        this.client = client;
        this.deal = deal;
        this.commentaire = commentaire;
        this.note = note;
    }

    public int getIdEvaluation() {
        return idEvaluation;
    }

    public Client getClient() {
        return client;
    }

    public Deal getDeal() {
        return deal;
    }
    
    public String getCommentaire() {
        return commentaire;
    }

    public String getNote() {
        return note;
    }

    public void setIdEvaluation(int idEvaluation) {
        this.idEvaluation = idEvaluation;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setDeal(Deal deal) {
        this.deal = deal;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    
    
}
