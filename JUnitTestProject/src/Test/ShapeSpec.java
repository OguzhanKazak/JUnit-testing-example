package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Project.*;


class ShapeSpec {

	Circle circle = new Circle(0,0,1);
	Rectangle rectangle = new Rectangle(0,0,2,2);
	Square square = new Square(0,0,2);
	
	ShapeRepository repo = new ShapeRepository();
	Shape[] shapes = repo.shapes;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	//Testing circle class methods.
	
	@Test
	void circleCalculateAreaTest() {
		float result = circle.calculateArea();
		float expected = (float) (Math.PI * 1 * 1);
		
		assertEquals(expected,result);
	}
	
	@Test
	void circleCalculatePerimeter() {
		float result = circle.calculatePerimeter();
		float expected = (float) (Math.PI * 1 * 2);
		
		assertEquals(expected,result);
	}
	
	//Testing Rectangle class methods.
	@Test
	void rectangleCalculateAreaTest() {
		float result = rectangle.calculateArea();
		float expected = 2*2;
		
		assertEquals(expected,result);
	}
	
	@Test
	void rectangleCalculatePerimeter() {
		float result = rectangle.calculatePerimeter();
		float expected = (2+2)*2;
		
		assertEquals(expected,result);
	}
	
	//Testing Square class methods
	@Test
	void squareCalculateAreaTest() {
		float result = square.calculateArea();
		float expected = 2*2;
		
		assertEquals(expected,result);
	}
	
	@Test
	void squareCalculatePerimeter() {
		float result = square.calculatePerimeter();
		float expected = (2+2)*2;
		
		assertEquals(expected,result);
	}
	
	@Test
	@DisplayName ("------In empty array iter.hasNext() should not give us false------")
	void emptyArrayHasNextShouldGiveFalse() {
		Iterator iter = repo.getIterator();
		boolean expected = false;
		boolean result = iter.hasNext();
		assertEquals(expected,result);
	}
	
	@Test
	@DisplayName ("------In empty array iter.hasNext() should not give us true------")
	void filledArrayHasNextShouldGiveTrue() {
		repo.createShapeFromFile(); //Adds shapes from text file to shapes array
		Iterator iter = repo.getIterator();
		boolean expected = true;
		boolean result = iter.hasNext();
		assertEquals(expected,result);
	}
	
	//iterator testing
	@Test
	@DisplayName ("------In empty array iter.next() should not give us null error------")
	void repositoryEmptyArrayIteratorNextShouldGiveNull(){
		Iterator iter = repo.getIterator();
		assertNull(iter.next(), "iter.next() is not null..");
		
	}
	
	@Test
	@DisplayName ("------After we add something to array iter.next() should not give null error------")
	void repoistoryFilledArrayIteratorShouldNotGiveNull(){
		repo.createShapeFromFile();
		Iterator iter = repo.getIterator();
		assertNotNull(iter.next(), "iter.next() is null..");
	}

	
}
