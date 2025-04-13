import java.util.Comparator;

public class CarPriceComparator implements Comparator<Car> {

    public int compare(Car p1, Car p2) {
        return Double.compare(p1.getBasePrice(), p2.getBasePrice());
    }
}
