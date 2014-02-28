/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import DAO.AdministrateurDAO;
import Entity.Administrateur;
import java.util.List;

/**
 *
 * @author Ahmed
 */
public class testAdministrateur {
    
    public static void main(String args[]){
    Administrateur admin=new Administrateur("log", "pwd");
    admin.setNom("admin");
   admin.setPrenom("ma3andouch");
    admin.setTelephone(1595659);
    AdministrateurDAO admindao =new AdministrateurDAO();
    AdministrateurDAO admindao1 =new AdministrateurDAO();
    //test ajout réussi
    admindao.AjouterAdministrateur(admin);
    admindao1.AjouterAdministrateur(admin);
//    // test update réussi
   //admin.setNom("nomjdid");
    //admindao.ModifierAdministrateur(admin, "log");
        // test delete réussi 
     //System.out.println(admindao.SupprimerAdministrateur("log"));
    System.out.println(admindao.ChercherAdministrateur("log").toString());
    System.out.println(admindao.ListerAdministrateurs().toString());
//    List<Administrateur> l = admindao.ListerAdministrateurs();
//    
//    for (int i=0; i< l.size();i++)
//    {
//        System.out.println(l.get(i).getPrenom()+" "+l.get(i).getLogin());
//    }
    
      //  System.out.println(admindao.ChercherAdministrateur("loggg").getPrenom());
    
    
    
    
}
}