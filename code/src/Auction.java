import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Auction {
    public static void main(String[] args) {
        Car car1 = new Car("Bmw", "x5", 2017, 370.000, "ds 30 472");
        Car car2 =  new Car("Chevrolet", "Cruze", 2015, 75.000, "rd 45 379");
        Car car3 = new Car("Skoda", "Fabia", 2007, 67.000, "ex 66 783");
        Car car4 = new Car("Porsche", "911", 2022, 732.000, "ti 10 456");
        // hej osman! da jeg ved du læser vores kode, så ville jeg hurtigt sige hvad jeg prøvede på at gøre
        // jeg valgte at bruge selve Car objekted så da en bidder skal putte en pris kan selve bilen være feltet men det kunne jeg ikke gøre
        // gennem et Arraylist som jeg oprettede. så derfor kunne jeg kun bruge den første hvor jeg kan navngive den specifike bil og ikke var fra et Array
        // måske kunne du hjælpe mig her:)
        ArrayList<Car> cars = new ArrayList<>();
        List<Bid> bidders = new ArrayList<>();

        cars.add(new Car("Audi", "A3", 2017, 350000, "ds 30 472"));
        cars.add(new Car("toyota", "Camry", 2020, 150000, "qt 45 602"));
        cars.add(new Car("Lexus", "lcf", 2013, 64000, "ft 56 322"));
        cars.add(new Car("Maserati", "levante", 2018, 400000, "yf 66 784"));

        bidders.add(new Bid("Felix", 335000, car1));
        bidders.add(new Bid("johanne", 68500, car2));
        bidders.add(new Bid("mark", 55000, car3));
        bidders.add(new Bid("mark,",500000, car4));
        bidders.add(new Bid("Aaron", 70000, car2));
        bidders.add(new Bid("sofie", 57000, car3));

        //System.out.println(bidders);
        System.out.println("unsorted print");
        PrintNicelyCars(cars);
        printLineSeparator();

        Collections.sort(cars);
        PrintNicelyCars(cars);
        System.out.println("sorted by year");
        printLineSeparator();
        cars.sort(new CarBrandComparator());
        PrintNicelyCars(cars);
        System.out.println("Sorted by car brand");
        printLineSeparator();

        cars.sort(new CarPriceComparator());
        PrintNicelyCars(cars);
        System.out.println("sorted by price");
        printLineSeparator();

        System.out.printf( "%,d\n", 201932); // her prøvede jeg en format af så jeg kunne få komma i et tal med flere tusing men jeg kunne ikke
        // få det til at virke med et Array når den skal printe bil værdien ud
        printLineSeparator();
        System.out.println("now onto the bidders");

        printNicelyBids(bidders);
        System.out.println("unsorted");
        printLineSeparator();

        bidders.sort(new BidderNameComparator());
        printNicelyBids(bidders);
        System.out.println("sorted by bidder name");
        printLineSeparator();

        bidders.sort(new BidAmountComparator());
        printNicelyBids(bidders);
        System.out.println("sorted by amount");
        printLineSeparator();

        bidders.sort(new BidCarComparator());
        printNicelyBids(bidders);
        System.out.println("sorted by car brand and model");
        printLineSeparator();

    }
    public static void PrintNicelyCars(ArrayList<Car> cars) {
        for (Car c : cars) {
            System.out.println(c);
        }
    }
    public static void printNicelyBids(List<Bid> bids) {
        for (Bid b : bids) {
            System.out.println(b);
        }
    }
    public static void printLineSeparator() {
        System.out.println("_ _ _ _ _ _ _ _ _");
    }
}
