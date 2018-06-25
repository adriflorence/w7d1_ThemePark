import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor1, visitor2, visitor3;

    @Before
    public void setup() {
        visitor1 = new Visitor(11, 150, 10);
        visitor2 = new Visitor(12, 123, 10);
        visitor3 = new Visitor(21, 210, 20);
        playground = new Playground("Playground1", 8);
    }

    @Test
    public void underAgeCannotBuy(){
        assertEquals(true, playground.isAllowedTo(visitor1));
        assertEquals(false, playground.isAllowedTo(visitor3));
    }

}