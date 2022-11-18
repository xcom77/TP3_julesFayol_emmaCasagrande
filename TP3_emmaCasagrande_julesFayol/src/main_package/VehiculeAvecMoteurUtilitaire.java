/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_package;

/**
 *
 * @author jules
 */
public class VehiculeAvecMoteurUtilitaire extends VehiculeAvecMoteur {
    
    private int chargecap;
    
    public VehiculeAvecMoteurUtilitaire(String gamme, String identifiant, int genre, int nbplace, int nbporte, int agemin, int permismin, String modele, int chargecap){
        super(gamme, identifiant, genre, nbplace, nbporte, agemin, permismin, modele);
        this.chargecap=chargecap;
      
    }
      
        public String toString(){
        
        return ( super.toString() + " la charge du vehicule est de : " + chargecap+ " metrecube");
}
}