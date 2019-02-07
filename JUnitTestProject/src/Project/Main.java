package Project;

public class Main{

    public static void main(String[] args) {

        ShapeRepository repo = new ShapeRepository();
        repo.createShapeFromFile();
        for(Iterator iter = repo.getIterator(); iter.hasNext();){
            System.out.println(iter.next());
        }
      
    }

}

