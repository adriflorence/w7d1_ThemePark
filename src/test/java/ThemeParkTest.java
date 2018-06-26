import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    RollerCoaster rollercoaster;
    Dodgem dodgem;
    Playground playground;
    TobaccoStall tobacco;
    IceCreamStall icecream;
    Visitor visitor;

    @Before
    public void setup() {
        visitor = new Visitor(20, 172, 10.50);
        rollercoaster = new RollerCoaster("Sudden Death", 0);
        dodgem = new Dodgem("Super Dodgem", 2);
        playground = new Playground("Monkey Bar", 7.5);
        tobacco = new TobaccoStall("'Stayaway' Cigarette Shop", "Joe","Lot 49", 3);
        icecream = new IceCreamStall("Nardini's", "Mr Nardini", "Stall 42", 9);

        rollercoaster.addToThemePark(rollercoaster); // QUALIFIER???
        rollercoaster.addToThemePark(dodgem);
        rollercoaster.addToThemePark(playground);
        rollercoaster.addToThemePark(tobacco);

        rollercoaster.addToAttractions(rollercoaster);
        rollercoaster.addToAttractions(dodgem);
        rollercoaster.addToAttractions(playground);
        rollercoaster.addToStalls(tobacco);
        rollercoaster.addToStalls(icecream);
    }

    @Test
    public void canPrintAllRatings(){
        assertEquals(4, rollercoaster.getNumberOfPlaces());
        assertEquals("Sudden Death : 0.0, Super Dodgem : 2.0, Monkey Bar : 7.5, 'Stayaway' Cigarette Shop : 3.0", rollercoaster.allRatings());
    }

    @Test
    public void canGetAllowedFor(){
        ArrayList<ITicketed> ticketedPlacesAllowed = new ArrayList<ITicketed>();
        ticketedPlacesAllowed.add(rollercoaster);
        ticketedPlacesAllowed.add(dodgem);
        ticketedPlacesAllowed.add(tobacco);
        assertEquals(ticketedPlacesAllowed , rollercoaster.getAllAllowedFor(visitor));
    }
}
