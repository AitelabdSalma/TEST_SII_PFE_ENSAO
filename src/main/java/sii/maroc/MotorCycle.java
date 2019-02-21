package sii.maroc;

public class MotorCycle extends Vehicles {

	
	public MotorCycle(String description,String vehicleType,String combustibleType, String doorNumber,String distance) {
		super(description, vehicleType, combustibleType,  doorNumber, distance);
		
	}



	public String vehiculeStat() {
		this.setDoorStat("OK"); 
		this.setMovement("MOVING. ");
		this.setVehicledescription("The "+this.getVehicleType()+" will consume "+ consumption()+".00 L");
		
		return "DOORS "+ this.getDoorStat()+ ", "+ this.getMovement() + this.getVehicledescription(); 
	}
	
	

}
