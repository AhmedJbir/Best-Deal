package DAO;

import Entity.Client;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Crud;
import util.MD5;


public class ClientDAO {
    
    Crud crud = new Crud();

    



    public boolean AjouterClient(Client c) {
         String sql =
                "INSERT INTO User (login,motDePasse,nom,prenom,adresse,telephone,sexe,DateDeNaissance,Role) VALUES ('"+c.getLogin()+"','"+MD5.md5Java(c.getMotDePasse())+"','"+c.getNom()+"','"+c.getPrenom()+"','"+c.getAdresse()+"','"+c.getTelephone()+"','"+c.getSexe()+"','"+c.getDateDeNaissance()+"','"+c.getRole()+"')";
        return crud.execute(sql);
    }

    public boolean ModifierClient (Client c,  String login) {
        String sql =
                "UPDATE User SET login='"+c.getLogin()+"', motDePasse='"
                +MD5.md5Java(c.getMotDePasse())+"', nom='"+c.getNom()+"', prenom='"+c.getPrenom()+"', adresse='"+c.getAdresse()+"', telephone='"+c.getTelephone()+"', dateDeNaissance='"+c.getDateDeNaissance()+"' WHERE login='"+login+"'";
        return crud.execute(sql);
    }

    public boolean SupprimerClient(String login) {
        String sql = "DELETE FROM User WHERE login='"+login+"'";
        return crud.execute(sql);
    }

    public List<Client> ListerClients() {
        try {
            String sql = "SELECT * FROM User WHERE role='Client'";
            ResultSet rs = crud.exeRead(sql);
            List<Client> liste = new ArrayList<Client>();
            while (rs.next()) {
                Client c = new Client();
                c.setLogin(rs.getString("login"));
                c.setNom(rs.getString("nom"));
                c.setPrenom(rs.getString("prenom"));
                c.setAdresse(rs.getString("adresse"));
                c.setTelephone(rs.getInt("telephone"));
                c.setDateDeNaissance(rs.getString("dateDeNaissance"));
                c.setSexe(rs.getString("sexe"));
                liste.add(c);
            }
            return liste;
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    
    public Client ChercherClient(String login) {
        try {
            String sql = "SELECT * FROM User WHERE login='" + login + "' AND role='Client'";
            ResultSet rs = crud.exeRead(sql);
            Client c = new Client();
            while (rs.next()) {
               c.setLogin(rs.getString("login"));
                c.setNom(rs.getString("nom"));
                c.setPrenom(rs.getString("prenom"));
                c.setAdresse(rs.getString("adresse"));
                c.setTelephone(rs.getInt("telephone"));
                c.setDateDeNaissance(rs.getString("dateDeNaissance"));
                c.setSexe(rs.getString("sexe"));;
            }
            return c;

        } catch (SQLException ex) {
            Logger.getLogger(DAO.ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
