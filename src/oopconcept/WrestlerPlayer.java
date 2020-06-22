package oopconcept;

public class WrestlerPlayer extends Wrestler implements Fighter{

    public void punch(){
        System.out.println("This is from interface punches throw");
    }
    public void kick(){
        System.out.println("This method also from interface kicks throw");
    }
    public void dance(){
        System.out.println("Wrestler can dance method from abstract class");
    }
}
