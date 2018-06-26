import java.util.ArrayList;

public abstract class ThemePark {

    ArrayList<IReviewed> allReviewed = new ArrayList<IReviewed>();
    ArrayList<Stall> stalls = new ArrayList<Stall>();
    ArrayList<Attraction> attractions = new ArrayList<Attraction>();


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

    public void addToAttractions(Attraction place){
        attractions.add(place);
    }

    public void addToStalls(Stall place){
        stalls.add(place);
    }

    public int getNumberOfPlaces(){
        return allReviewed.size();
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return allReviewed;
    }

    public ArrayList<ITicketed> getAllAllowedFor(Visitor visitor) {
        ArrayList<ISecurity> restrictedPlaces = new ArrayList<ISecurity>();
        ArrayList<ITicketed> placesThatAllowed = new ArrayList<ITicketed>();
        for (IReviewed place : allReviewed) {
            if (place instanceof ISecurity){
                restrictedPlaces.add((ISecurity) place);
            }
        }
        for (ISecurity restrictedPlace : restrictedPlaces) {
            if (restrictedPlace.isAllowedTo(visitor) && visitor.canAfford(visitor, (ITicketed) restrictedPlace)) {
                placesThatAllowed.add((ITicketed) restrictedPlace);
            }
        }
        return placesThatAllowed;
    }

    public String allRatings(){
        String ratingsForAllPlaces = "";
        for (IReviewed place : allReviewed) {
            ratingsForAllPlaces += place.getName() + " : " + place.getRating() + ", ";
        }

        // removes trailing comma
        ratingsForAllPlaces = ratingsForAllPlaces.replaceAll(", $", "");
        return ratingsForAllPlaces;
    }
}
