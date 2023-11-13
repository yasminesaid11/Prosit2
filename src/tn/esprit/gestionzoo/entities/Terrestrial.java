package tn.esprit.gestionzoo.entities;
//------------------Instruction20------------
public abstract class Terrestrial extends Animal implements Omnivore<Food> {
    int nbrLegs;
//------------------Instruction22------------

    public Terrestrial(String family, String name, int age, boolean isMammal) {
        super(family, name, age, isMammal);
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println("Terrestrial is a omnivore animal");
        } else {
            System.out.println("Terrestrial in not a omnivore animal");
        }
    }
}
