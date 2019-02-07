package Project;

public class Square implements Shape {

    float x; //upper left corner X coordinate
    float y; //upper left corner Y coordinate

    float width; //a side of Square

    public Square(float x, float y,float width){
        this.x = x;
        this.y = y;
        this.width = width;
    }

    @Override
    public float calculateArea() {
        return width * width;
    }

    @Override
    public float calculatePerimeter() {
        return 4 * width;
    }

    @Override
    public String toString() {
        return ("Square  x: "+this.x+" y: "+this.y+" Width: "+this.width + " Area: "+ String.valueOf(calculateArea())+ " Perimeter: "+ String.valueOf(calculatePerimeter()));

    }
}
