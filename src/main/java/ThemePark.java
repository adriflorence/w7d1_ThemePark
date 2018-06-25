import java.util.ArrayList;

public abstract class ThemePark {

    ArrayList<IReviewed> allReviewed = new ArrayList<IReviewed>();

    public void visit(Visitor visitor, Attraction attraction) {
        if (attraction.isAllowedTo(visitor) && visitor.canAfford(visitor, attraction)) {
            visitor.takeMoney(attraction.priceFor(visitor));
            attraction.getMoneyFrom(visitor);
            attraction.addVisitor(visitor);
        }
    }

    public void addToThemePark(IReviewed place){
        allReviewed.add(place);
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return allReviewed;
    }

//    public ArrayList<ITicketed> getAllAllowedFor(Visitor visitor) {
//
//    }
}
