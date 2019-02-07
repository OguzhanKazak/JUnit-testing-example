package Project;

public class Rectangle implements Shape  {

    float x; //upper left corner X coordinate
    float y; //upper right corner Y coordinate

    float width; //width measuerement
    float height; //height measuerement

    public Rectangle(float x, float y,float width, float height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public float calculateArea() {
        return width * height;
    }

    @Override
    public float calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {

        return "Rectangle  x: "+this.x+" y: "+this.y+" Width: "+this.width+" Height: "+this.height + " Area: "+ String.valueOf(calculateArea())+ " Perimeter: "+ String.valueOf(calculatePerimeter());
    }
}
