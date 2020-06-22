package singleton;

/*
    Because of private constructor, method should be static so that we can call that particular
    class properties.
 */
public class Vegetables {

    private Vegetables(){
    }

    public static Vegetables getVegetables(){
        return new Vegetables();
    }
    public static void vegetableName(){
        int i=0;
        while (i<1){
            System.out.print("Vegetable name is : Potato + ");
            for(int j=0; j<1; j++){
                System.out.print("Tomato + ");
                int k=0;
                do {
                    System.out.println("Ladies finger");
                    k++;
                }while (k<1);
            }
            i++;
        }
    }
    public void connectDatabase(){
        System.out.println("Ready to connect database");
    }
}
