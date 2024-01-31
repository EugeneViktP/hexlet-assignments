package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String character, String word) {
        var wordToCheck = word.toLowerCase().split("");
        var charAsArray = character.split("");
        List<String> symToCheck = new ArrayList<>(Arrays.asList(charAsArray));
        for (var item : wordToCheck) {
            if (!symToCheck.contains(item)) {
                return false;
            }
            symToCheck.remove(item);
        }
        return true;
    }
}

//END
