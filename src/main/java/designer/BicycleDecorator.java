package designer;

import designer.BikeLight.LightBuilder;

public class BicycleDecorator extends Bicycle {
	protected Bicycle bicycle;
	
	public static class Builder <T extends Builder> {		
		protected Bicycle bicycle;
		protected String make;
		protected String model;
		protected String serialNumber;
		protected double cost;
		
		public T bicycle (Bicycle b) {
			this.bicycle = b;
			return (T) this;
		}
		
		
		public T make(String make) {
			this.make = make;
			return (T) this;
		}
		
		public T model(String model) {
			this.model = model;
			return (T) this;
		}
		
		public T serialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
			return (T) this;
		}
		
		public T cost(double cost) {
			this.cost = cost;
			return (T) this;
		}
		
		public BicycleDecorator build() {
			return new BicycleDecorator(this);
		}		
	}
	
	protected BicycleDecorator(Builder builder) {
		bicycle = builder.bicycle;
		itemMake = builder.make;
		itemModel = builder.model;
		itemSerialNumber = builder.serialNumber;
		itemCost = builder.cost;
	}
	
	public String toString() {
		return String.format("%s\t" +
							 "Make: %s\n" +
							 "Model: %s\n" +
							 "Serial Number: %s\n" +
							 "Cost: %.2f\n", 
		bicycle.toString(), getItemMake(), getItemModel(), getItemSerialNumber(), getItemCost());
	}
}
