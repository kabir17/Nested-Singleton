package inheritance;

public class Vegetables extends NonVege{  //Vegetables=parent, NonVege=GrandParent

    public void valueOfVegetables(){
        int i=(int)(Math.random()*3);
        System.out.println("Random Number : "+i);

        if(i==0 || i==1){
            System.out.println("Potato value : "+10*2);
        }
        if(i==2 || i==3){
            System.out.println("Broccoli value : "+10*3);
        }
    }
    public void spinachValue(){
        int i=(int)(Math.random()*3);
        System.out.println("Random number : "+i);

        if(i==0 || i==1){
            System.out.println("Spinach value : "+20*2);
        }if(i==2 || i==3){
            System.out.println("Spinach value : "+20*2);
        }
    }
}
