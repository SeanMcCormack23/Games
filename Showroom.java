package se;

public class Showroom {

	public static void main(String[] args) {
		
		Car ferrari = new Car ();
		Car bmw = new Car();
		Car mercedes = new Car();
		Supercar lambo = new Supercar("Lamborghini","Huracan",2,20000,280,2,2.8,250000,2,200000,2);
		
		//Lamborghini Calls
		System.out.println(lambo.getSpeed());
		System.out.println("This car has " +lambo.getNoOfSeats() + " seats.");
		lambo.setGroup(3);
		System.out.println(lambo.getGroup());
		lambo.setSpeed(275);
		System.out.println(lambo.toString());
		//Merc Info
		mercedes.setName("Brabus Jeep"); // Not sure if more efficient or not 
		mercedes.model = "GTr AMG";
		mercedes.wheelDrive = 2;
		mercedes.group = 2;
		mercedes.horsePower = 585;
		mercedes.maxSpeed = 197;
		mercedes.zeroSixty = 3.6;
		mercedes.unitsSold = 1500;
		mercedes.cost = 100000;
		mercedes.tradePrice = 80000;
		//Ferrari Info
		ferrari.name = "Ferrari";
		ferrari.model = "F450";
		ferrari.wheelDrive = 4;
		ferrari.group = 3;
		ferrari.horsePower = 250;
		ferrari.maxSpeed = 240;
		ferrari.zeroSixty = 3.0;
		ferrari.unitsSold = 200;
		ferrari.cost = 200000;
		ferrari.tradePrice = 170000;
		//BMW Info
		bmw.name = "BMW";
		bmw.model = "350i";
		bmw.wheelDrive = 2;
		bmw.group = 0;
		bmw.horsePower = 320;
		bmw.maxSpeed = 180;
		bmw.zeroSixty = 4.2;
		bmw.unitsSold = 3000;
		bmw.cost = 50000;
		bmw.tradePrice = 40000;
		
		System.out.println("---------");
		
		ferrari.getInfo();
		
		System.out.println("---------");
		
		bmw.getInfo();
		
		System.out.println("---------");

		mercedes.getInfo();
				
		System.out.println("---------");
		
		
		int fastest;
		if (mercedes.getSpeed() > bmw.getSpeed() && mercedes.getSpeed() > ferrari.getSpeed() && mercedes.getSpeed()> lambo.getSpeed()) {
			fastest = mercedes.getSpeed();
			System.out.println("The fastest car in our showroom goes "+ fastest+ " Km/h. It happens to be a "+mercedes.getModel()+".");
			
		}else if (ferrari.getSpeed() > mercedes.getSpeed() && ferrari.getSpeed() > bmw.getSpeed() && ferrari.getSpeed()> lambo.getSpeed()) {
			fastest = ferrari.getSpeed();
			System.out.println("The fastest car in our showroom goes "+ fastest+ " Km/h. It happens to be a "+ ferrari.name+ " "+ferrari.getModel()+".");
		}else if (bmw.getSpeed()> mercedes.getSpeed() && bmw.getSpeed()> ferrari.getSpeed() && bmw.getSpeed()> lambo.getSpeed()) {
			fastest = bmw.getSpeed();
			System.out.println("The fastest car in our showroom goes "+ fastest+ "Km/h. It happens to be a "+bmw.name+ " " + bmw.getModel()+ ".");
		}else if (lambo.getSpeed()> mercedes.getSpeed() && lambo.getSpeed()> ferrari.getSpeed() && lambo.getSpeed()> bmw.getSpeed()) {
			fastest = lambo.getSpeed();
		System.out.println("The fastest car in our showroom right now is the "+ lambo.getName()+ " "+ lambo.getModel()+ " its top speed is "+ lambo.getSpeed() + ".");
		}
		String slowest;
		if (mercedes.getSpeed()<ferrari.getSpeed() && mercedes.getSpeed() < bmw.getSpeed()) {
			slowest = mercedes.getModel();
			System.out.println("The slowest car in the garage at the moment is the "+mercedes.name+", "+ slowest+ ". It can reach a top speed of "+mercedes.getSpeed()+ " Km/h.");
		}else if(ferrari.getSpeed()<mercedes.getSpeed() && ferrari.getSpeed() < bmw.getSpeed()) {
			slowest = ferrari.getModel();
			System.out.println("The slowest car in the garage at the moment is the "+ferrari.name+", "+ slowest+ ". It can reach a top speed of "+ ferrari.getSpeed()+ " Km/h.");
		} else if (bmw.getSpeed()< mercedes.getSpeed() && bmw.getSpeed()< ferrari.getSpeed()) {
			slowest = bmw.getModel();
			System.out.println("The slowest car in our garage at the moment is the "+bmw.name+ " "+slowest+ ". It can reach a top speed of "+ bmw.getSpeed() +" Km/h.");
		}
		System.out.println(lambo.toString());
	}
}

