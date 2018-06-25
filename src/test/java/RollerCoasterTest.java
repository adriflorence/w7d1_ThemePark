import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollercoaster;
    Visitor visitor1, visitor2, visitor3, visitor4, visitor5;

    @Before
    public void setup() {
        visitor1 = new Visitor(11, 150, 10); // too young
        visitor2 = new Visitor(12, 123, 10); // too short
        visitor3 = new Visitor(21, 210, 20); // double price
        visitor4 = new Visitor(27, 179, 4);  // cannot afford
        visitor5 = new Visitor(27, 179, 400);
        rollercoaster = new RollerCoaster("Sudden Death", 0);
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

    @Test
    public void canVisitRollerCoaster() {
        rollercoaster.visit(visitor1, rollercoaster);
        rollercoaster.visit(visitor2, rollercoaster);
        rollercoaster.visit(visitor3, rollercoaster);
        rollercoaster.visit(visitor4, rollercoaster);
        assertEquals(10, visitor1.getMoney(), 3); // too young
        assertEquals(10, visitor1.getMoney(), 3); // too short
        assertEquals(3.20, visitor3.getMoney(), 3); // pays double
        assertEquals(4, visitor4.getMoney(), 3); // cannot afford

        assertEquals(1 , rollercoaster.getNumberOfVisitors());
    }


    @Test
    public void canBeRated(){
        rollercoaster.visit(visitor5, rollercoaster);
        visitor5.rate(rollercoaster, 8);

        assertEquals(8.0, rollercoaster.getRating(), 3);
        assertEquals(1 , rollercoaster.getNumberOfVisitors());

        rollercoaster.visit(visitor3, rollercoaster);
        visitor3.rate(rollercoaster, 5);
        assertEquals(6.5, rollercoaster.getRating(), 3);
    }

}
