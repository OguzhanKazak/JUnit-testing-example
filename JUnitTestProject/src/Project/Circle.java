package Project;

public class Circle implements Shape {

    float x; //center X coordinate
    float y; //center Y coordinate

    float radius;

    public Circle (float x,float y, float radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public float calculateArea() {
            return (float) (Math.PI * (radius * radius));
    }

    @Override
    public float calculatePerimeter() {
            return (float) (2 * Math.PI * radius);
    }

    @Override
    public String toString() {
        return ("Circle  x: "+this.x+" y: "+this.y+" Radius: "+this.radius+" Area: "+ String.valueOf(calculateArea())+ " Perimeter: "+ String.valueOf(calculatePerimeter()));

    }
}
