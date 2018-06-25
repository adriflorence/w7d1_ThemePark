import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    RollerCoaster rollercoaster;
    Visitor visitor1, visitor3;

    @Before
    public void setup() {
        visitor1 = new Visitor(11, 150, 10);
        visitor3 = new Visitor(21, 210, 20);
        rollercoaster = new RollerCoaster("Sudden Death", 8);
    }

    @Test
    public void canVisit(){

    }

}
