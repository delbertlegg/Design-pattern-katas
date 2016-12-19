package designer;

public class BikeLight extends BicycleDecorator {
	private String batteryType;
	private String bulbType;
	
	public static class LightBuilder extends BicycleDecorator.Builder<LightBuilder> {		
		private String batteryType;
		private String bulbType;
		
		public LightBuilder batteryType(String battery) {
			batteryType = battery;
			return this;
		}
		
		public LightBuilder bulbType(String bulb) {
			bulbType = bulb;
			return this;
		}

		@Override
		public BicycleDecorator build() {
			return new BikeLight(this);
		}		
	}
	
	protected BikeLight(LightBuilder builder) {
		super(builder);
		setBatteryType(builder.batteryType);
		setBulbType(builder.bulbType);
	}

	public String getBatteryType() {
		return batteryType;
	}

	public void setBatteryType(String batteryType) {
		this.batteryType = batteryType;
	}

	public String getBulbType() {
		return bulbType;
	}

	public void setBulbType(String bulbType) {
		this.bulbType = bulbType;
	}

	@Override
	public String toString() {
		return String.format("%s" +
							 "Battery Type: %s\n" +
							 "Bulb Type: %s\n",
		super.toString(), getBatteryType(), getBulbType());
	}

}
