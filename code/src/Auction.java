import java.util.ArrayList;

public class Auction {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", "A3", 2017, 370.000, "ds 30 472");
        Car car2 =  new Car("chevrolet", "cruze", 2015, 75.000, "rd 45 379");
        Car car3 = new Car("Skoda", "Fabia", 2007, 67.000, "ex 66 783");
        Car car4 = new Car("Porsche", "911", 2022, 732.000, "ti 10 456");
        // hej osman! da jeg ved du læser vores kode, så ville jeg hurtigt sige hvad jeg prøvede på at gøre
        // jeg valgte at bruge selve Car objekted så da en bidder skal putte en pris kan selve bilen være feltet men det kunne jeg ikke gøre
        // gennem et Arraylist som jeg oprettede. så derfor kunne jeg kun bruge den første hvor jeg kan navngive den specifike bil og ikke var fra et Array
        // måske kunne du hjælpe mig her:)
        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Bid> bidders = new ArrayList<>();

        cars.add(new Car("Audi", "A3", 2017, 350.000, "ds 30 472"));
        cars.add(new Car("toyota", "Camry", 2020, 150.000, "qt 45 602"));
        cars.add(new Car("Lexus", "lcf", 2013, 64.000, "ft 56 322"));
        cars.add(new Car("Maserati", "levante", 2018, 400.000, "yf 66 784"));

        bidders.add(new Bid("Felix", 335.000, car1));
        bidders.add(new Bid("johanne", 68.500, car2));
        bidders.add(new Bid("mark", 55.000, car3));
        bidders.add(new Bid("mark,",500.000, car4));

        System.out.println(bidders);
    }


}
