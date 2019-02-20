public class HW2_PR2_Main {
    public static void main(String[] args){
        Triangle t1 = new Triangle(1, 1.5, 1);
        String color = "yellow";
        String filled = "true";
        System.out.println("The Area of the Triangle is: " + t1.getArea());
        System.out.println("The Perimeter of the Triangle is: " + t1.getPerimeter());
        System.out.println("The color is: " + t1.getColor());
        System.out.println("The triangle is filled = " + t1.isFilled());
    }
}
