package exercise;

import java.util.List;

// BEGIN
class App {
    public static int getCountOfFreeEmails(List<String> emailList) {
        List<String> freeEmail = List.of("gmail.com", "yandex.ru", "hotmail.com");
        long result = emailList.stream()
                .map(email -> email.split("@")[1])
                .filter(freeEmail::contains)
                .count();
        return (int) result;
    }
}
// END
