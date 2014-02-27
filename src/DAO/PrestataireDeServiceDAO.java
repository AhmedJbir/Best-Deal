package DAO;

import Entity.PrestataireDeService;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Crud;
import util.MD5;


public class PrestataireDeServiceDAO {
    
    Crud crud = new Crud();

    



    public boolean AjouterPrestataireDeService(PrestataireDeService ps) {
         String sql =
                "INSERT INTO User (login,motDePasse,adresse,descriptif,societe,logo,telephone,role,statut) VALUES ('"+ps.getLogin()+"','"+MD5.md5Java(ps.getMotDePasse())+"','"+ps.getAdresse()+"','"+ps.getDescriptif()+"','"+ps.getSociete()+"','"+ps.getLogo()+"','"+ps.getTelephone()+"','"+ps.getRole()+"','"+ps.getStatut()+"')";
        return crud.execute(sql);
    }

    public boolean ModifierPrestataireDeService(PrestataireDeService ps,  String login) {
        String sql =
                "UPDATE User SET login='"+ps.getLogin()+"', motDePasse='"
                +MD5.md5Java(ps.getMotDePasse())+"', adresse='"+ps.getAdresse()+"', descriptif='"+ps.getDescriptif()+"',telephone='"+ps.getTelephone()+"', societe='"+ps.getSociete()+"', logo='"+ps.getLogo()+"' WHERE login='"+login+"'";
        return crud.execute(sql);
    }

    public boolean SupprimerPrestataireDeService(String login) {
        String sql = "DELETE FROM User WHERE login='"+login+"' AND role='PrestataireDeService'";
        return crud.execute(sql);
    }

    public List<PrestataireDeService> ListerPrestatairesDeService() {
        try {
            String sql = "SELECT * FROM User WHERE role='PrestataireDeService'";
            ResultSet rs = crud.exeRead(sql);
            List<PrestataireDeService> liste = new ArrayList<PrestataireDeService>();
            while (rs.next()) {
                PrestataireDeService p = new PrestataireDeService();
                p.setLogin(rs.getString("login"));
                p.setAdresse(rs.getString("adresse"));
                p.setDescriptif(rs.getString("descriptif"));
                p.setTelephone(rs.getInt("telephone"));
                p.setSociete(rs.getString("societe"));
                p.setLogo(rs.getString("logo"));
                liste.add(p);
            }
            return liste;
        } catch (SQLException ex) {
            Logger.getLogger(PrestataireDeServiceDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    
    public PrestataireDeService ChercherPrestataireDeService(String login) {
        try {
            String sql = "SELECT * FROM User WHERE login='" + login + "' AND role='PrestataireDeService'";
            ResultSet rs = crud.exeRead(sql);
            PrestataireDeService p= new PrestataireDeService();
            while (rs.next()) {
               p.setLogin(rs.getString("login"));
                p.setAdresse(rs.getString("adresse"));
                p.setDescriptif(rs.getString("descriptif"));
                p.setTelephone(rs.getInt("telephone"));
                p.setSociete(rs.getString("societe"));
                p.setLogo(rs.getString("logo"));
                ;
            }
            return p;

        } catch (SQLException ex) {
            Logger.getLogger(DAO.PrestataireDeServiceDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
