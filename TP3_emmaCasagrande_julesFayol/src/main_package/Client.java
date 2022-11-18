/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_package;

import java.time.LocalDate;

/**
 *
 * @author jules
 */
public class Client {

    String emailclient;
    LocalDate permisdate;
    LocalDate agedate;


    public Client(String emailclient, LocalDate permisdate, LocalDate agedate) {
        this.emailclient = emailclient;
        this.permisdate = permisdate;
        this.agedate = agedate;
    }

    public boolean placerApres(String email) { 
        String client = this.emailclient;
        int compare = email.compareToIgnoreCase(client);
        if(compare > 0){
            return true;
        }
        return false;
    }

}
