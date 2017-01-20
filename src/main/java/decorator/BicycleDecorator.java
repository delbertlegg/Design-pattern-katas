package decorator;


public class BicycleDecorator extends Bicycle {
	protected Bicycle bicycle;
	
	public static class Builder <T extends Builder> {		
		protected Bicycle bicycle;
		protected String make;
		protected String model;
		protected String serialNumber;
		protected double cost;
		
		public Builder (Bicycle b) {
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
	
	public Bicycle getBicycle() {
		return this.bicycle;
	}
	
	public void removeDecoration(BicycleDecorator decorator) {
		Class decoratorClass = decorator.getClass();
		while (this.bicycle instanceof BicycleDecorator) {
			if (decoratorClass.getClass().isInstance(this.bicycle)) {
				this.bicycle = ((BicycleDecorator)this.bicycle).getBicycle();
			}
			else removeDecoration((BicycleDecorator)this.bicycle);
		}		
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
