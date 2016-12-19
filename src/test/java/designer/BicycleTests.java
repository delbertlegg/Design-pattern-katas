package designer;

import static org.junit.Assert.*;

import org.junit.*;

public class BicycleTests {
	private static Bicycle bicycle;
	@BeforeClass
	public static void beforeClass() {
		bicycle = new Bicycle("Montague", "Navigator", "A12345", 900.00);
	}
	
	@Test
	public void BicycleToStringTest() {
		String bicycleToStringExpected = "Make: Montague\n" +
										 "Model: Navigator\n" +
										 "Serial Number: A12345\n" +
										 "Cost: 900.00\n" + 
										 "Acessories - \n";
		assertEquals(bicycleToStringExpected, bicycle.toString());
	}
	
	@Test
	public void BikeLightBuilderTest() {
		
	}
}
