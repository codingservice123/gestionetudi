/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemegestion;

import java.util.Scanner;

/**
 *
 * @author Nomad Soul
 */
public class Systemegestion {
     static Groupe gestiongroupe;
     static Etudiant gestionetudiant;
     static Professeurs gestionprofesseurs;
     static Scanner input= new Scanner(System.in);
     
    /**
     * @return 
     */
     
     public static void main(String args[]){
       //Initialisation du menu
         System.out.println("1-Gestion Groupes");
        System.out.println("2-Gestion Etudiant");
        System.out.println("3-Gestion Professeurs");
        System.out.println("4-Gestion Groupe-Etudiant");
        System.out.println("5-Quitter"); 
        
        
        //Choix Utilisateur
        int choix;
     System.out.println("Veuillez choisir une option");
      choix=input.nextInt();
        switch(choix)
      { case 1:  
          System.out.println("1-Créer un Groupe");
          System.out.println("2-Modifier un Groupe");
          System.out.println("3-Voir les détails d'un groupe");
          System.out.println("4-Supprimer un groupe");
          System.out.println("5-Afficher tous les groupes");
          System.out.println("6-Quitter");
         break;
          
      case 2:
           System.out.println("1-Ajouter un étudiant");
           System.out.println("2-Modifier un étudiant");
           System.out.println("3-Voir les détails d'un étudiant");
           System.out.println("4-Supprimer un étudiant");
           System.out.println("5-Afficher tous les étudiant");
           System.out.println("6-Quitter");

          break;
      case 3:
          System.out.println("1-Ajouter un professeur");
           System.out.println("2-Modifier un professeur");
           System.out.println("3-Voir les détails d'un professeur");
           System.out.println("4-Supprimer un professeur");
           System.out.println("5-Afficher tous les professeurs");
           System.out.println("6-Quitter");
          break;
          
      case 4:
          System.out.println("Gérer Groupe Etudiant");
          System.out.println("Modifier Groupe Etudiant");
          System.out.println("4-Supprimer Groupe Etudiant");
          break;
          
      case 5:
          System.exit(0);
          break;
        }
        
        
        
      }
}
   
        
        
        
