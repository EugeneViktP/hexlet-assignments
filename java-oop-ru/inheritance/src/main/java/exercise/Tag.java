package exercise;

//import java.util.stream.Collectors;
//import java.util.Map;

import java.util.Map;
import java.util.stream.Collectors;

// BEGIN
public class Tag {
    private String name;
    private Map<String, String> attributes;

    public Tag(String name, Map<String, String> attributes) {
        this.name = name;
        this.attributes = attributes;
    }
    public String attributesToString() {
        return attributes.keySet().stream()
                .map(key -> {
                    String value = attributes.get(key);
                    return String.format(" %s=\"%s\"", key, value);
                })
                .collect(Collectors.joining(""));
    }
    public String getName() {
        return name;
    }
}

// END
