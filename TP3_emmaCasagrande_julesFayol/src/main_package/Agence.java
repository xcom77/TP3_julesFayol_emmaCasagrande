/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_package;

import java.util.Scanner;
import java.time.*;

/**
 *
 * @author jules
 */
public class Agence {

    private String nomAgance;
    private Vehicule[] flotteVehicule;
    private Client[] repertoryClient;
    private Location[] agandaLocation;

    public Agence(String nomAgance, Vehicule[] flotteVehicule, Client[] repertoryClient, Location[] agandaLocation) {
        this.nomAgance = nomAgance;
        this.flotteVehicule = flotteVehicule;
        this.repertoryClient = repertoryClient;
        this.agandaLocation = agandaLocation;

    }

    public void ajouter(String emailClient, LocalDate permisdate, LocalDate birthdate) {

        Client client = new Client(emailClient, permisdate, birthdate);

        int tab_length_0;
        tab_length_0 = repertoryClient.length;
        Client[] tabtemp = new Client[tab_length_0 + 1]; // creation d'une liste de taille n+1

        for (int i = 0; i < tab_length_0; i++) {
            tabtemp[i] = repertoryClient[i]; // transfert des valeurs vers le nouveau tableau
        }
        tabtemp[tab_length_0] = client; // ajoue de la nouvelle valeur dans la tab n+1 du tableau 

        tab_length_0 = tabtemp.length;
        System.out.println(tab_length_0);

        if (tab_length_0 > 2) {
            int c = tab_length_0 - 1;
            Client clientemp;
            while (c - 1 > 0 && !tabtemp[c].placerApres(tabtemp[c - 1].emailclient)) {
                System.out.println(c);
                clientemp = tabtemp[c];
                tabtemp[c] = tabtemp[c - 1];
                tabtemp[c - 1] = clientemp;
                c--;
            }

        }
        repertoryClient = tabtemp;

    }

    //methode ajout vehicule sans moteur n1
    public void ajouter(String gamme, String identifiant, int genre, int nbplace, int Nbroue) {

        VehiculeSansMoteur vehicule = new VehiculeSansMoteur(gamme, identifiant, genre, nbplace, Nbroue);

        int tab_length_0;
        tab_length_0 = flotteVehicule.length;
        Vehicule[] tabtemp = new VehiculeSansMoteur[tab_length_0 + 1]; // creation d'une liste de taille n+1
        for (int i = 0; i < tab_length_0; i++) {
            tabtemp[i] = flotteVehicule[i]; // transfert des valeurs vers le nouveau tableau
        }
        tabtemp[tab_length_0] = vehicule;

        flotteVehicule = tabtemp;

    }

    //methode ajout vehicule n2
    //methode ajout vehicule n3
    public void ajouter(String gamme, String identifiant, int genre, int nbplace, int nbporte, int agemin, int permismin, String modele) {

        VehiculeAvecMoteur vehicule = new VehiculeAvecMoteur(gamme, identifiant, genre, nbplace, nbporte, agemin, permismin, modele);

        int tab_length_0;
        tab_length_0 = flotteVehicule.length;
        Vehicule[] tabtemp = new VehiculeAvecMoteur[tab_length_0 + 1]; // creation d'une liste de taille n+1
        for (int i = 0; i < tab_length_0; i++) {
            tabtemp[i] = flotteVehicule[i]; // transfert des valeurs vers le nouveau tableau
        }
        tabtemp[tab_length_0] = vehicule;

        flotteVehicule = tabtemp;

    }

    //methode ajout vehicule n 4
    //methode ajout vehicule n 5
    public void ajouter(String gamme, String identifiant, int genre, int nbplace, int nbporte, int agemin, int permismin, String modele, int chargecap) {

        VehiculeAvecMoteurUtilitaire vehicule = new VehiculeAvecMoteurUtilitaire(gamme, identifiant, genre, nbplace, nbporte, agemin, permismin, modele, chargecap);

        int tab_length_0;
        tab_length_0 = flotteVehicule.length;
        Vehicule[] tabtemp = new VehiculeAvecMoteurUtilitaire[tab_length_0 + 1]; // creation d'une liste de taille n+1
        for (int i = 0; i < tab_length_0; i++) {
            tabtemp[i] = flotteVehicule[i]; // transfert des valeurs vers le nouveau tableau
        }
        tabtemp[tab_length_0] = vehicule;

        flotteVehicule = tabtemp;

    }

    //methode ajout de location
    public void ajouter(Client client, Vehicule vehicule, LocalDate dateLocation, float prix, LocalDate dateRestitution) {

        Location location = new Location(client, vehicule, dateLocation, dateRestitution, prix);

        int tab_length_0;
        tab_length_0 = agandaLocation.length;
        Location[] tabtemp = new Location[tab_length_0 + 1]; // creation d'une liste de taille n+1
        for (int i = 0; i < tab_length_0; i++) {
            tabtemp[i] = agandaLocation[i]; // transfert des valeurs vers le nouveau tableau
        }
        tabtemp[tab_length_0] = location;

        agandaLocation = tabtemp;
    }

}
