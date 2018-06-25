public class Visitor {

    private int age;
    private int height;
    private double money;

    public Visitor(int age, int height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public void takeMoney(double money) {
        this.money -= money;
    }

    public boolean canAfford(Visitor visitor, Attraction attraction) {
        return (money >= attraction.priceFor(visitor));
    }

    public void rate(IReviewed place, int ratingGiven) {
        double currentRating = place.getRating();
        // round to the nearest .5
        double newRating = (((currentRating + ratingGiven) / place.getNumberOfVisitors()) * 2) / 2.0;
        place.setRating(newRating);
    }
}
