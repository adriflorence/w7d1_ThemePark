public abstract class Attraction extends ThemePark implements IReviewed, ITicketed {

    private String name;
    private int rating;

    public Attraction(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }
}
