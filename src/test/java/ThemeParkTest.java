import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    RollerCoaster rollercoaster;
    Dodgem dodgem;
    Playground playground;
    TobaccoStall tobacco;

    @Before
    public void setup() {
        rollercoaster = new RollerCoaster("Sudden Death", 0);
        dodgem = new Dodgem("Super Dodgem", 2);
        playground = new Playground("Monkey Bar", 7.5);
        tobacco = new TobaccoStall("'Stayaway' Cigarette Shop", "Joe","Lot 49", 3);
    }

    @Test
    public void canPrintAllRatings(){
        rollercoaster.addToThemePark(rollercoaster); // QUALIFIER???
        rollercoaster.addToThemePark(dodgem);
        rollercoaster.addToThemePark(playground);
        rollercoaster.addToThemePark(tobacco);

        assertEquals(4, rollercoaster.getNumberOfPlaces());
        assertEquals("Sudden Death : 0.0, Super Dodgem : 2.0, Monkey Bar : 7.5, 'Stayaway' Cigarette Shop : 3.0", rollercoaster.allRatings());
    }
}
