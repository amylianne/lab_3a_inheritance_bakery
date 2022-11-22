import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BrownieTest {
    private Brownie brownie;

    @BeforeEach
    public  void setUp() { brownie =new Brownie("Triple Choc", "square");}

    @Test
    public void getShapeOfSlices(){
        String expected = "square";
        String actual = brownie.shapeOfSlice;
        assertEquals(expected,actual);
    }
    @Test
    public void canAddIcingLettering(){
        String expected = "Congratulations!";
        String actual = brownie.addIcingLettering();
        assertEquals(expected,actual);
    }
    @Test
    public void canCount(){
        String result = brownie.countNumberOfSlices(15);
        assertThat(result).isEqualTo("Triple Choc has 15 slices.");
    }

}
