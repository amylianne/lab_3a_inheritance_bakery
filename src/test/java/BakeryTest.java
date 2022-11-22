import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BakeryTest {
    private Bakery bakery;

    @BeforeEach
    public void setUp(){
        bakery = new Bakery("test");
    }

    @Test
    public void canCountCakes(){
        int expected = 0;
        int actual = bakery.countCakes();
        assertEquals(expected, actual);
    }
    @Test
    public void canAddCakes(){
        Cake cake = new Brownie("White","Hearts"){};
        bakery.addCake(cake);
        int expected = 1;
        int actual = bakery.countCakes();
        assertEquals(expected, actual);
    }

}
