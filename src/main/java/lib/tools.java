
package lib;

import java.util.ArrayList;
import java.util.List;
import model.RacingCar;

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

    public void startLap(int n, List<RacingCar> cars){
        System.out.println("실행 결과");
        for(int i =0;i<n;i++){ // start nthLap
            for (RacingCar car : cars) {
                forward(car);
                System.out.println(car.toString()); // 중간 출력
            }
            List<RacingCar> winner = findWinner(cars);
            for (RacingCar car : winner
                 ) {
                car.addScore();
            }
        }
    }

}
