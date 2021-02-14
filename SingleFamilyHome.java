public class SingleFamilyHome extends Residential{

	private boolean garage;
	
	public SingleFamilyHome() {
		super();
		garage = flase;
	}
	
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedroom, int numBathroom, boolean laundryRoom, boolean garage) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedroom, numBathroom, laundryRoom);
		this.garage = garage;
	}
	
	public boolean isGarage() {
		return garage;
	}
	public void setGarage(boolean garage) {
		this.garage = garage;
	}
	
	public void draw() {
		System.out.println("Drawing code for " + this.getClass().getSimpleName());
	}
	
	public String displayData() {
		String display = super.toString() + "There is a garage: ";
		return display;
	}
	
}
