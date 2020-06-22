package nestedclass;

public class Vegetables {

    public Vegetables(){
    }

    Radish radish = new Radish();
    Carrot carrot = new Carrot();

    public void payment(String paymentInfo){
        if(paymentInfo.equalsIgnoreCase("Credit card")){
            radish.radishPrice(paymentInfo);
        }else if(paymentInfo.equalsIgnoreCase("Cash")){
            carrot.carrotPrice(paymentInfo);
        }
    }
    private class Radish{
        public double radishPrice(String payInfo){
            double a=2.0;
            double b=2.0;
            double total= a+b;
            System.out.println("Radish price : "+total+" dollars by "+payInfo);

            return 0.0;
        }
    }
    private class Carrot{
        public double carrotPrice(String payInfo){
            double a=3.0;
            if (a==3) {
                System.out.println("Carrot price : " + a*2+ " dollars by " + payInfo);
            }
            return 0.0;
        }
    }
}
