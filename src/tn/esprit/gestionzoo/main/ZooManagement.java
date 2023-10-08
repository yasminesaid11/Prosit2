package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

import java.util.Scanner;

public class ZooManagement {
    int nbrCages ;
    String zooName = "myZoo";



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ZooManagement zooManagement = new ZooManagement();


        // System.out.print("Saisir le nom du zoo: ");
        //zooManagement.zooName = sc.nextLine();

        //System.out.print("Saisir le nombre des cages: ");
        //zooManagement.nbrCages = sc.nextInt();

        //System.out.println(zooManagement.zooName + " comporte " + zooManagement.nbrCages + " cages");
        //------------Instruction7----------
        Animal lion = new Animal("lion", "symba", 4, true);
        Zoo myZoo = new Zoo("Yasmine tn.esprit.gestionzoo.entities.Zoo", "Tunis");
        Zoo myZoo2 = new Zoo(" tn.esprit.gestionzoo.entities.Zoo", "Sousse");



        //-------------instruction8----------
        // myZoo.displayZoo();
        // System.out.println(myZoo);
        //System.out.println(myZoo.toString());

        //------------Instruction9-------
        //lion.displayAnimal();
        //System.out.println(lion);
        //System.out.println(lion.toString());

        //----------Instruction10---------
        Animal singe = new Animal("Singe", "Singe", 10, true);
        Animal giraffe = new Animal("Giraffe", "Giraffe", 4, true);
        Animal panda = new Animal("Panda", "Panda", 5, true);

       // myZoo.addAnimal(lion);
       // myZoo.addAnimal(singe);
       // myZoo.addAnimal(giraffe);
        //myZoo.addAnimal(panda);

        myZoo.displayZoo();

        //----------Instruction11---------

        myZoo.afficherAnimals();

        System.out.print("Saisir le nom de l'animal à chercher ");
        String searchName = sc.nextLine();
        int resultat = myZoo.searchAnimal(searchName);
        if (resultat != -1) {
            System.out.println("L'animal a été trouvé avec succé ");
        } else {
            System.out.println("erreur.");
        }

        //----------Instruction13-----------
        System.out.print("Saisir le nom de l'animal à supprimer");
        String animalName = sc.nextLine();
        boolean supp = myZoo.removeAnimal(lion);

        if (supp) {
            System.out.println("Suppression réussie");
        } else {
            System.out.println("Suppression échouée");
        }

        myZoo.afficherAnimals();

        //----------Instruction15----------
        myZoo.isZooFull();

        //----------Instruction1----------
        Zoo.comparerZoo(myZoo, myZoo2);
    }
}