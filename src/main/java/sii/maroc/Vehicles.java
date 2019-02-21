package sii.maroc;

import java.util.HashMap;


public class Vehicles {
	
		private String CumbustibleDescription;
		private HashMap<String, Integer> ConsumptionByType;
		private int VehiculeRealDoorNumber;
		
		private String VehicleType;
		private String CombustibleType;
		private String[] DoorNumber = new String[4];
		private String Distance;
		
		private String DoorStat;
		private  String Movement;
		private  String Vehicledescription;
		
		
		public Vehicles(String description) {
			this.CumbustibleDescription = description;  
		}
		
		public Vehicles(String description,String VehicleType,String combustibleType, String doorNumber,String distance) {
			this.percentByCombustibleType(description);
			this.VehicleType=VehicleType;
			this.CombustibleType=combustibleType;
			this.DoorNumber=deliminateur(doorNumber);
			this.Distance=distance;
			
			
		}

		public String move(String vehicleType ,String combustibleType, String doorNumber,String distance) {
			
			if(vehicleType.equals("CAR")) {
		 		Car vehicle =  new Car(this.CumbustibleDescription,vehicleType, combustibleType,  doorNumber, distance);
				return vehicle.vehiculeStat();
			}
			else if(vehicleType.equals("TRUCK")) {
				Truck vehicle =  new Truck(this.CumbustibleDescription,vehicleType, combustibleType,  doorNumber, distance);
				return vehicle.vehiculeStat();
			}
			else if(vehicleType.equals("MOTORCYCLE")){
				MotorCycle vehicle =  new MotorCycle(this.CumbustibleDescription,vehicleType, combustibleType,  doorNumber, distance);
				return vehicle.vehiculeStat();
			}else {
				return "we don't know this kind of vehicules: "+ vehicleType;
			}
		}
		
		public void percentByCombustibleType(String enter) {
			String[] splitedEnter= deliminateur(enter);
			this.ConsumptionByType = new HashMap<String, Integer>();
			
			for(int i=0; i<splitedEnter.length; i+=3) {
				String conbustible = splitedEnter[i];
				int percent =Integer.parseInt(splitedEnter[i+1]);
				this.ConsumptionByType.put(conbustible, percent);
			}	
		}
		
		public String[] deliminateur(String enter){
			String delims = "[,: %]";
			String[] tokens = enter.split(delims);
			return tokens;
		}
	 
		
		public int consumption() {
			 int consumation = distance(this.Distance)*(this.ConsumptionByType.get(this.CombustibleType))/100;
			 return consumation;
		}

		private int distance(String enter) {
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
			return ConsumptionByType;
		}
		public void setConsumptionByType(HashMap<String, Integer> consumptionByType) {
			this.ConsumptionByType = consumptionByType;
		}

}
