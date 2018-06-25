public class TobaccoStall implements ISecurity {

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() > 18;
    }
}
