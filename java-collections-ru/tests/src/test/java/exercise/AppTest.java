package exercise;

// import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
// import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static exercise.App.take;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numTest = new ArrayList<>(List.of(1, 2, 3));
        // List<Integer> emptyArray = new ArrayList<>();
        //assert numTest.equals(take(numTest, 4));
        //assert emptyArray.equals(take(emptyArray, 2));
        assert numTest.equals(take(numTest, 3));
        //assert emptyArray.equals(take(numTest, 0));
        // END
    }
}
