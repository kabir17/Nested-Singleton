package inheritance;

public class Runner {
    public static void main(String[] args) {

        //Broccoli as child getting parent as Vegetable properties
        Broccoli broccoli = new Broccoli();
        broccoli.colorOfBroccoli(5);
        broccoli.amountOfBroccoli();
        System.out.println("Broccoli price : "+broccoli.priceOfBroccoli(5)+ " dollars");
        broccoli.priceOfBroccoli(5);
        broccoli.valueOfVegetables();
        broccoli.spinachValue();

        System.out.println("------------------------------");

        //Pepper as Great Grand child getting 1st super class properties
        Peppers peppers = new Peppers();
        peppers.colorOfPeppers();
        peppers.oddEven();
        peppers.foodName();
        peppers.listOfFood();

        System.out.println("--------------------------------");

        //Vegetable as parent getting NonVege as grand parent properties and Food as 1st super properties.
        Vegetables vegetables = new Vegetables();
        vegetables.valueOfVegetables();
        vegetables.spinachValue();
        vegetables.listOfNonVeg();
        vegetables.isNonVegetables(2);
        vegetables.foodName();
        vegetables.listOfFood();

        System.out.println("----------------------------------");

        //NonVege as Grand parent getting Food as 1st super class properties.
        NonVege nonVege = new NonVege();
        nonVege.listOfNonVeg();
        nonVege.isNonVegetables(0);
        nonVege.foodName();
        nonVege.listOfFood();
    }
}
