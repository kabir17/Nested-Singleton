package inheritance;

public class NonVege extends Food{   //NonVege= GrandParent, Food= 1st super class

    public void  listOfNonVeg(){
        int i=0;
        while (i<1){
            System.out.print("List of Non vegetables : Fish + ");
            for (int j=0; j<1; j++){
                System.out.print("Meat + ");
                int k=0;
                do{
                    System.out.println("Vegetables");
                    k++;
                }while (k<1);
            }
            i++;
        }
    }
    public boolean isNonVegetables(int a){
        int i=(int)(Math.random()*5);
        System.out.println(i);

        if(a==2){
            System.out.println("true");
        }else if(a==0 || a==4){
            System.out.println("true");
        }else if(a==1 || a==3){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        return true;
    }
}
