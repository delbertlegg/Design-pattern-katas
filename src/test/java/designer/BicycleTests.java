package designer;

import static org.junit.Assert.*;

import org.junit.*;

import designer.BicycleDecorator.Builder;
import designer.BikeLight.LightBuilder;
import designer.BikeBrakes.BrakeBuilder;

public class BicycleTests {
	private static Bicycle bicycle;
	private String bikeToString = "Make: Montague\n" +
								  "Model: Navigator\n" +
								  "Serial Number: A12345\n" +
								  "Cost: 900.00\n" + 
								  "Acessories - \n\n";
	
	private String lightToString = "Type: Bike Light\n" +
								   "Make: Cree\n" +
								   "Model: Multifunction\n" +
								   "Serial Number: 123\n" +
								   "Cost: 31.99\n" + 
								   "Battery Type: Lithium Ion\n" +
								   "Bulb Type: LED\n\n";
	
	private String brakesToString = "Type: Brakes\n" +
								    "Make: Shimano\n" +
								    "Model: null\n" +
								    "Serial Number: null\n" +
								    "Cost: 50.00\n" + 
								    "Brake Style: Center pull\n" +
									"Part Number: 123A456B\n\n";
	
	@BeforeClass
	public static void beforeClass() {
		bicycle = new Bicycle("Montague", "Navigator", "A12345", 900.00);
	}
	
	public Builder createNewLight(Bicycle b) {
		return new LightBuilder(b).make("Cree").model("Multifunction").serialNumber("123")
				.cost(31.99).batteryType("Lithium Ion").bulbType("LED");
	}
	
	public Builder createNewBrakes(Bicycle b) {
		return new BrakeBuilder(b).make("Shimano").partNumber("123A456B").brakeStyle("Center pull").cost(50.00);
	}
	
	@Test
	public void BicycleToStringTest() {
		assertEquals(bikeToString, bicycle.toString());
	}
	
	@Test
	public void BikeLightBuilderTest() {
		Bicycle bikeWithLight = createNewLight(bicycle).build();
		assertEquals(bikeToString + lightToString, bikeWithLight.toString());
	}
	
	@Test
	public void BikeValueTest() {
		Bicycle bikeWithLight = createNewLight(bicycle).build();
		assertEquals(0, Double.compare(bikeWithLight.value(), bicycle.getItemCost() + bikeWithLight.getItemCost()));
	}
	
	@Test
	public void BikeValueWithTwoLightsTest() {
		Bicycle bikeWithLight = createNewLight(bicycle).build();
		Bicycle bikeWithTwoLights = createNewLight(bikeWithLight).build();
		assertEquals(0, Double.compare(bikeWithTwoLights.value(), 
				bicycle.getItemCost() + bikeWithLight.getItemCost() + bikeWithTwoLights.getItemCost()));
	}
	
	@Test
	public void BikeWithBrakes() {
		Bicycle bikeWithBrakes = createNewBrakes(bicycle).build();
		assertEquals(bikeToString + brakesToString, bikeWithBrakes.toString());
	}
	
	@Test
	public void BikeValueWithBrakes() {
		Bicycle bikeWithBrakes = createNewBrakes(bicycle).build();
		assertEquals(0, Double.compare(bikeWithBrakes.value(), bicycle.getItemCost() + bikeWithBrakes.getItemCost()));
	}
}