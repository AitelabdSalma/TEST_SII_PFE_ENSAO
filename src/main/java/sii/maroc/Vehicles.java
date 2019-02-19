package sii.maroc;

import java.util.HashMap;


public class Vehicles {
	
		private HashMap<String, Integer> consumptionByType;
		private int VehiculeRealDoorNumber;
		private String CumbustibleDescription;
		
		
		private String VehicleType;
		private String CombustibleType;
		private String[] DoorNumber = new String[4];
		private String Distance;
		 
		private  String Movement;
		private  String Vehicledescription;
		private String DoorStat;
		
	
		
		public Vehicles(String description) {
			this.CumbustibleDescription = description;  
			String[]descriptions= DeliminateurComa(description);
			
			this.consumptionByType = new HashMap<String, Integer>();
			
			for(String DescriptionPart : descriptions) {
					this.PercentByCombustibleType(DescriptionPart);
			}		
		}
		 
			
		public void PercentByCombustibleType(String enter) {
				String[] splitedEnter= DeliminateurDeuxPoint(enter);
				String conbustible = splitedEnter[0];
				int percent =Integer.parseInt(splitedEnter[1].substring(0 ,splitedEnter[1].length()-1));
				
				this.consumptionByType.put(conbustible, percent);
				
		}	
		
		public String[] DeliminateurComa(String enter){
			String delims = "[,]";
			String[] tokens = enter.split(delims);
			return tokens;
		}
		
		public String[] DeliminateurDeuxPoint(String enter){
			String delims = "[:]";
			String[] tokens = enter.split(delims);
			return tokens;
		}
		
		private String[] DeliminateurEspace(String enter){
			String delims = "[ ]";
			String[] tokens = enter.split(delims);
			return tokens;
		}

		
		public String move(String vehicleType ,String combustibleType, String doorNumber,String distance) {
			
			this.VehicleType = vehicleType;
			this.CombustibleType = combustibleType;
			this.DoorNumber = DeliminateurEspace(doorNumber);
			this.Distance = distance;
			
			return this.VehiculeStat(vehicleType);
		}
	 
		 public String VehiculeStat(String vehicleType) {
			 
			 	if(vehicleType.equals("CAR")) {
			 		Car vehicle =  new Car(this.CumbustibleDescription);
			 		vehicle.setVehicleType(this.VehicleType);
			 		vehicle.setCombustibleType(this.CombustibleType);
					vehicle.setDoorNumber(this.DoorNumber );
					vehicle.setDistance(this.Distance);
					vehicle.setConsumptionByType(this.consumptionByType);
					return vehicle.Stat();
				}
				else if(vehicleType.equals("TRUCK")) {
					Truck vehicle =  new Truck(this.CumbustibleDescription);
					vehicle.setVehicleType(this.VehicleType);
			 		vehicle.setCombustibleType(this.CombustibleType);
					vehicle.setDoorNumber(this.DoorNumber );
					vehicle.setDistance(this.Distance);
					vehicle.setConsumptionByType(this.consumptionByType);
					return vehicle.Stat();
				}
				else if(vehicleType.equals("MOTORCYCLE")){
					MotorCycle vehicle =  new MotorCycle(this.CumbustibleDescription);
					vehicle.setVehicleType(this.VehicleType);
			 		vehicle.setCombustibleType(this.CombustibleType);
					vehicle.setDistance(this.Distance);
					vehicle.setConsumptionByType(this.consumptionByType);
					return vehicle.Stat();
				}else {
					return "we don't know this kind of vehicules: "+ vehicleType;
				}
		}
		 
		 
		public int Consumption() {
			 int consumation = Distance(this.Distance)*(this.consumptionByType.get(this.CombustibleType))/100;
			 return consumation;
		}

		public int Distance(String enter) {
			int res =Integer.parseInt(enter.substring(0 ,enter.length()-3));
			return res;
		}
		


		public String[] getDoorNumber() {
			return DoorNumber;
		}
		public void setDoorNumber(String[] doorNumber) {
			this.DoorNumber = doorNumber;
		}
		
		public String getDoorStat() {
			return DoorStat;
		}
		public void setDoorStat(String doorStat) {
			DoorStat = doorStat;
		}

		
		public String getMovement() {
			return Movement;
		}
		public void setMovement(String movement) {
			Movement = movement;
		}


		public String getVehicledescription() {
			return Vehicledescription;
		}
		public void setVehicledescription(String vehicledescription) {
			Vehicledescription = vehicledescription;
		}
		public void AddToVehicledescription(String description) {
			Vehicledescription += description;
		}


		public String getVehicleType() {
			return VehicleType;
		}
		public void setVehicleType(String vehicleType) {
			this.VehicleType = vehicleType;
		}


		public String getCombustibleType() {
			return CombustibleType;
		}
		public void setCombustibleType(String combustibleType) {
			this.CombustibleType = combustibleType;
		}


		public String getDistance() {
			return Distance;
		}
		public void setDistance(String distance) {
			this.Distance = distance;
		}


		public int getVehiculeRealDoorNumber() {
			return VehiculeRealDoorNumber;
		}
		public void setVehiculeRealDoorNumber(int VehiculeRealDoorNumber) {
			this.VehiculeRealDoorNumber = VehiculeRealDoorNumber;
		}

		
		public HashMap<String, Integer> getConsumptionByType() {
			return consumptionByType;
		}
		public void setConsumptionByType(HashMap<String, Integer> consumptionByType) {
			this.consumptionByType = consumptionByType;
		}

}
