import org.junit.rules.ExternalResource;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

public class DatabaseRule extends ExternalResource {

  @Override
  protected void before() {
    DB.sql2o = new Sql2o("jdbc:postgresql://localhost:5432/hair_salon_test", null, null);

  }

  @Override
  protected void after() {
    try (Connection con = DB.sql2o.open()) {
      String deleteStylists = "DELETE FROM stylists *;";
      String deleteClients = "DELETE FROM clients *;";
      con.createQuery(deleteStylists).executeUpdate();
      con.createQuery(deleteClients).executeUpdate();
    }
  }
}
