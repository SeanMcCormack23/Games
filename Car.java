package se;

public class Car {

		public String model;
		public String name;
		int wheelDrive;
		int horsePower;
		int maxSpeed;
		int group;
		double zeroSixty;
		int cost;
		int unitsSold;
		int revenue;
		int profit;
		int tradePrice;
		
		public Car () {
			this.name = "undefined";
			this.model = "undefined";
			this.wheelDrive = 0;
			this.horsePower = 0;
			this.maxSpeed = 0;
			this.group = 0;
			this.zeroSixty = 0.0;
			this.cost = 0;
			this.unitsSold = 0;
			this.revenue = 0;
			this.profit = 0;
			this.tradePrice = 0;
		}

		public Car (String name, String model, int wheelDrive, int horsePower, int maxSpeed, int group, double zeroSixty, int cost, int unitsSold, int tradePrice) {
		this.name = name;
		this.model = model;
		this.wheelDrive = wheelDrive;
		this.horsePower = horsePower;
		this.maxSpeed = maxSpeed;
		this.group = group;
		this.zeroSixty = zeroSixty; 
		this.cost = cost;
		this.unitsSold = unitsSold;
		this.tradePrice = tradePrice;
		this.revenue = cost * unitsSold;
		this.profit = (tradePrice*unitsSold) - (cost*unitsSold);
		
	
		}
			
		public void getInfo() {
			System.out.println("This is a "+name+ " " +model+".");
			System.out.println("It has "+wheelDrive+ " wheel drive.");
			System.out.println("Its horsepower is "+horsePower+ "bhp.");
			System.out.println("This car has a max speed of "+maxSpeed+ "Km/h.");
			System.out.println("It is classsed as a Group "+group+ " car!");
			System.out.println("This particular model can go 0 - 60Km/h in: "+zeroSixty+ "s.");
			System.out.println("This model costs: "+ cost+" euros.");
			System.out.println("We've sold "+ unitsSold + " units of this car.");
			System.out.println("Overall revenue assosiated with this model totals " + getRevenue() +".");
			System.out.println("Total profit from this vehicle is "+ getProfit());
		}
		public void startUp() {
			System.out.println("Engine starting...");
		}
		public void fullRev() {
			System.out.println("Braappppp brappp brappp!!!");
		}
		public void powerDown() {
			System.out.println("Systems powering down...");
		}
		public void setSpeed(int maxSpeed) {
			this.maxSpeed = maxSpeed;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getSpeed() {
			return maxSpeed;
		}
		public void setGroup(int group) {
			this.group = group;
		}
		public int getGroup() {
			return group;
		}
		public void setZeroSixty(double x) {
			this.zeroSixty = x;
		}
		public double getZeroSixty() {
			return zeroSixty;
		}
		public int getCost() {
			return cost;
		}
		public int getUnits() {
			return unitsSold;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public int getRevenue() {
			return  (unitsSold * cost);
		}
		public int getProfit() {
			return  ((cost - tradePrice )*unitsSold);
		}
		public String toString() {
			return "Name: "+ name+ ", Model: "+ model+ ", Group: " + group+ ", Wheeldrive: "+ wheelDrive +", Horsepower: "+ horsePower + "bpm, "+ " Max Speed: "+ maxSpeed+ "Km/h.";
		}
		
}