import java.util.Comparator;

public class BidAmountComparator implements Comparator<Bid> {

    public int compare(Bid b1, Bid b2) {
        return Double.compare(b1.getAmount(), b2.getAmount());
    }
}
