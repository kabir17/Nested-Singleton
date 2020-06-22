package polymorphism;

public class Runner {
    public static void main(String[] args) {

        Potato potato = new Potato();
        potato.itemName();
        potato.itemPrice();

        System.out.println("----------------------------");

        Beans beans = new Beans();
        beans.itemName();
        beans.itemPrice();
    }
}
