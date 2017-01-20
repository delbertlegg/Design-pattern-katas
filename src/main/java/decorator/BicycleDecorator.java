package decorator;


public class BicycleDecorator extends decorator.Bicycle {
	protected decorator.Bicycle bicycle;
	
	public static class Builder <T extends Builder> {		
		protected decorator.Bicycle bicycle;
		protected String make;
		protected String model;
		protected String serialNumber;
		protected double cost;
		
		public Builder (decorator.Bicycle b) {
			this.bicycle = b;
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
	
	public String getType() {
		return "Generic decorator";
	}
	
	@Override 
	public double value() {
		return this.itemCost + bicycle.value();
	}
	
	public String toString() {
		return String.format("%s" +
							 "Type: %s\n" + 
							 "Make: %s\n" +
							 "Model: %s\n" +
							 "Serial Number: %s\n" +
							 "Cost: %.2f\n", 
		 bicycle.toString(), this.getType(), getItemMake(), getItemModel(), getItemSerialNumber(), getItemCost());
	}
}
