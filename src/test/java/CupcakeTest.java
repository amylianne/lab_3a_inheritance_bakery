import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CupcakeTest {
    private Cupcake cupcake;

    @BeforeEach
    public void setUp() {
        cupcake = new Cupcake("A");
    }

    @Test
    public void canAddIcingLettering() {
        String expected = "A";
        String actual = cupcake.addIcingLettering();
        assertEquals(expected, actual);
    }
}
