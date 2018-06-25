import java.util.ArrayList;

public abstract class ThemePark {

    ArrayList<IReviewed> allPlaces;

    public void visit(Visitor visitor, Attraction attraction) {
        if (visitor.getMoney() >= attraction.defaultPrice()) {
            visitor.takeMoney(attraction.defaultPrice());
        }
    }

    public void addPlaceToThemePark(IReviewed place){
        allPlaces.add(place);
    }

    public ArrayList<IReviewed> getAllReviewed(){
        ArrayList<IReviewed> reviewedPlaces = new ArrayList<IReviewed>();


        return reviewedPlaces;
    }
}
