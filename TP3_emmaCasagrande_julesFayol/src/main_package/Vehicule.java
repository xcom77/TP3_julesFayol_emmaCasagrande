/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_package;

/**
 *
 * @author jules
 */
public class Vehicule {
//    rose violet bleu magenta vert jaune orange rouge marron noir gris cyan blanc brun kaki louvet taupe bai beige smoke green purple red schwarz lila
//            gelb rot weiss mein kleines Kind 
//                    du bist dumm

    private String gamme, identifiant;
    private int nbplace, genre;

    public Vehicule(String gamme, String identifiant, int genre, int nbplace) {
        this.gamme = gamme;
        this.identifiant = identifiant;
        this.genre = genre;
        this.nbplace = nbplace;
    }
    // attibuts

    // constucteur
    @Override
    public String toString() {

        return ("la gamme de la voiture est : " + gamme + " le genre du vehicule est : " + genre + " ,le nombre de place de vehicule est de  " + nbplace + " places, l'identifiant du vehicule est " + identifiant + " ");

    }

//    
   public boolean placerApres(int genrevoiture) { 
        int genre = this.genre;
        int compare = genre - genrevoiture; 
        if(compare > 0){
            return false;
        }
        return true;
    }

}
