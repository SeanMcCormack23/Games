package se;

public class Supercar extends Car{
	
	int noOfSeats;
	
	public Supercar() {
		super();
		this.noOfSeats = 0;
		
	}
	public Supercar(String name, String model, int wheelDrive, int horsePower,int maxSpeed, int group, double zeroSixty,int cost, int unitsSold, int tradePrice, int noOfSeats) {
		
		super(name, model, wheelDrive,horsePower,maxSpeed, group, zeroSixty,cost, unitsSold, tradePrice);
		
		this.noOfSeats = noOfSeats;
		
	}
	public int getNoOfSeats() {
		return this.noOfSeats;
		
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	
	public String toString () { 
		return super.toString() + " This car has only "+ this.noOfSeats + " seats.";
		
		}
}

