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
public class Professeurs {
    protected String nom;
    protected String prenom;
    protected int Idprof;
    protected String matiere;
    
    public Professeurs(String nom,String prenom,int Idprof,String matiere){
    this.nom=nom;
    this.prenom=prenom;
    this.Idprof=Idprof;
    this.matiere=matiere;
    
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

    public int getIdprof() {
        return Idprof;
    }

    public void setIdprof(int Idprof) {
        this.Idprof = Idprof;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }
     @Override
    public String toString() {
        return "Professeurs{" + "nom=" + nom + ", prenom=" + prenom + ", Idprof=" + Idprof + ", matiere=" + matiere + '}';
    }

}
