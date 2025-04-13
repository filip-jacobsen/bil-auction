import java.util.Comparator;

public class BidderNameComparator implements Comparator<Bid> {
    public int compare(Bid n1, Bid n2) {
        return n1.getBidderName().compareTo(n2.getBidderName());
    }
}
