public class SingleFamilyHome extends Residential{

	private boolean garage;
	
	public SingleFamilyHome() {
		super();
		garage = false;
	}
	
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
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
		String display =  "Project Name: " + projectName + " Full Address: " + completeAddress+ " SquareFeet: " + totalSquareFeet + " Occupancy group: " + occupancyGroup + " Subgroup: " + subgroup + " There is a garage: " + garage +  " Number of Bedrooms: " + numBedroom + " Number of Bathrooms: " + numBathroom + " Is there a Laundry Room: " + laundryRoom;
		return display;
	}
	
}
