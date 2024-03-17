package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
//import java.util.Objects;

// BEGIN
public class Validator {
    public static List<String> validate(Address address) {
        List<String> result = new ArrayList<>();
        Field[] fields = address.getClass().getDeclaredFields();
        for (Field field: fields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(NotNull.class)) {
                try {
                    if (field.get(address) == null) {
                        result.add(field.getName());
                    }
                } catch (IllegalAccessException e) {
                    System.out.println("IllegalAccessException is thrown");
                }
            }
        }
        return result;
    }
}
//}
// END
