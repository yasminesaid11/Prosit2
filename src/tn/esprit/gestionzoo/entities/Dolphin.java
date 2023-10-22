package tn.esprit.gestionzoo.entities;

public class Dolphin extends AquaticAnimal {
    private float swimmingSpeed;

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
//------------------Instruction20------------

    @Override
    public void swim() {

    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

}
