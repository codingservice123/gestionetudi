/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemegestion;

/**
 *
 * @author Nomad Soul
 */
public class Gestionetudiant {
    Etudiant gestionetudiant= new Etudiant();
     public Gestionetudiant addName(String nom){
   gestionetudiant.setNom(nom);
   return this;
   }
    public Gestionetudiant addLName(String prenom){
   gestionetudiant.setPrenom(prenom);
   return this;
   } 
   public Gestionetudiant addFiliere(String filiere){
   gestionetudiant.setFiliere(filiere);
   return this;
   }
    public Gestionetudiant addId(int Id){
    gestionetudiant.setId(Id);
    return this;
    }
    
  
    
   
    
    
}
