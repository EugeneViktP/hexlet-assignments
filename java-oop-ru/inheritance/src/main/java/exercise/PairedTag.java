package exercise;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;
//import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    private String type;
    private Map<String, String> attributes;
    private String text;
    private List<Tag> children = new ArrayList<>();

    public PairedTag(String type, Map<String, String> attributes, String text, List<Tag> children) {
        this.type = type;
        this.attributes = attributes;
        this.text = text;
        this.children = children;
    }
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
        str.append(">")
                .append(text);
        for (var key: children) {
            str.append(key);
        }
        str.append("</")
                .append(type)
                .append(">");
        return str.toString();
    }
}
// END
