import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollercoaster;
    Visitor visitor1, visitor2, visitor3;

    @Before
    public void setup() {
        visitor1 = new Visitor(11, 150, 10);
        visitor2 = new Visitor(12, 123, 10);
        visitor3 = new Visitor(21, 210, 20);
        rollercoaster = new RollerCoaster("Sudden Death", 8);
    }

    @Test
    public void kidsAreNotAllowed(){
        assertEquals(false, rollercoaster.isAllowedTo(visitor1));
        assertEquals(false, rollercoaster.isAllowedTo(visitor2));
        assertEquals(true, rollercoaster.isAllowedTo(visitor3));
    }

    @Test
    public void priceForTallPeople(){
        assertEquals(16.80, rollercoaster.priceFor(visitor3), 3);
    }

    @Test
    public void hasRating(){
        assertEquals(8, rollercoaster.getRating());
    }
}
