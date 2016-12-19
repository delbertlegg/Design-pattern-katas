package designer;

import java.io.Serializable;

public abstract class TrackableItem implements Serializable {

	private static final long serialVersionUID = 1L;
	protected String itemMake;
	protected String itemModel;
	protected String itemSerialNumber;
	protected double itemCost;
	
	public TrackableItem() {}
	public TrackableItem(String make, String model, String serialNumber, double cost) {
		itemMake = make;
		itemModel = model;
		itemSerialNumber = serialNumber;
		itemCost = cost;
	}
	
	public abstract String getItemMake();
	public abstract void setItemMake(String make);
	
	public abstract String getItemModel();
	public abstract void setItemModel(String model);
	
	public abstract String getItemSerialNumber();
	public abstract void setItemSerialNumber(String serialNumber);
	
	public abstract double getItemCost();
	public abstract void setItemCost(Double cost);
	
	public abstract String toString();
}
