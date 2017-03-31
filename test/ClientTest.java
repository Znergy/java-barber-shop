import com.znergy.Client;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ryanjones on 3/31/17.
 */
public class ClientTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
  public void getName_returnsName_Tyler() {
    Client client = new Client("Tyler", "Strep Throat", 1);
    assertEquals("Tyler", client.getName());
  }

  @Test
  public void getDescription_returnsDescription() {
    Client client = new Client("Tyler", "Strep Throat", 1);
    assertEquals("Strep Throat", client.getDescription());
  }

  @Test
  public void save_savesClientInDatabase() {
    Client client = new Client("Tyler", "Strep Throat", 1);
    client.save();
    assertEquals(client.getName(), Client.all().get(0).getName());
  }

  @Test
  public void update_updatesRecord() {
    Client client = new Client("Tyler", "Strep Throat", 1);
    client.save();
    client.update("Ryan", "coughing", 2);
    assertEquals("Ryan", Client.find(client.getId()).getName());
    assertEquals("coughing", Client.find(client.getId()).getDescription());
    assertEquals(2, Client.find(client.getId()).getId_stylist());
  }

  @Test
  public void delete_removesRecord() {
    Client client = new Client("Tyler", "Strep Throat", 1);
    client.save();
    client.delete();
    assertEquals(null, Client.find(client.getId()));
  }
}
