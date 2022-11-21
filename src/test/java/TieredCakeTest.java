import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TieredCakeTest {
    private TieredCake tieredCake;

    @BeforeEach
    public  void setUp() { tieredCake =new TieredCake("BirthdayCake", true);}

    @Test
    public  void hasFondentIcing(){
        Boolean expected = true;
        Boolean actual = tieredCake.fondentIcing();
        assertEquals(expected,actual);

    }
}
