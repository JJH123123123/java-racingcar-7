
public class Racer {
    private String name;
    int score;

    public Racer(String name) {
        this.name = name;
        this.score = 0;
    }

    public void addOne() {
        this.score++;
    }
}
