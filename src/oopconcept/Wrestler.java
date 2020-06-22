package oopconcept;

public class Wrestler{


    public String getFighterName() {
        return fighterName;
    }

    public void setFighterName(String fighterName) {
        this.fighterName = fighterName;
    }

    public String getTeamMusic() {
        return teamMusic;
    }

    public void setTeamMusic(String teamMusic) {
        this.teamMusic = teamMusic;
    }

    public String getSpecialMove() {
        return specialMove;
    }

    public void setSpecialMove(String specialMove) {
        this.specialMove = specialMove;
    }

    private String fighterName;
    private String teamMusic;
    private String specialMove;

    public Wrestler(){

    }

    public Wrestler(String fighterName, String teamMusic, String specialMove) {
        this.fighterName = fighterName;
        this.teamMusic = teamMusic;
        this.specialMove = specialMove;
    }
    public void pinSubmission(int x){
        System.out.println("Abstract pinchSubmission mehtod");
        if (x==1){
            System.out.println("1 pin match goes on ");
        }else if(x==2){
            System.out.println("2 pin match goes on");
        }else {
            System.out.println("3 pins gotta winner");
        }
    }
    public void setTeamMusic(){
        System.out.println(teamMusic+" Music place in the back ground");
    }
    public void move(){
        System.out.println("Abstract class method move");
    }
}
