import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TieredCakeTest {
    private TieredCake tieredCake;

    @BeforeEach
    public  void setUp() { tieredCake = new TieredCake("Birthday Cake", true);}

    @Test
    public  void hasFondantIcing(){
        Boolean expected = true;
        Boolean actual = tieredCake.fondantIcing;
        assertEquals(expected,actual);
    }
    @Test
    public void canAddIcingLettering__noArgument(){
        String expected = "Happy Birthday!";
        String actual = tieredCake.addIcingLettering();
        assertEquals(expected,actual);
    }
    @Test
    public void canAddIcingLettering__withArgument(){
        String expected = "Happy Birthday Bob";
        String actual = tieredCake.addIcingLettering("Bob");
        assertEquals(expected,actual);
    }
    @Test
    public void canCount(){
        String result = tieredCake.countNumberOfSlices(40);
        assertThat(result).isEqualTo("Birthday Cake has 40 slices.");
    }
}
