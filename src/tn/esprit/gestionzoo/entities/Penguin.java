package tn.esprit.gestionzoo.entities;

public class Penguin extends AquaticAnimal {
    private float swimmingDepth;

    public Penguin(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }
//------------------Instruction28------------

    @Override
    public void swim() {
        System.out.println("This aquatic animal is swimming.");

    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

}
