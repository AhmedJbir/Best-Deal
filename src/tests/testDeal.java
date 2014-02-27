package tests;

import DAO.ClientDAO;
import DAO.DealDAO;
import Entity.Client;
import Entity.Deal;
import Entity.PrestataireDeService;
import java.util.List;


public class testDeal {
    
     public static void main(String args[]){
        
           Deal deal=new Deal();
           PrestataireDeService p = new PrestataireDeService();
           p.setIdUser(2);
    deal.setDescriptif("un descriptif test");
    deal.setCategorie("mm");
    deal.setTypeDeal("Produit");
    deal.setDateDebut("27/02/2013");
   deal.setPrixInitial(111.2);
   deal.setPrixPromotionnel(11.8);
    deal.setPrestataireDeService(p);
  
    DealDAO dealDAO =new DealDAO();
//    //test ajout réussi
    dealDAO.AjouterDeal(deal);
    deal.setIdDeal(5);
    // test update réussi
    deal.setTypeDeal("Service");
    deal.setDateFin("28-02-2014");
    dealDAO.ModifierDeal(deal);
         //test delete réussi 
       // System.out.println(dealDAO.SupprimerDeal(deal));
    
//    List<Deal> l = dealDAO.ListerDeals();
//    
//    for (int i=0; i< l.size();i++)
//    {
//        System.out.println(l.get(i).getCategorie()+" "+l.get(i).getTypeDeal());
//    }
    
    //    System.out.println(dealDAO.RechercheParId(5).getDateDebut());
        
        
        // System.out.println(dealDAO.SupprimerDeal(deal));
    
    List<Deal> l = dealDAO.rechercherParCategorie("vêtement");
         System.out.println(l.size());
    
    for (int i=0; i< l.size();i++)
    {
        System.out.println(l.get(i).getDateFin()+" "+l.get(i).getTypeDeal());
    }
        
    }
    
}
