/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Entity.Evaluation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Crud;

/**
 *
 * @author Khalil
 */
public class EvaluationDAO {
      Crud crud = new Crud();
      
      public boolean AjouterEvaluation(Evaluation e) {
         String sql =
                "INSERT INTO evaluation (Commentaire,Note) VALUES ('"+e.getCommentaire()+"','"+e.getNote()+"')";
        return crud.execute(sql);
    }
      
       public boolean ModifierEvaluation(Evaluation e) {
        String sql =
                "UPDATE evaluation SET Commentaire='"+e.getCommentaire()+"', Note='"+e.getNote()+"'" ;
        return crud.execute(sql);
    }
       
        public boolean SupprimerEvaluation(Evaluation e) {
        String sql = "DELETE FROM evaluation WHERE idEvaluation='"+e.getIdEvaluation()+"'";
        return crud.execute(sql);
    }
      
       /*    public List<Evaluation> ListerEvaluation() {

        ClientDAO cdao = new ClientDAO();
        DealDAO ddao = new DealDAO();
        
        try {
            String sql = "SELECT * FROM Evaluation ";
            ResultSet rs = crud.exeRead(sql);
            List<Evaluation> liste = new ArrayList<Evaluation>();
            while (rs.next()) {
                
                Evaluation e = new Evaluation();
                e.setIdEvaluation(rs.getInt("idEvaluation"));
                e.setCommentaire(rs.getString("Commentaire"));
                e.setNote(rs.getString("Note"));
                e.setClient(cdao.ChercherClient(rs.getString(null)));
                e.setDeal(ddao.RechercheParId(rs.getInt(null)));
                liste.add(e);
            }
            return liste;
        } catch (SQLException ex) {
            Logger.getLogger(EvaluationDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    */
}
