package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {
    private String type;

    public SingleTag(String type, Map<String, String> attributes) {
        this.type = type;
        this.attributes = attributes;
    }

    private Map<String, String> attributes;
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("<")
                .append(type);
        for (var key: attributes.keySet()) {
            str.append(" ")
                    .append(key)
                    .append("=\"")
                    .append(attributes.get(key))
                    .append("\"");
        }
        str.append(">");
        return str.toString();
    }
}
// END
