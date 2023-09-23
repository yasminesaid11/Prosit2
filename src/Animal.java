//-----------Instruction5----------
//-----------Classe-Animal---------
public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    //---------- Instruction9----------
    public void displayAnimal() {
        System.out.println("Nom de l'animal : " + name);
        System.out.println("famille de l'animal : " + family);
        System.out.println("Age de l'animal : " + age);
        System.out.println("Genre l'animal : " + isMammal);

    }
    @Override
    public String toString() {
        return "Nom de l'animal : " + name + "famille de l'animal : " + family +"Age de l'animal : " + age + "Genre l'animal : " + isMammal;
    }
}