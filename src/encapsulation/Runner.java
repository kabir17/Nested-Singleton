package encapsulation;

public class Runner {
    public static void main(String[] args) {

        Vegetables veg1 = new Vegetables(10, 20.0,true);
        System.out.println("Vegetable piece : "+veg1.getPiece()+ " pieces " +"\n"+"Vegetable price : "+veg1.getPrice()+
                            " dollars " +"\n"+"We can eat vegetable : "+veg1.isEatable());

        System.out.println("---------------------------------------");

        Vegetables veg2 = new Vegetables("Asparagus", "Green");
        System.out.println("Vegetable name : "+veg2.getVegName()+"\n"+"Vegetable color : "+veg2.getColor());

        System.out.println("------------------------------------------");

        Vegetables veg3 = new Vegetables();
        veg3.setVegName("Spinach");
        veg3.setColor("Green");
        veg3.setPiece(2);
        veg3.setPrice(9.0);
        veg3.setEatable(true);
        System.out.println("Vegetable name : "+veg3.getVegName()+"\n"+"Vegetable color : "+veg3.getColor()
                +"\n"+"Vegetable piece : " +veg3.getPiece()+" pieces "+"\n"+"Vegetable price : "+veg3.getPrice()+
                 " dollars "+"\n"+"Is Eatable : "+veg3.isEatable());
    }
}
