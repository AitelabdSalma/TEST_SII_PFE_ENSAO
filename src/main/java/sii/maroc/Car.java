package sii.maroc;



public class Car extends Vehicles {
	

	public Car(String description,String vehicleType,String combustibleType, String doorNumber,String distance) {
		super(description, vehicleType, combustibleType,  doorNumber, distance);
		this.setVehiculeRealDoorNumber(4);
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

	
	private void printDoors() {
		this.setVehicledescription("  _\n");
		this.printCarFrontLeftDoor();
		this.printCarFrontRightDoor();
		this.printCarBackLeftDoor();
		this.printCarBackRightDoor();
		
	}
	
	private void printCarFrontLeftDoor() {
		String doorPrint = " / ";
		
		for(int nbr=0; nbr<this.getDoorNumber().length; nbr++) {
			if(this.getDoorNumber()[nbr].equals("1")) {
				doorPrint = " | ";
				break;
			}
		}
		this.AddToVehicledescription(doorPrint);
	}
	
	private void printCarFrontRightDoor() {
		String doorPrint = "\\\n";
		
		for(int nbr=0; nbr<this.getDoorNumber().length; nbr++) {
			if(this.getDoorNumber()[nbr].equals("2")) {
				doorPrint = "|\n";
				break;
			}
		}
		this.AddToVehicledescription(doorPrint);
	}
	
	private void printCarBackLeftDoor() {
		String doorPrint = " /_";
		
		for(int nbr=0; nbr<this.getDoorNumber().length; nbr++) {
			if(this.getDoorNumber()[nbr].equals("3")) {
				doorPrint = " |_";
				break;
			}
		}
		this.AddToVehicledescription(doorPrint);
	}
	
	
	private void printCarBackRightDoor() {
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
