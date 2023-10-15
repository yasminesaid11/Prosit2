package tn.esprit.gestionzoo.entities;
//------------------Instruction20------------

public class Aquatique extends Animal {
    String habitat;
//------------------Instruction22------------

    public Aquatique(String family, String name, int age, boolean isMammal) {
        super(family, name, age, isMammal);
    }
    //------------------Instruction23------------

    public static String swim(){
        return ("This aquatic animal is swimming.") ;

    }

    public class Dolphin extends Aquatique{
        float swimmingSpeed;
//------------------Instruction22------------

       public Dolphin(String family, String name, int age, boolean isMammal) {
            super(family, name, age, isMammal);
        }
        //------------------Instruction23------------

        public static String swim(){
           return ("This dolphin animal is swimming.") ;

        }



    }
    public class Penguin extends Aquatique{
        float swimmingDepth;
//------------------Instruction22------------


        public Penguin(String family, String name, int age, boolean isMammal) {
            super(family, name, age, isMammal);
        }
    }

}
