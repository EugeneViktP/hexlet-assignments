package exercise;

// BEGIN
public class Segment {
    private static Point beginPoint;
    private static Point endPoint;
    private Point midPoint;

    public Segment(Point beginPoint, Point endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }

    public static Point getBeginPoint() {
        return beginPoint;
    }

    public static Point getEndPoint() {
        return endPoint;
    }

    public Point getMidPoint() {
        int x = (Segment.getBeginPoint().getX() + Segment.getEndPoint().getX()) / 2;
        int y = (Segment.getBeginPoint().getY() + Segment.getEndPoint().getY()) / 2;
        return new Point(x, y);
    }
}
// END
