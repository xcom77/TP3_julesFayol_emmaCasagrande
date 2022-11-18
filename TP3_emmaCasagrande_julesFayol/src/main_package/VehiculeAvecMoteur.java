/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_package;

/**
 *
 * @author jules
 */
public class VehiculeAvecMoteur extends Vehicule {
    private int nbporte, agemin, permismin;
    private String modele;
    
    
    
    public VehiculeAvecMoteur(String gamme, String identifiant, int genre, int nbplace, int nbporte, int agemin, int permismin, String modele){
        super(gamme, identifiant, genre, nbplace);
        this.modele=modele;
  
    }
    
    /**
     *
     * @return
     */
    @Override
     public String toString(){
        
        return (super.toString() + "il y a : " + nbporte + " portes, l'age minimum est de " + agemin + " ans, l'ancieneté de permis minimum est de : " + permismin + " ans");
        
    }
      public int getroue(){
        return nbporte;
    }
}
