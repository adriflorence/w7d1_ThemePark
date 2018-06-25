import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobacco;
    Visitor visitor1, visitor2, visitor3;

    @Before
    public void setup() {
        visitor1 = new Visitor(11, 150, 10);
        visitor2 = new Visitor(12, 123, 10);
        visitor3 = new Visitor(21, 210, 20);
        tobacco = new TobaccoStall();
    }

    @Test
    public void underAgeCannotBuy(){
        assertEquals(false, tobacco.isAllowedTo(visitor1));
        assertEquals(true, tobacco.isAllowedTo(visitor3));
    }

}