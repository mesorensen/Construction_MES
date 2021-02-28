public class Business extends Building{

	protected int numRentableUnits;
	
	public Business() {
		super();
		numRentableUnits = 0;
	}
	
	public Business (String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numRentableUnits = numRentableUnits;
	}
	
	
	public int getNumRentableUnits() {
		return numRentableUnits;
	}
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}
	
	public String displayData() {
		String display = "Project Name: " + projectName + " Full Address: " + completeAddress+ " SquareFeet: " + totalSquareFeet + " Occupancy group: " + occupancyGroup + " Subgroup: " + subgroup + " Number of Rentable Units: " + numRentableUnits;  
		return display;
	}
	
} 
