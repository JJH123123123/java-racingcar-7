package model;

public class RacingCar {
    private String name;
    private int score;
    private int totalScore;

    public RacingCar(String name) {
        this.name = name;
        this.score = 0;
    }

    public void addOne() {
        this.score++;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        String tmp = "";
        for(int i=  0;i<this.score;i++){
            tmp+="-";
        }
        return this.name + " : " + tmp;
    }

    public void addScore() {
        this.totalScore++;
    }
}
