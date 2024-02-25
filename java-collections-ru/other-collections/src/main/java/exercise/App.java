package exercise;

import java.util.Map;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.TreeSet;

// BEGIN
class App {
    public static Map<String, Object> genDiff(Map<String, Object> data1, Map<String, Object> data2) {
        Map<String, Object> result = new LinkedHashMap<>();
        Set<String> union = new TreeSet<>();
        union.addAll(data1.keySet());
        union.addAll(data2.keySet());
        for (String key : union) {
            if (!data1.containsKey(key)) {
                result.put(key, "added");
            } else if (!data2.containsKey(key)) {
                result.put(key, "deleted");
            } else if (data1.get(key).equals(data2.get(key))) {
                result.put(key, "unchanged");
            } else {
                result.put(key, "changed");
            }
        }
        return result;
    }
}
