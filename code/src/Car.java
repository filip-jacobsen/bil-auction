public class Car implements Comparable<Car> {

    private String brand;
    private String model;
    private int year;
    private double basePrice;
    private String numberPlate;


    public Car (String brand, String model, int year, double basePrice, String numberPlate) {
        this.brand = brand;
        this.model = model;
        this.basePrice = basePrice;
        this.year = year;
        this.numberPlate = numberPlate;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    @Override
    public int compareTo(Car o) {
        return Integer.compare(o.getYear(), this.year);
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Year: " + year + ", Base price: " + basePrice +  " Numberplate: " + numberPlate;
    }
}
