package inheritance;

public class Food {

    public void foodName(){
        int i=(int)(Math.random()*6);
        System.out.println(i);

        if(i==0){
            System.out.println("Eat Vegetables");
        }else if(i==5){
            System.out.println("Eat Meat");
        }else if(i==1){
            System.out.println("Eat Fish");
        }else {
            System.out.println("Just drink Water");
        }
    }
    public void listOfFood(){

        int i=0;
        while (i<1) {
            System.out.print("List of Vegetables : Vegetables");
            for(int j=0; j<1; j++){
                System.out.print(" + Meat");
                int k=0;
                do {
                    System.out.println(" + fish");
                    k++;
                }while (k<1);
            }
            i++;
        }
    }
}
