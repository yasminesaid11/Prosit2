public class Zoo {
    Animal[] animals;

    int nbr_animal;
    String name;
    String city;
    static final int nb_cages = 25;
    int i;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        animals = new Animal[nb_cages];
    }

    //----------Instruction8--------
    public void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville du zoo : " + city);
        System.out.println("Nombre de cages : " + nb_cages);
    }

    //----------Instruction9----------
    @Override
    public String toString() {
        return "    Nom du zoo : " + name + "    Ville du zoo : " + city + "   Nombre de cages : " + nb_cages;
    }

    //----------Instruction10---------
    public boolean addAnimal(Animal animal) {
        if (i > nb_cages) {
            System.out.println("erreur");
            return false;
        }

        animals[i] = animal;
        i++;
        return true;

    }
    //----------Instruction11---------

    public void afficherAnimals() {
        for (int j = 0; j < i; j++) {
            Animal animal = animals[j];
            System.out.println("Famille : " + animal.family);
            System.out.println("Nom : " + animal.name);
            System.out.println("Age : " + animal.age);
            System.out.println("Mammifère : " + animal.isMammal);
            System.out.println();
        }
    }


    public int searchAnimal(String animalAchercher) {
        for (int j = 0; j < i; j++) {
            if (animals[j].name.equals(animalAchercher)) {
                return j;
            }
        }
        return -1;
    }

    //----------Instruction13----------
    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].equals(animal)) {
                animals[i] = null;
                System.out.println("L'animal a été supprimé du zoo.");
                return true;
            }
        }
        System.out.println("L'animal n'a pas été trouvé dans le zoo.");
        return false;
    }

    //----------Instruction15----------

    boolean isZooFull() {
        return nbr_animal == nb_cages;
    }


    //----------Instruction16----------

    static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbr_animal > z2.nb_cages)
            return z1;
        return z2;
    }
}