import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StylistTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
  public void getName_returnsName_ryan() {
    Stylist stylist = new Stylist("ryan");
    assertEquals("ryan", stylist.getName());
  }

  @Test
  public void getId_returnsId_1() {
    Stylist stylist = new Stylist("ryan");
    stylist.save();
    Stylist stylist2 = new Stylist("ryan");
    stylist2.save();
    assertTrue(Stylist.find(stylist.getId()) > 0);
  }

  @Test
  public void save_savesInDatabase() {
    Stylist stylist = new Stylist("ryan");
    stylist.save();
    assertEquals(stylist, Stylist.all().get(0));
  }

  @Test
  public void find_returnsCorrectStylist() {
    Stylist stylist = new Stylist("Tyler");
    stylist.save();
    assertEquals(stylist.getName(), Stylist.find(stylist.getId()).getName());
  }

  @Test
  public void update_updatesRecord() {
    Stylist stylist = new Stylist("ryan");
    stylist.save();
    stylist.update("Tyler");
    assertEquals("Tyler", Stylist.find(stylist.getId()).getName());
  }

  @Test
  public void delete_deletesRecord() {
    Stylist stylist = new Stylist("ryan");
    stylist.save();
    stylist.delete();
    assertEquals(null, Stylist.find(stylist.getId()));
  }
}
