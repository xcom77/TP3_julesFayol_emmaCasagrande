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

    public Client[] ajouter(Client[] repertoryClient) {
        LocalDate permisdate;
        String emailClient;
        LocalDate birthdate;

        System.out.println("voulez vous ajouter un client ? oui/non");
        Scanner cs1 = new Scanner(System.in);
        boolean information = true;
        while (information) {
            String choice = cs1.nextLine();
            if (choice.equals("oui")) {
                break;
            }
            if (choice.equals("non")) {
                System.out.println("aucun changement, 'non");
                return repertoryClient;
            }
        }

        Scanner cs2 = new Scanner(System.in);
        Scanner cs3 = new Scanner(System.in);
        Scanner cs4 = new Scanner(System.in);

        while (true) {
            System.out.println("entrez votre email :");

            emailClient = cs2.nextLine();

            System.out.println("date d'obtention du permis :");
            System.out.println("entrez le jour jj/");
            int JP = cs2.nextInt();
            System.out.println("entrez le mois mm/");
            int MP = cs3.nextInt();
            System.out.println("entrez le jour aaaa/");
            int AP = cs4.nextInt();

            permisdate = LocalDate.of(AP, MP, JP);

            System.out.println(" ");
            System.out.println("date de naissance :");
            System.out.println("entrez le jour jj/");
            int JN = cs2.nextInt();
            System.out.println("entrez le mois mm/");
            int MN = cs3.nextInt();
            System.out.println("entrez le annee aaaa/");
            int AN = cs4.nextInt();

            birthdate = LocalDate.of(AN, MN, JN);

            System.out.println("");
            System.out.println("verification des information :");
            System.out.println("la date de naissance du client est le :" + birthdate);
            System.out.println("la date du permis du client est le :" + permisdate);
            System.out.println("l'email du client est:" + emailClient);

            while (true) {
                System.out.println("confirmer vous les informations? oui/non");
                String choice = cs2.nextLine();
                if (choice.equals("oui")) {
                    information = false;
                    break;
                }
                if (choice.equals("non")) {
                    break;
                }
            }
            break;
        }

        Client client = new Client(emailClient, permisdate, birthdate);

        int tab_length_0;
        tab_length_0 = repertoryClient.length;
        Client[] tabtemp = new Client[tab_length_0 + 1]; // creation d'une liste de taille n+1
        for (int i = 0; i < tab_length_0; i++) {
            tabtemp[i] = repertoryClient[i]; // transfert des valeurs vers le nouveau tableau
        }
        tabtemp[tab_length_0] = client; // ajoue de la nouvelle valeur dans la tab n+1 du tableau

        tab_length_0 = repertoryClient.length;

        if (tab_length_0 > 2) {

            Client tempclient;
            for (int i = 0; i < tab_length_0; i++) {
                for (int b = i + 1; b < tab_length_0; b++) {
                    if (repertoryClient[i].placerApres(repertoryClient[b].emailclient)) {
                        tempclient = repertoryClient[i];
                        repertoryClient[i] = repertoryClient[b];
                        repertoryClient[b] = tempclient;
                    }
                }
            }
        }

        return tabtemp;
    }

 
    //methode ajout vehicule sans moteur n1
    public void ajouter(String gamme, String identifiant, int genre, int nbplace, int Nbroue){
        
        VehiculeSansMoteur vehicule = new VehiculeSansMoteur( gamme,  identifiant,  genre,  nbplace,  Nbroue);

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
    public void ajouter(String gamme, String identifiant, int genre, int nbplace, int nbporte, int agemin, int permismin, String modele){
        
        VehiculeAvecMoteur vehicule = new VehiculeAvecMoteur(  gamme,  identifiant,  genre,  nbplace,  nbporte,  agemin,  permismin,  modele );

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

    public void ajouter(String gamme, String identifiant, int genre, int nbplace, int nbporte, int agemin, int permismin, String modele, int chargecap){
        
        VehiculeAvecMoteurUtilitaire vehicule = new VehiculeAvecMoteurUtilitaire(gamme,identifiant, genre, nbplace, nbporte, agemin, permismin, modele, chargecap );

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
