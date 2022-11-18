/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_package;

import java.time.LocalDate;
import java.time.*;
/**
 *
 * @author jules
 */
public class Location {
    Client client;
    Vehicule vehicule;
    LocalDate locationdate;
    LocalDate returndate;
    float price;
    
    public Location(Client client, Vehicule vehicule, LocalDate locationdate, LocalDate returndate, float price){
        this.price=price;
        this.vehicule=vehicule;
        this.locationdate=locationdate;
        this.returndate=returndate;
        this.price=price;
    }
    
    public boolean placeApres(LocalDate client2){
        LocalDate client1 = this.locationdate;
        boolean retour = client2.isAfter(client1);
        return retour;
     }
}
