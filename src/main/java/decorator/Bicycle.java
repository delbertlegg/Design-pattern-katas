package decorator;

public class Bicycle extends TrackableItem {
	public Bicycle() {
		super();
	}
	
	public Bicycle(String make, String model, String serialNumber, double cost) {
		super(make, model, serialNumber, cost);
	}
	
	@Override
	public String getItemMake() {
		return itemMake;
	}

	@Override
	public void setItemMake(String make) {
		itemMake = make;
	}

	@Override
	public String getItemModel() {
		return itemModel;
	}

	@Override
	public void setItemModel(String model) {
		itemModel = model;
	}

	@Override
	public String getItemSerialNumber() {
		return itemSerialNumber;
	}

	@Override
	public void setItemSerialNumber(String serialNumber) {
		itemSerialNumber = serialNumber;
	}

	@Override
	public double getItemCost() {
		return itemCost;
	}

	@Override
	public void setItemCost(Double cost) {
		itemCost = cost;
	}
	
    @Override
	public double value() {
		// TODO Auto-generated method stub
		return getItemCost();
	}

	@Override
	public String toString() {
		return String.format("Make: %s\n" +
							 "Model: %s\n" +
							 "Serial Number: %s\n" +
							 "Cost: %.2f\n" + 
							 "Acessories - \n\n", getItemMake(), getItemModel(), getItemSerialNumber(), getItemCost());
	}

}
