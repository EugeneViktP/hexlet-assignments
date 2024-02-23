package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.Stream;

// BEGIN
class App {
    public static String getForwardedVariables(String str) {
        return Arrays.stream(str.split("\n"))
                .filter(item -> item.startsWith("environment"))
                .map(item -> item.replaceAll("environment=|\"", ""))
                .flatMap(item -> Stream.of(item.split(",")))
                .filter(item -> item.startsWith("X_FORWARDED_"))
                .map(item -> item.replaceAll("X_FORWARDED_", ""))
                .collect(Collectors.joining(","));
    }
}
//END
