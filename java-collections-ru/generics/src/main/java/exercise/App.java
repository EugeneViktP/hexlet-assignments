package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;


// BEGIN
class App {

    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> result = new ArrayList<>();
        for (var book : books) {
            if (book.entrySet().containsAll(where.entrySet())) {
                result.add(book);
            }
        }
        return result;
    }
}
//END
