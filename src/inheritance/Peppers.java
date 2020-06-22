package inheritance;

public class Peppers extends Food{   //Pepper = Greatgrandson, Food= 1st super class

    public void colorOfPeppers(){
        int i=(int)(Math.random()*3);
        System.out.println("Random number : "+i);

        if(i==2){
            System.out.println("Pepper color is green");
        }if(i==1){
            System.out.println("Pepper color is Yellow");
        }if(i==0) {
            System.out.println("Pepper color is red");
        }
    }
    public void oddEven(){
        int i=(int)(Math.random()*3);
        System.out.println("Random number : "+i);

        if(i==0 || i==2){
            System.out.println("even");
        }if(i==1 || i==3){
            System.out.println("Odd");
        }
    }
}
