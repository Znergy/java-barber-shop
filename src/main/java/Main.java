import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());


  }
}
