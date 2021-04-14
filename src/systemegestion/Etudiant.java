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
public class Etudiant extends Groupe{
    protected String nom;

    
    protected String prenom;
    protected String filiere;
    protected int Id;
    
    public Etudiant(String nom,String prenom,String filiere,int Id,String nomgroupe,String Idgroupe){
     super(nomgroupe,Idgroupe);
    this.nom=nom;
    this.prenom=prenom;
    this.filiere=filiere;
    this.Id=Id;
   }

    Etudiant() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    

    

    @Override
    public String toString() {
        return "Etudiant{" + "nom=" + nom + ", prenom=" + prenom + ", filiere=" + filiere + ", Id=" + Id +",nomgroupe=" +nomgroupe+",idgroupe="+Idgroupe+'}';
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
   
  
    
}
