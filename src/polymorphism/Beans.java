package polymorphism;

public class Beans {

    public void itemName(){

        for (int j=0; j<1; j++){
            System.out.print("Beans Color Name : Red beans + ");
            int k=0;
            do {
                System.out.println("Green beans");
                k++;
            }while (k<1);
        }
    }
    public double itemPrice(){

        int i=(int)(Math.random()*3);
        System.out.println("Random number : "+i);

        if(i==0 || i==1){
            System.out.println("Red beans Price : "+5*2+" dollars");
        }
        if(i==2 || i==3){
            System.out.println("Green beans price : "+3*2+" dollars");
        }
        return 0.0;
    }
}
