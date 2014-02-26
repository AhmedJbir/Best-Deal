package DAO;

import Entity.Administrateur;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Crud;
import util.MD5;


public class AdministrateurDAO {
    
    Crud crud = new Crud();

    

    public boolean AjouterAdministrateur(Administrateur a) {
         String sql =
                "INSERT INTO User (login,motDePasse,nom,prenom,telephone,role) VALUES ('"+a.getLogin()+"','"+MD5.md5Java(a.getMotDePasse())+"','"+a.getNom()+"','"+a.getPrenom()+"','"+a.getTelephone()+"','"+a.getRole()+"')";
        return crud.exeCreate(sql);
    }

    public boolean ModifierAdministrateur(Administrateur a,  String login) {
        String sql =
                "UPDATE User SET login='"+a.getLogin()+"', motDePasse='"
                +MD5.md5Java(a.getMotDePasse())+"', nom='"+a.getNom()+"', prenom='"+a.getPrenom()+"',telephone='"+a.getTelephone()+"' WHERE login='"+login+"'";
        return crud.exeUpdate(sql);
    }

    public boolean SupprimerAdministrateur(String login) {
        String sql = "DELETE FROM User WHERE login='"+login+"'";
        return crud.exeDelete(sql);
    }

    public List<Administrateur> ListerAdministrateurs() {
        try {
            String sql = "SELECT * FROM User WHERE role='Administrateur'";
            ResultSet rs = crud.exeRead(sql);
            List<Administrateur> liste = new ArrayList<Administrateur>();
            while (rs.next()) {
                Administrateur a = new Administrateur();
                a.setLogin(rs.getString("login"));
                a.setNom(rs.getString("nom"));
                a.setPrenom(rs.getString("prenom"));
                a.setTelephone(rs.getInt("telephone"));
                liste.add(a);
            }
            return liste;
        } catch (SQLException ex) {
            Logger.getLogger(AdministrateurDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public Administrateur ChercherAdministrateur(String login) {
        try {
            String sql = "SELECT * FROM User WHERE login='" + login + "'";
            ResultSet rs = crud.exeRead(sql);
            Administrateur a = new Administrateur();
            while (rs.next()) {
                
                a.setLogin(rs.getString("login"));
                a.setNom(rs.getString("nom"));
                a.setPrenom(rs.getString("prenom"));
                a.setTelephone(rs.getInt("telephone"));;
            }
            return a;

        } catch (SQLException ex) {
            Logger.getLogger(AdministrateurDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

/*public Session Authentifier(Administrateur a) {

        try {
            String sql = "SELECT * FROM USER WHERE login='" + Session.getInstance().getUser().getLogin() + "' AND motDePasse='"+Session.getInstance().getUser().getMotDePasse()+"'AND role='administrateur'";
            ResultSet rs = crude.exeRead(sql);
            
            while (rs.next()) {
                
                a = new Administrateur();
                a.setLogin(rs.getString("logtin"));
                a.se(rs.getString("nomAdmin"));
                e.setPrenomAdmin(rs.getString("prenomAdmin"));
                e.setMailAdmin(rs.getString("mailAdmin"));
                e.setTelAdmin(rs.getInt("telAdmin"));
                e.setLoginAdmin(rs.getString("loginAdmin"));
                e.setPwdAdmin(rs.getString("pwdAdmin"));
            }
            return e;

        } catch (SQLException ex) {
            Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

}*/
    
}
