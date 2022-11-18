/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main_package;

/**
 *
 * @author jules
 */
import java.io.*;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nomAgance = "lest";
        Vehicule[] flotteVehicule = new Vehicule[0];
        Client[] repertoryClient = new Client[0];
        Location[] agandaLocation = new Location[0];
        Agence test = new Agence(nomAgance, flotteVehicule,repertoryClient,agandaLocation);
        repertoryClient = test.ajouter(repertoryClient);
        System.out.print(repertoryClient[0].emailclient);
       
        
    }
    
}
