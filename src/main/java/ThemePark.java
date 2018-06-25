import java.util.ArrayList;

public abstract class ThemePark {

    public void visit(Visitor visitor, Attraction attraction) {
        if (visitor.getMoney() >= attraction.defaultPrice()) {
            visitor.takeMoney(attraction.defaultPrice());
        }
    }

//    public ArrayList<IReviewed> getAllReviewed();
}
