package sii.maroc;

public class Truck extends Vehicles{


	public Truck(String description,String vehicleType,String combustibleType, String doorNumber,String distance) {
		super(description, vehicleType, combustibleType,  doorNumber, distance);
		this.setVehiculeRealDoorNumber(2);
	}

	public String vehiculeStat() {
		if(this.getDoorNumber().length ==  this.getVehiculeRealDoorNumber()) {
			this.allDoorsAreClosed();
		}else {
			this.notAllDoorsAreClosed();
		}
		return "DOORS "+ this.getDoorStat()+ ", "+ this.getMovement() + this.getVehicledescription(); 
	}
	
	
	private void allDoorsAreClosed() {
		this.setDoorStat("OK"); 
		this.setMovement("MOVING. ");
		this.setVehicledescription("The "+this.getVehicleType()+" will consume "+ consumption()+".00 L");
	}
	
	private void notAllDoorsAreClosed() {
		this.setDoorStat("KO"); 
		this.setMovement("BLOCKED \n");
		this.printDoors();
	}

	
	private  void printDoors() {
		String Door = this.getDoorNumber()[0];
	    switch(Door) {
	    	case "1":
	    			this.leftDoorNotClosed();
	      			break;
	    	case "2":
	    			this.rightDoorNotClosed();
	    			break;
	    	case "":
	    			this.allDoorsNotClosed();
	    		   break;
	    	default:
	    		this.setVehicledescription("this is not a truck");
	     		   break;
	    }
	}
	
	
	private void rightDoorNotClosed() {
		this.setVehicledescription("  _\n"+
                " | \\\n"+
                " |_|");
	}
	
	private void leftDoorNotClosed() {
		this.setVehicledescription("  _\n"+
                " / |\n"+
                " |_|");
	}
	
	private void allDoorsNotClosed() {
		this.setVehicledescription("  _\n"+
                " / \\n"+
                " |_|");
	}

}
