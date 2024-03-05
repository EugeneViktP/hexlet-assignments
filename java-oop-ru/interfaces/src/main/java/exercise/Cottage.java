package exercise;

// BEGIN
public class Cottage implements Home {
    private double area;
    private int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }
    @Override
    public double getArea() {
        return this.area;
    }

    public int getFloorCount() {

        return floorCount;
    }

    @Override
    public int compareTo(Home another) {
        return Double.compare(this.getArea(), another.getArea());
    }


    public String toString() {
        return getFloorCount()
                + " этажный коттедж площадью "
                + this.getArea()
                + " метров";
    }
}
// END
