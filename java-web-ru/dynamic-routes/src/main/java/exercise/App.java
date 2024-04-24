package exercise;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.javalin.Javalin;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

// BEGIN

// END

public final class App {

    private static final List<Map<String, String>> COMPANIES = Data.getCompanies();

    public static Javalin getApp() {

        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
        });

        // BEGIN
        app.get("/companies/{id}", ctx -> {
            var id = ctx.pathParam("id");
            var selectedCompany = Data.getCompanies().stream().filter(x -> x.get("id").equals(id)).toList();
            String printOutput = selectedCompany.toString();
//            var printThis = objectMapper.readTree(selectedCompany);
            ctx.json(printOutput);
        });
        // END

        app.get("/companies", ctx -> {
            ctx.json(COMPANIES);
        });

        app.get("/", ctx -> {
            ctx.result("open something like (you can change id): /companies/5");
        });

        return app;

    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
