package singleton;

public class Runner {
    public static void main(String[] args) {

        Vegetables vegetables = Vegetables.getVegetables();
        vegetables.vegetableName();
        vegetables.connectDatabase();
    }
}
