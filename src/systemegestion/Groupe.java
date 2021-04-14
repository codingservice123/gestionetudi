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
public class Groupe{
    protected String Idgroupe;
    protected String nomgroupe;
    public Groupe(String nomgroupe,String Idgroupe){
      
   
    this.nomgroupe=nomgroupe;
    this.Idgroupe=Idgroupe;
   }

    Groupe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    public String getNomgroupe() {
        return nomgroupe;
    }

    public void setNomgroupe(String nomgroupe) {
        this.nomgroupe = nomgroupe;
    }

    

    public String getIdgroupe() {
        return Idgroupe;
    }

    public void setIdgroupe(String Idgroupe) {
        this.Idgroupe = Idgroupe;
    }
    @Override
    public String toString() {
        return "Groupe{" + "Idgroupe=" + Idgroupe + ", nomgroupe=" + nomgroupe + '}';
    }

    
   
}
