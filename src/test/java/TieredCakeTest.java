import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TieredCakeTest {
    private TieredCake tieredCake;

    @BeforeEach
    public  void setUp() { tieredCake =new TieredCake("BirthdayCake", true);}

    @Test
    public  void hasFondantIcing(){
        Boolean expected = true;
        Boolean actual = tieredCake.fondantIcing;
        assertEquals(expected,actual);
    }
    @Test
    public void canAddIcingLettering(){
        String expected = "Happy 1st Birthday Bob!";
        String actual = tieredCake.addIcingLettering();
        assertEquals(expected,actual);

    }
}
