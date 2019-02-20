public class HW2_PR1_Main {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println("The Area is: " + c1.getArea());
        System.out.println("The Perimeter is: " + c1.getPerimeter());
        System.out.println("The point is inside the circle: " + c1.contains(3, 3));
        System.out.println("The new circle is contained in the original circle: " + c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("The two circles overlap: " + c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}
