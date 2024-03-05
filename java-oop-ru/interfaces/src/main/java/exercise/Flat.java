package exercise;

// BEGIN
public class Flat implements Home {
    private double area;
    private double balconyArea;
    private int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }

    @Override
    public double getArea() {
        double result = this.area + this.balconyArea;
        return result;
    }

    @Override
    public String toString() {
        return "Квартира площадью "
                + this.getArea()
                + " метров "
                + "на "
                + this.getFloor()
                + " этаже";
    }
    @Override
    public int compareTo(Home another) {
        return Double.compare(this.getArea(), another.getArea());
    }
}
// END
