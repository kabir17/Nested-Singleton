package abstraction;

public class Broccoli extends Chili implements Vegetables,Onion{
    public void soil(){
        System.out.println("We need soil for planting");
    }
    public void water(){
        System.out.println("We need water also for planting");
    }
    public void seeds(){
        System.out.println("We need seeds for planting");
    }
    public void instruments(){
        System.out.println("Finally we need instrument for planting");
    }
    public void hybridSeeds(){
        System.out.println("We need hybrid seeds for better planting");
    }
    public void needPpl(){
        System.out.println("We need hard worker people for planting");
    }
    public void onionSeeds(){
        System.out.println("Onion is not a vegetables");
    }
}
