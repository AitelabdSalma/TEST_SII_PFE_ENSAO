package sii.maroc;

public class Truck extends Vehicles{


	public Truck(String description) {
		super(description);
		this.setVehiculeRealDoorNumber(2);
		
	}

	public String Stat() {
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
		this.setVehicledescription("The "+this.getVehicleType()+" will consume "+ Consumption()+".00 L");
	}
	
	private void notAllDoorsAreClosed() {
		this.setDoorStat("KO"); 
		this.setMovement("BLOCKED \n");
		this.printDoors();
	}

	
	public void printDoors() {
		String Door = this.getDoorNumber()[0];
	    switch(Door) {
	    	case "1":
	    			this.LeftDoorNotClosed();
	      			break;
	    	case "2":
	    			this.RightDoorNotClosed();
	    			break;
	    	case "":
	    			this.AllDoorsNotClosed();
	    		   break;
	    	default:
	    		this.setVehicledescription("this is not a truck");
	     		   break;
	    }
	}
	
	
	public void RightDoorNotClosed() {
		this.setVehicledescription("  _\n"+
                " | \\\n"+
                " |_|");
	}
	
	public void LeftDoorNotClosed() {
		this.setVehicledescription("  _\n"+
                " / |\n"+
                " |_|");
	}
	
	public void AllDoorsNotClosed() {
		this.setVehicledescription("  _\n"+
                " / \\n"+
                " |_|");
	}

}