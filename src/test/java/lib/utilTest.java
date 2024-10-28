
package lib;

import java.util.List;
import java.util.ArrayList;
import model.RacingCar;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class utilTest {

    @DisplayName("findWinner")
    @Test
    public void findWinner() {
        List<RacingCar> racingCarList = new ArrayList<>();
        racingCarList.add(new RacingCar("A"));
        racingCarList.add(new RacingCar("B"));
        racingCarList.add(new RacingCar("C"));
        racingCarList.add(new RacingCar("D"));
        racingCarList.add(new RacingCar("E"));

        racingCarList.get(0).addOne();
        racingCarList.get(1).addOne();
        racingCarList.get(2).addOne();

        List<RacingCar> winners = tools.findWinner(racingCarList);
        for (RacingCar racingCar : winners) {
            System.out.println(racingCar);
        }
        for (RacingCar racingCar : racingCarList
             ) {
            Assertions.assertEquals(racingCarList.get(0).getScore(),1);
        }
    }

    @DisplayName("random Number Test")
    @Test
    void testRandomNumber(){
        int randomInt = tools.randomInt(10);

        boolean ret = false;
        for(int i= 0;i<33333;i++){
            boolean tmp = (1<= randomInt && randomInt<10);
            if (!tmp){
                ret = true;
                break;
            }
        }

        Assertions.assertTrue(!ret);
    }
}
