package polymorphism;

public class Potato extends Beans {

    @Override
    public void itemName(){
        int i=0;
        while (i<1){
            System.out.print("Potato Name : White Potato + ");
            for (int j=0; j<1; j++){
                System.out.print("Red Potato + ");
                int k=0;
                do {
                    System.out.println("Sweet Potato");
                    k++;
                }while (k<1);
                i++;
            }
        }
    }
    @Override
    public double itemPrice(){
        int i=(int)(Math.random()*5);
        System.out.println("Random number : "+i);

        if(i==0 || i==1){
            System.out.println("White Potato price : "+2*2+" dollars");
        }
        if(i==2 || i==3){
            System.out.println("Red Potato price : "+3*2+" dollars");
        }
        if(i==4 || i==5){
            System.out.println("Sweet Potato Price : "+4*2+" dollars");
        }
        return 0.0;
    }
}
