package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {


    SingleTag(String type, Map<String, String> attributes) {
        super(type, attributes);
    }
    public String toString() {
        return String.format("<%s%s>", getName(), attributesToString());
    }
}
// END
