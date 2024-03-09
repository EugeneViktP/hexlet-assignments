package exercise;
import java.util.Map;

// BEGIN
public class FileKV implements KeyValueStorage {
    private String path;

    public FileKV(String path, Map<String, String> initial) {
        this.path = path;
        initial.entrySet().stream().forEach(entry -> set(entry.getKey(), entry.getValue()));
    }

    public void set(String key, String value) {
        String content = Utils.readFile(path);
        Map<String, String> data = Utils.unserialize(content);
        data.put(key, value);
        Utils.writeFile(path, Utils.serialize(data));
    }


    public void unset(String key) {
        String content = Utils.readFile(path);
        Map<String, String> data = Utils.unserialize(content);
        data.remove(key);
        Utils.writeFile(path, Utils.serialize(data));
    }

    public String get(String key, String defaultValue) {
        String content = Utils.readFile(path);
        Map<String, String> data = Utils.unserialize(content);
        return data.containsKey(key) ? data.get(key) : defaultValue;
    }

    public Map<String, String> toMap() {
        String content = Utils.readFile(path);
        Map<String, String> data = Utils.unserialize(content);
        return data;
    }
}
// END
