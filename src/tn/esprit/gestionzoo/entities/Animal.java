package tn.esprit.gestionzoo.entities;

//-----------Instruction5----------
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
       //------------Instrucction18----------
    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("age negatif.");
        }    }
    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

       //---------- Instruction9----------
   public void displayAnimal() {
        System.out.println("Nom de l'animal : " + name);
        System.out.println("famille de l'animal : " + family);
        System.out.println("Age de l'animal : " + age);
        System.out.println("Genre l'animal : " + isMammal);

    }
       @Override

       public String toString () {
           return "Nom de l'animal : " + name + "famille de l'animal : " + family + "Age de l'animal : " + age + "Genre l'animal : " + isMammal;
       }


   }
