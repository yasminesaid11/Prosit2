package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

import java.util.Scanner;

public class ZooManagement {
    int nbrCages;
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
//        Animal lion = new Animal("lion", "symba", 4, true);
//       Zoo myZoo = new Zoo("Yasmine ", "Tunis");

//        Zoo myZoo2 = new Zoo(" tn.esprit.gestionzoo.entities.Zoo", "Sousse");
//
//

        //-------------instruction8----------
//         myZoo.displayZoo();
        // System.out.println(myZoo);
        //System.out.println(myZoo.toString());

        //------------Instruction9-------
        //lion.displayAnimal();
        //System.out.println(lion);
        //System.out.println(lion.toString());

        //----------Instruction10---------
//        Animal singe = new Animal("Singe", "Singe", 10, true);
//        Animal giraffe = new Animal("Giraffe", "Giraffe", 4, true);
//        Animal panda = new Animal("Panda", "Panda", 5, true);
//
//       // myZoo.addAnimal(lion);
//       // myZoo.addAnimal(singe);
//       // myZoo.addAnimal(giraffe);
//        //myZoo.addAnimal(panda);
//
//        myZoo.displayZoo();
//
//        //----------Instruction11---------
//
//        myZoo.afficherAnimals();
//
//        System.out.print("Saisir le nom de l'animal à chercher ");
//        String searchName = sc.nextLine();
//        int resultat = myZoo.searchAnimal(searchName);
//        if (resultat != -1) {
//            System.out.println("L'animal a été trouvé avec succé ");
//        } else {
//            System.out.println("erreur.");
//        }
//
//        //----------Instruction13-----------
//        System.out.print("Saisir le nom de l'animal à supprimer");
//        String animalName = sc.nextLine();
//        boolean supp = myZoo.removeAnimal(lion);
//
//        if (supp) {
//            System.out.println("Suppression réussie");
//        } else {
//            System.out.println("Suppression échouée");
//        }
//
//        myZoo.afficherAnimals();
//
//        //----------Instruction15----------
//        myZoo.isZooFull();
//
//        //----------Instruction1----------
//        Zoo.comparerZoo(myZoo, myZoo2);
//    }

//------------------Instruction21------------

//        Aquatique a = new Aquatique  (habitat="Water");
//        Aquatique.Dolphin Dolphin = new Dolphin(habitat = "Ocean", swimmingSpeed = 25.0);
//
//        Aquatique.swim();
//        dolphin.swim();
        //------------------Instruction26------------

        Dolphin dolphin1 = new Dolphin("Ocean", "dolphin", 20, true, "habitat");
        Penguin penguin1 = new Penguin("Antarctic", "penguin", 20, true, "habitat");
        Zoo myZoo = new Zoo("Yasmine", "Tunis");


        myZoo.addAquaticAnimal(dolphin1);
        myZoo.addAquaticAnimal(penguin1);
        myZoo.displayNumberOfAquaticsByType();


        Animal singe = new Animal("Singe", "Singe", 10, true);
        Animal giraffe = new Animal("Giraffe", "Giraffe", 4, true);
        Animal panda = new Animal("Panda", "Panda", -1, true);
        try {
            myZoo.addAnimal(singe);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());

        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Le zoo a " + myZoo.getNbr_animal() + " animaux.");
        }
        try {
            myZoo.addAnimal(giraffe);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Le zoo a " + myZoo.getNbr_animal() + " animaux.");
        }
        try {
            myZoo.addAnimal(panda);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Le zoo a " + myZoo.getNbr_animal() + " animaux.");
        }

        Penguin penguin2 = new Penguin("Antarctic", "penguin2", 20, true, "habitat");
        penguin2.eatMeat(Food.MEAT);

        Terrestrial singe2 = new Terrestrial();
        singe2.eatMeat(Food.MEAT);
    }
}
