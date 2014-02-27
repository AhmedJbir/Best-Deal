/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import DAO.ClientDAO;
import DAO.PrestataireDeServiceDAO;
import Entity.Client;
import Entity.PrestataireDeService;
import java.util.List;

/**
 *
 * @author Ahmed
 */
public class testPrestataireDeService {
    
    public static void main(String args[]){
    
     PrestataireDeService p=new PrestataireDeService("lodsdggg", "pwwwd");
     PrestataireDeService p1=new PrestataireDeService("lo", "pwwwd");
    
    p.setAdresse("sqddqs");
    p.setTelephone(123);
  
    
    PrestataireDeServiceDAO prestataireDeServicedao =new PrestataireDeServiceDAO();
        System.out.println(prestataireDeServicedao.ChercherPrestataireDeService("lodsdggg").getTelephone());
//    //test ajout réussi
    prestataireDeServicedao.AjouterPrestataireDeService(p);
  p.setSociete("jjjjjj");
   prestataireDeServicedao.AjouterPrestataireDeService(p1);
  prestataireDeServicedao.ModifierPrestataireDeService(p, "lodsdggg");
  prestataireDeServicedao.SupprimerPrestataireDeService("lodsdggg");
//    // test update réussi
//    client.setNom("nomjdid");
//    clientdao.ModifierClient(client, "loggg");
//        // test delete réussi 
//       // System.out.println(clientdao.SupprimerClient("loggg"));
    
    List<PrestataireDeService> l = prestataireDeServicedao.ListerPrestatairesDeService();
    
    for (int i=0; i< l.size();i++)
    {
        System.out.println(l.get(i).getStatut()+" "+l.get(i).getLogin());
    }
    
      //  System.out.println(prestataireDeServicedao.ChercherClient("loggg").getPrenom());
        
   }
    
}
