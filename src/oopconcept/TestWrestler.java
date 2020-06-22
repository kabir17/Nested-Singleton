package oopconcept;

public class TestWrestler {
    public static void main(String[] args) {

        Wrestler wrestler = new Wrestler("Ulla","hiphop","choke slam");
        wrestler.move();
        wrestler.pinSubmission(3);
    }
}
