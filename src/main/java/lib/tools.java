
package lib;

import java.util.ArrayList;
import java.util.List;
import model.RacingCar;

public class tools {

    public static int randomInt(int max){
        return (int)(Math.random()*max)+1;
    }

    public static List<RacingCar> findWinner(List<RacingCar> cars){
        int m = -1;
        int n = cars.size();
        List<RacingCar> winners = new ArrayList<RacingCar>();
        for (RacingCar racingCar : cars) {
            if (racingCar.getScore() > m) {
                m = racingCar.getScore();
            }
        }

        for (RacingCar car : cars) {
            if (car.getScore() == m) {
                winners.add(car);
            }
        }

        return winners;
    }
}
