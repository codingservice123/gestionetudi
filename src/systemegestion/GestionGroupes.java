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
public class GestionGroupes {
    Groupe gestiongroupe= new Groupe();
    
    public GestionGroupes addGroupname(String nomgroupe){
    gestiongroupe.setNomgroupe(nomgroupe);
    return this;
    }
   
    public GestionGroupes addGroupId(String Idgroupe){
    gestiongroupe.setIdgroupe(Idgroupe);
    return this;
    }
    
}
