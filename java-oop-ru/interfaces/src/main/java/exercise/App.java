package exercise;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> homes, int n) {
        List<Home> homesSorted = new ArrayList<>(homes);
        List<String> result = new ArrayList<>();
        if (homesSorted.isEmpty()) {
            return result;
        }
        homesSorted.sort(Home::compareTo);
        var temp = homesSorted.subList(0, n);
        for (var home: temp) {
            result.add(home.toString());
        }
        return result;
    }
}
// END
