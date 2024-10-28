
package util;

import java.util.List;
import java.util.ArrayList;
import model.RacingCar;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class utilTest {

    @DisplayName("findWinner")
    @Test
    public void findWinner() {
        List<RacingCar> racingCarList = new ArrayList<>();

        Util.findWinner(null);
    }
}
