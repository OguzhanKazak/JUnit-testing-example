package Project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ShapeRepository implements Container {

    public Shape[] shapes = new Shape[100];
    public Scanner scanner;
    
    public ShapeRepository() {
    	try {
            File file = new File("C://Users//oguzhan.kazakk//eclipse-workspace//PolymorphicArrayOfShapes//src//Shapes.txt");
            scanner = new Scanner(file);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("file not found");
        }
    	
    }

    @Override
    public Iterator getIterator() {
        return new ShapeIterator();
    }

    private class ShapeIterator implements Iterator{

        int index;

        @Override
        public boolean hasNext() {
            if((index < shapes.length) && (shapes[index] != null)){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return shapes[index ++];
            }
            return null;
        }
    }
    
    
    public void createShapeFromFile(){
        int count = 0;
        while(scanner.hasNextLine()){

            String line = scanner.nextLine();
            String[] lineProperties = line.split(" ");


            switch (lineProperties[0]){
                case "Rectangle":
                    String[] coordinates = lineProperties[1].replace("(","").replace(")","").split(","); //(X,Y) -> X Y
                    float xCoordinate =  Float.valueOf(coordinates[0]);
                    float yCoordinate = Float.valueOf(coordinates[1]);
                    float width = Float.valueOf(lineProperties[2]);
                    float height = Float.valueOf(lineProperties[3]);
                    Shape rectangle = new Rectangle(xCoordinate,yCoordinate,width,height);
                    shapes[count] = rectangle;
                    count ++;
                    break;
                case "Circle":
                    coordinates = lineProperties[1].replace("(","").replace(")","").split(","); //(X,Y) -> X Y
                    xCoordinate =  Float.valueOf(coordinates[0]);
                    yCoordinate = Float.valueOf(coordinates[1]);
                    width = Float.valueOf(lineProperties[2]);
                    Shape circle = new Circle(xCoordinate,yCoordinate,width);
                    shapes[count] = circle;
                    count ++;
                    break;
                case "Square":
                    coordinates = lineProperties[1].replace("(","").replace(")","").split(","); //(X,Y) -> X Y
                    xCoordinate =  Float.valueOf(coordinates[0]);
                    yCoordinate = Float.valueOf(coordinates[1]);
                    width = Float.valueOf(lineProperties[2]);
                    Shape square = new Square(xCoordinate,yCoordinate,width);
                    shapes[count] = square;
                    count ++;
                    break;
            }

        }
    }
        
}

