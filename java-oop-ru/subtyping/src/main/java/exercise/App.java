package exercise;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage data) {
        for (var unit : data.toMap().entrySet()) {
            data.set(unit.getValue(), unit.getKey());
            data.unset(unit.getKey());
        }
    }
}
// END
