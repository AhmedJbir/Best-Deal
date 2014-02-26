package Entity;


public class Evaluation {
    
    private int idEvaluation;
    private String commentaire;
    private String note;

    public Evaluation() {
    }

    public Evaluation(String commentaire, String note) {
        this.commentaire = commentaire;
        this.note = note;
    }

    public int getIdEvaluation() {
        return idEvaluation;
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

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    
    
}
