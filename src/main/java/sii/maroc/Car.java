package sii.maroc;



public class Car extends Vehicles {
	
	

	public Car(String description) {
		super(description);
		this.setVehiculeRealDoorNumber(4);
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
		this.setVehicledescription("  _\n");
		this.printCarFrontLeftDoor();
		this.printCarFrontRightDoor();
		this.printCarBackLeftDoor();
		this.printCarBackRightDoor();
		
	}
	
	public void printCarFrontLeftDoor() {
		String doorPrint = " / ";
		
		for(int nbr=0; nbr<this.getDoorNumber().length; nbr++) {
			if(this.getDoorNumber()[nbr].equals("1")) {
				doorPrint = " | ";
				break;
			}
		}
		this.AddToVehicledescription(doorPrint);
	}
	
	public void printCarFrontRightDoor() {
		String doorPrint = "\\\n";
		
		for(int nbr=0; nbr<this.getDoorNumber().length; nbr++) {
			if(this.getDoorNumber()[nbr].equals("2")) {
				doorPrint = "|\n";
				break;
			}
		}
		this.AddToVehicledescription(doorPrint);
	}
	
	public void printCarBackLeftDoor() {
		String doorPrint = " /_";
		
		for(int nbr=0; nbr<this.getDoorNumber().length; nbr++) {
			if(this.getDoorNumber()[nbr].equals("3")) {
				doorPrint = " |_";
				break;
			}
		}
		this.AddToVehicledescription(doorPrint);
	}
	
	
	public void printCarBackRightDoor() {
		String doorPrint = "\\";
		
		for(int nbr=0; nbr<this.getDoorNumber().length; nbr++) {
			if(this.getDoorNumber()[nbr].equals("4")) {
				doorPrint = "|";
				break;
			}
		}
		this.AddToVehicledescription(doorPrint);
	}
	
	
}
