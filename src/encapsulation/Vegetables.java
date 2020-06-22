package encapsulation;

public class Vegetables {

    private String vegName;
    private String color;
    private int piece;
    private double price;
    private boolean isEatable;

    public Vegetables(){}

    public Vegetables(String vegName, String color) {
        this.vegName = vegName;
        this.color = color;
    }
    public Vegetables(int piece, double price, boolean isEatable) {
        this.piece = piece;
        this.price = price;
        this.isEatable = isEatable;
    }

    public String getVegName() {
        return vegName;
    }

    public void setVegName(String vegName) {
        this.vegName = vegName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPiece() {
        return piece;
    }

    public void setPiece(int piece) {
        this.piece = piece;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isEatable() {
        return isEatable;
    }

    public void setEatable(boolean eatable) {
        this.isEatable = eatable;
    }
}
