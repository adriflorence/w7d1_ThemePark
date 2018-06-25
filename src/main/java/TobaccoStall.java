public class TobaccoStall implements ISecurity {

    public double defaultPrice() {
        return 6.60;
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() >= 18;
    }

}
