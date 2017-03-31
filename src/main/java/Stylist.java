import org.sql2o.Connection;
import java.util.List;

public class Stylist {

  private String name;
  private int id;

  public Stylist(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public static List<Stylist> all() {
    try (Connection con = DB.sql2o.open()) {
      String sql = "SELECT id, name FROM stylists;";
      return con.createQuery(sql).executeAndFetch(Stylist.class);
    }
  }

  public void save() {
    try(Connection con = DB.sql2o.open()) {
      String sql = "INSERT INTO stylists (name) VALUES (:name);";
      this.id = (int) con.createQuery(sql, true)
              .addParameter("name", this.name)
              .executeUpdate()
              .getKey();
    }
  }

  public void update(String name) {
    try(Connection con = DB.sql2o.open()) {
      String sql = "UPDATE stylists SET name = :name WHERE id = :id;";
      con.createQuery(sql)
              .addParameter("name", name)
              .addParameter("id", this.id)
              .executeUpdate();
    }
  }

  public static Stylist find(int id) {
    try(Connection con = DB.sql2o.open()) {
      String sql = "SELECT * FROM stylists WHERE id = :id;";
      Stylist stylist = con.createQuery(sql)
              .addParameter("id", id)
              .executeAndFetchFirst(Stylist.class);
      return stylist;
    }
  }

  public void delete() {
    try(Connection con = DB.sql2o.open()) {
      String sql = "DELETE FROM stylists WHERE id = :id;";
      con.createQuery(sql)
              .addParameter("id", this.id)
              .executeUpdate();
    }
  }
}
