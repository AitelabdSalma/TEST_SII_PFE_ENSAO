package sii.maroc;

public class MotorCycle extends Vehicles {

	public MotorCycle(String description) {
		super(description);
		
	}


	public String Stat() {
		this.setDoorStat("OK"); 
		this.setMovement("MOVING. ");
		this.setVehicledescription("The "+this.getVehicleType()+" will consume "+ Consumption()+".00 L");
		
		return "DOORS "+ this.getDoorStat()+ ", "+ this.getMovement() + this.getVehicledescription(); 
	}
	
	

}
