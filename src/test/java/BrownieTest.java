import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BrownieTest {
    private Brownie brownie;

    @BeforeEach
    public  void setUp() { brownie =new Brownie("Triple Choc", "square");}

    @Test
    public  void getShapeOfSlices(){
        String expected = "square";
        String actual = brownie.shapeOfSlice;
        assertEquals(expected,actual);

    }
}
