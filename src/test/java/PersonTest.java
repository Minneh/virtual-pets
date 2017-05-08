import org.junit.*;
import static org.junit.Assert.*;

public class PersonTest {

  @Test
  public void person_instantiatesCorrectly_true() {
    Person testPerson = new Person("Henry", "[email protected]");
    assertEquals(true, testPerson instanceof Person);
  }

}
