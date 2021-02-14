public class Residential extends Building{

	protected int numBedroom, numBathroom;
	protected boolean laundryRoom;
	
	public Residential() {
		super();
		numBedroom = 0;
		numBathroom = 0;
		laundryRoom = false;
	}
	
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedroom, int numBathroom) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numBedroom = numBedroom;
		this.numBathroom = numBathroom;
		this.laundryRoom = laundryRoom;
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
	
	public String toString() {
		return super.displayData() + " Number of Bedrooms: " + numBedroom + " Number of Bathrooms: " + numBathroom + " Is there a Laundry Room: " + laundryRoom;
	}
}
