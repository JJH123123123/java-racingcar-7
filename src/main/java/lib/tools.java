
package lib;

import camp.nextstep.edu.missionutils.test.Assertions;
import java.util.ArrayList;
import java.util.List;
import model.RacingCar;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class tools {

    public static int randomInt(int max) {
        return (int) (Math.random() * max) + 1;
    }

    public static List<RacingCar> findWinner(List<RacingCar> cars) {
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

    public void print(List<RacingCar> cars){
        for (RacingCar car : cars
             ) {
            System.out.println(car.toString());
        }
    }

    public void forward(RacingCar car){
        int dice = randomInt(10);
        if(dice>=4){
            car.addOne();
        }
    }


}
