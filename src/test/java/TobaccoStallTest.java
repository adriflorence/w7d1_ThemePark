import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobacco;
    Visitor visitor1, visitor2, visitor3;

    @Before
    public void setup() {
        visitor1 = new Visitor(11, 150, 10);
        visitor2 = new Visitor(20, 172, 6.50);
        visitor3 = new Visitor(18, 210, 20);
        tobacco = new TobaccoStall("'Stayaway' Cigarette Shop", "Joe","Lot 49", 3);
    }

    @Test
    public void underAgeCannotBuy(){
        assertEquals(false, tobacco.isAllowedTo(visitor1));
        assertEquals(true, tobacco.isAllowedTo(visitor3));
    }

    @Test
    public void customerCannotAfford(){
        assertEquals(false, tobacco.isAllowedTo(visitor1));
    }

}