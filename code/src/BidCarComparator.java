import java.util.Comparator;

public class BidCarComparator implements Comparator<Bid> {

    public int compare(Bid c1, Bid c2) {
        return c1.getCarBrandAndModel().compareTo(c2.getCarBrandAndModel());
    }
}
