
package lib;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import model.RacingCar;

public class tools {

    public static int randomInt(int max) {
        return (int) (Math.random() * max) + 1;
    }

    public static List<RacingCar> findWinner(List<RacingCar> cars) {
        int n = cars.size();
        int m = findMaxinCars(cars);

        List<RacingCar> winners = new ArrayList<RacingCar>();
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
            System.out.println();
            List<RacingCar> winner = findWinner(cars);
            for (RacingCar car : winner
                 ) {
                car.addScore();
            }
        }
    }

    public void end(List<RacingCar> cars){
        int maxinCars = findMaxinCars(cars);
        List<RacingCar> winners = findWinner(cars);

        String names = winners.stream().map(RacingCar::getName)
                .collect(Collectors.joining(", "));

        System.out.println("최종 우승자 : " + names);
        return;
    }

    private static int findMaxinCars(List<RacingCar> cars) {
        int M = -1;
        for (RacingCar car : cars){ // find max value
            if (car.getScore() > M) {
                M = car.getScore();
            }
        }
    }
}
