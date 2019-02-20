public class Circle2D{
    private double x, y;
    private double radius;

    double getRadius(){

        return radius;
    }

    Circle2D(){
        x = 0;
        y = 0;
        radius = 1.0;
    }

    Circle2D(double a, double b, double r){
        x = a;
        y = b;
        radius = r;
    }

    double getArea(){

        return 3.14 * radius * radius;
    }

    double getPerimeter(){

        return 2.0 * 3.14 * radius;
    }

    boolean contains(double x, double y){
        double temp = (x - this.x) * (x - this.x) + (y - this.y) * (y - this.y);
        if(temp < radius * radius) return true;
        else return false;
    }

    boolean contains(Circle2D circle){
        double temp = (circle.x - x) * (circle.x - x) + (circle.y - y) * (circle.y - y);
        if(temp < radius * radius) return true;
        else return false;
    }

    boolean overlaps(Circle2D circle){
        double temp = (circle.x - x) * (circle.x - x) + (circle.y - y) * (circle.y - y);
        if(temp <= radius + circle.radius && temp >= Math.abs(radius - circle.radius)) return true;
        else return false;
    }
}
