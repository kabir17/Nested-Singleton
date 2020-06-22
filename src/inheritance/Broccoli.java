package inheritance;

public class Broccoli extends Vegetables{  //Broccoli = son, Vegetables = parent

    public void amountOfBroccoli(){
        for (int i=0; i<1; i++){
            System.out.println("5 pieces broccoli");
        }
    }
    public int priceOfBroccoli(int a){
        int total = a * 5;
        return total;
    }
    public String colorOfBroccoli(int color){
        int a=2;
        int b=3;
        int total= a+b;

        if(color==total){
            System.out.println("Broccoli color : Green");
        }
        return "";
    }
}
