public class Residential extends Building{

	protected int numBedroom, numBathroom;
	protected boolean laundryRoom;
	
	public Residential() {
		super();
		numBedroom = 0;
		numBathroom = 0;
		laundryRoom = false;
	}
	
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
	}
	
	public int getNumBedroom() {
		return numBedroom;
	}
	public void setNumBedroom(int numBedroom) {
		this.numBedroom = numBedroom;
	}
	public int getNumBathroom() {
		return numBathroom;
	}
	public void setNumBathroom(int numBathroom) {
		this.numBathroom = numBathroom;
	}
	public boolean isLaundryRoom() {
		return laundryRoom;
	}
	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}
	
	public String displayData() {
		String display = "Project Name: " + projectName + " Full Address: " + completeAddress+ " SquareFeet: " + totalSquareFeet + " Occupancy group: " + occupancyGroup + " Subgroup: " + subgroup + " Number of Bedrooms: " + numBedroom + " Number of Bathrooms: " + numBathroom + " Is there a Laundry Room: " + laundryRoom;  
		return display;
	}
}
