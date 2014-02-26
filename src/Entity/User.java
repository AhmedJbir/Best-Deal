package Entity;


public abstract class User {
    
    private int idUser;
    private String login;
    private String motDePasse;
    private String role;

    public User() {
    }
        
    public User(String login, String motDePasse) {
        this.login = login;
        this.motDePasse = motDePasse;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getLogin() {
        return login;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public String getRole() {
        return role;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    

    
    
    
    
}
