package abstraction;

public class Runner {
    public static void main(String[] args) {

        Vegetables veg =  new Broccoli();
        veg.instruments();
        veg.seeds();
        veg.soil();
        veg.water();
        Vegetables.people();

        System.out.println("---------------------------");

        Chili chili = new Broccoli();
        chili.chiliVeg();
        chili.hybridSeeds();

        System.out.println("--------------------------------");

        Broccoli broccoli = new Broccoli();
        broccoli.instruments();
        broccoli.seeds();
        broccoli.soil();
        broccoli.water();
        broccoli.hybridSeeds();
        broccoli.needPpl();
        broccoli.chiliVeg();

        System.out.println("----------------------------------");

        Onion onion = new Broccoli();
        onion.onionSeeds();
    }
}
