package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String str) {
        var result = new HashMap<String, Integer>();
        if (str.isEmpty()) {
            return result;
        }
        var words = str.split(" ");
        for (var word : words) {
            var count = result.getOrDefault(word, 0);
            count++;
            result.put(word, count);
        }
        return result;
    }

    public static String toString(Map<String, Integer> wordCounter) {
        if (wordCounter.isEmpty()) {
            String result = "{}";
            return result;
        }
        String result = "{\"";
        for (String key : wordCounter.keySet()) {
            result = result + "  "
                    + key + ": "
                    + wordCounter.get(key)
                    + "\n";
        }
        result = result + "}";
        return result;
    }
}
//END
