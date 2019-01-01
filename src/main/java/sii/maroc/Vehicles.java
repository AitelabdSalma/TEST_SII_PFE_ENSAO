package sii.maroc;


public class Vehicles {
		
		private String vehicleType , combustibleType, doorNumber, distance;
		
		 private int DieselPercent, FeulPercent, HybridPercent;
		 private String DoorStat, Movement, Vehicledescription;
		
		 public Vehicles(String description) {
				
				String[]descriptions= DelimComa(description);
				
				this.setDieselPercent(Pourcentage(descriptions[0])); 
				this.setFeulPercent(Pourcentage(descriptions[1])); 
				this.setHybridPercent(Pourcentage(descriptions[2]));
				
				this.setDoorStat(""); 
				this.setMovement("");
				this.setVehicledescription("");
				
			}
			
		
		public String[] DelimDeuxPoint(String enter){
			String delims = "[:]";
			String[] tokens = enter.split(delims);
			return tokens;
		}
		
		public String[] DelimComa(String enter){
			String delims = "[,]";
			String[] tokens = enter.split(delims);
			return tokens;
		}
		public int Pourcentage(String enter) {

			String[] pourcentage= DelimDeuxPoint(enter);
			int res =Integer.parseInt(pourcentage[1].substring(0 ,pourcentage[1].length()-1));
			return res;
		}
		
		public int Distance(String enter) {

			int res =Integer.parseInt(enter.substring(0 ,enter.length()-2));
			return res;
		}
		
		public String Consumption(String Type, String distance) {
			
			 int percent = 0;
			 switch (Type) {
	            case "Disesel": percent = this.getDieselPercent();
	            	break;
	            case "Fuel":  percent = this.getFeulPercent();
	            	break;
	            	
	            case "Hybrid":  percent = this.getHybridPercent();
	            	break;		
			 }
			 
			 int res = Distance(distance)*percent/100;
			 String consumation =String.valueOf(res) ;
			 return consumation;
		}
		
		
		
		

		public String move(String vehicleType ,String combustibleType, String doorNumber,String distance) {
			this.setVehicleType(vehicleType);
			this.setCombustibleType(combustibleType);
			this.setDoorNumber(doorNumber);
			this.setDistance(distance);
			
		
			String response = "DOORS "+ this.getDoorStat()+ ", "+ this.getMovement() + ". " + this.getVehicledescription(); 
			return response;
		}
		
		
		
		public void Car() {
			
			this.setDoorStat("OK"); 
			this.setMovement("MOVING");
			this.setVehicledescription("The "+this.getVehicleType()+" will consume "+ Consumption(getCombustibleType(), getDistance())+".00 L");
		
		}
		
		public void Truck() {
			this.setDoorStat("OK"); 
			this.setMovement("MOVING");
			this.setVehicledescription("The "+this.getVehicleType()+" will consume "+ Consumption(getCombustibleType(), getDistance())+".00 L");
			
			
		}
		
		public void MotorCycle() {
			this.setDoorStat("OK"); 
			this.setMovement("MOVING");
			this.setVehicledescription("The "+this.getVehicleType()+" will consume "+ Consumption(getCombustibleType(), getDistance())+".00 L");
			
		}
		
		public void CarFrontRightDoorNotClosed() {
			this.setDoorStat("KO"); 
			this.setMovement("BLOCKED \n");
			this.setVehicledescription("  _\n"+
                    " | \\\n"+
                    " |_|");
		}
		
		public void CarBackLeftDoorNotClosed() {
			this.setDoorStat("KO"); 
			this.setMovement("BLOCKED \n");
			this.setVehicledescription("  _\n"+
                    " | |\n"+
                    " /_|");
		}


		public int getDieselPercent() {
			return DieselPercent;
		}


		public void setDieselPercent(int dieselPercent) {
			DieselPercent = dieselPercent;
		}


		public int getFeulPercent() {
			return FeulPercent;
		}


		public void setFeulPercent(int feulPercent) {
			FeulPercent = feulPercent;
		}


		public int getHybridPercent() {
			return HybridPercent;
		}


		public void setHybridPercent(int hybridPercent) {
			HybridPercent = hybridPercent;
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


		public String getVehicleType() {
			return vehicleType;
		}


		public void setVehicleType(String vehicleType) {
			this.vehicleType = vehicleType;
		}


		public String getCombustibleType() {
			return combustibleType;
		}


		public void setCombustibleType(String combustibleType) {
			this.combustibleType = combustibleType;
		}


		public String getDoorNumber() {
			return doorNumber;
		}


		public void setDoorNumber(String doorNumber) {
			this.doorNumber = doorNumber;
		}


		public String getDistance() {
			return distance;
		}


		public void setDistance(String distance) {
			this.distance = distance;
		}

		
		
		
}
