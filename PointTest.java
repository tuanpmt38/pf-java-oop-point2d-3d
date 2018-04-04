public class PointTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(0.0f, 0.0f);
        System.out.println(point2D.toString());

        Point2D point2D1 = new Point2D(5.0f, 6.0f);
        System.out.println(point2D1.toString());

        Point3D point3D = new Point3D(3.0f);
        System.out.println(point3D);

        Point3D point3D1 = new Point3D(4.0f, 5.0f, 3.0f);
        System.out.println(point3D1);
    }
}
