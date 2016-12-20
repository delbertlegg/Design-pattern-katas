package designer;


public class BikeBrakes extends BicycleDecorator {
	private String repairPartNumber;
	private String brakeStyle; 
	
	public static class BrakeBuilder extends BicycleDecorator.Builder<BrakeBuilder> {		
		public BrakeBuilder(Bicycle b) {
			super(b);
		}

		private String repairPartNumber;
		private String brakeStyle;
		
		public BrakeBuilder partNumber(String partNumber) {
			repairPartNumber = partNumber;
			return this;
		}
		
		public BrakeBuilder brakeStyle(String style) {
			brakeStyle = style;
			return this;
		}

		@Override
		public BicycleDecorator build() {
			return new BikeBrakes(this);
		}		
	}

	protected BikeBrakes(BrakeBuilder builder) {
		super(builder);
		brakeStyle = builder.brakeStyle;
		repairPartNumber = builder.repairPartNumber;
	}

	public String getRepairPartNumber() {
		return repairPartNumber;
	}

	public void setRepairPartNumber(String repairPartNumber) {
		this.repairPartNumber = repairPartNumber;
	}

	public String getBrakeStyle() {
		return brakeStyle;
	}

	public void setBrakeStyle(String brakeStyle) {
		this.brakeStyle = brakeStyle;
	}
	
	@Override
	public String getType() {
		return "Brakes";
	}
	
	@Override
	public String toString() {
		return String.format("%s" +
				 "Brake Style: %s\n" +
				 "Part Number: %s\n\n",
		super.toString(), getBrakeStyle(), getRepairPartNumber());
	}

}
