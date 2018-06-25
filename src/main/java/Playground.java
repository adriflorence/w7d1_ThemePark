public class Playground extends Attraction implements ISecurity{

    public boolean isAllowedTo(Visitor visitor){ // public
        return visitor.getAge() < 15;
    }


}
