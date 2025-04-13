import java.util.Comparator;

public class CarBrandComparator implements Comparator<Car> {

    public int compare(Car c1, Car c2) {
        return c1.getBrand().compareTo(c2.getBrand());
    }
}
