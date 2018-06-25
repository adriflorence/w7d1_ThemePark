import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall icecream;
    Visitor visitor1, visitor2, visitor3;

    @Before
    public void setup() {
        visitor1 = new Visitor(11, 150, 10);
        visitor2 = new Visitor(20, 172, 6.50);
        visitor3 = new Visitor(18, 210, 20);
        icecream = new IceCreamStall("Nardini's", "Mr Nardini", "Stall 42", 9);
    }

    @Test
    public void hasRating() {
        assertEquals(9, icecream.getRating());
    }

}
