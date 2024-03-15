package exercise;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    private String text;
    private List<Tag> children = new ArrayList<>();

    public PairedTag(String type, Map<String, String> attributes, String text, List<Tag> children) {
        super(type, attributes);
        this.text = text;
        this.children = children;
    }
    public String toString() {
        String attributes = attributesToString();
        String name = getName();
        String value = children.stream()
                .map(Object::toString)
                .collect(Collectors.joining(""));
        return String.format("<%s%s>%s%s</%s>", name, attributes, text, value, name);
    }
}
// END
