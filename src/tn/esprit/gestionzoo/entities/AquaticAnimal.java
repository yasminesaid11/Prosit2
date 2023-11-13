package tn.esprit.gestionzoo.entities;
//------------------Instruction20------------

public abstract class AquaticAnimal extends Animal implements Carnivore<Food>{
    String habitat;

    public AquaticAnimal(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    //------------------Instruction20------------

    public abstract void swim();
        @Override
        public void eatMeat(Food meat) {
            if (meat == Food.MEAT || meat == Food.BOTH) {
                System.out.println("Aquatic is a carnivore");
            } else {
                System.out.println("Aquatic is not a carnivore");
            }
        }
    }




