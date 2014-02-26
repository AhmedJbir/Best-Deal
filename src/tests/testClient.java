package tests;

import DAO.ClientDAO;
import Entity.Client;
import java.sql.Date;
import java.util.List;


public class testClient {
    
    public static void main(String args[]){
        
           Client client=new Client("loggg", "pwwwd");
    client.setNom("ad");
    client.setPrenom("euhlol");
  
    client.setTelephone(158);
    ClientDAO clientdao =new ClientDAO();
//    //test ajout réussi
    clientdao.AjouterClient(client);
//    // test update réussi
    client.setNom("nomjdid");
    clientdao.ModifierClient(client, "loggg");
        // test delete réussi 
       // System.out.println(clientdao.SupprimerClient("loggg"));
    
    List<Client> l = clientdao.ListerClients();
    
    for (int i=0; i< l.size();i++)
    {
        System.out.println(l.get(i).getPrenom()+" "+l.get(i).getLogin());
    }
    
        System.out.println(clientdao.ChercherClient("loggg").getPrenom());
        
    }
    
}
