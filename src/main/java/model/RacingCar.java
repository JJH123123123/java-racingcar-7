
public class RacingCar {
    private String name;
    int score;

    public RacingCar(String name) {
        this.name = name;
        this.score = 0;
    }

    public void addOne() {
        this.score++;
    }
}
