/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import DAO.EvaluationDAO;
import Entity.Client;
import Entity.Deal;
import Entity.Evaluation;
import Entity.PrestataireDeService;
import java.util.List;

/**
 *
 * @author Khalil
 */
public class testEvaluation {
      public static void main(String args[]){
      
          Evaluation evaluation=new Evaluation();
          Client c = new Client();
          c.setIdUser(2);
          Deal d=new Deal();
          d.setIdDeal(2);
          evaluation.setCommentaire("Mauvais produit");
          evaluation.setNote("0");
          evaluation.setDeal(d);
          evaluation.setClient(c);
          //evaluation.setIdEvaluation(1);
          EvaluationDAO evaluationDAO =new EvaluationDAO();
          
          evaluationDAO.AjouterEvaluation(evaluation);
           //test ajout réussi
          evaluation.setCommentaire("commentaire modifier");
        //  evaluationDAO.ModifierEvaluation(evaluation);
           // test update réussi
          
          //evaluationDAO.SupprimerEvaluation(evaluation);
           //test delete réussi 
        //   List<Evaluation> l = evaluationDAO.ListerEvaluation();
   
    /*for (int i=0; i< l.size();i++)
    {
        System.out.println(l.get(i).getCommentaire()+" "+l.get(i).getNote()+" "+l.get(i).getClient()+" "+l.get(i).getDeal());
    }*/
      }
  
}
