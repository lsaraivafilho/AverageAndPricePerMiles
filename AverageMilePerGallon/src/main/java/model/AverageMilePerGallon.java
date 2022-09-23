package model;

public class AverageMilePerGallon {
	private int miles;
	private double gallons;
	private double totalMilesPerGallon;
	private int calcMiles;
	private double calcGallons;
	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

	public double getGallons() {
		return gallons;
	}

	public void setGallons(double gallons) {
		this.gallons = gallons;
	}

	public double getTotalMilesPerGalon() {
		return totalMilesPerGallon;
	}

	public void setTotalMilesPerGalon(double totalMilesPerGallon) {
		this.totalMilesPerGallon = totalMilesPerGallon;
		
	}

	public int getCalcMiles() {
		return calcMiles;
	}

	public void setCalcMiles(int calcMiles) {
		this.calcMiles = calcMiles;
	}

	public double getCalcGallons() {
		return calcGallons;
	}

	public void setCalcGallons(double calcGallons) {
		this.calcGallons = calcGallons;
	}

	public AverageMilePerGallon(){
		super();		
		// TODO Auto-generated constructor stub
	}
	
	public AverageMilePerGallon(int calcMiles, double calcGallons){
		this.miles = calcMiles;
		this.gallons = calcGallons;
		totalMilesPerGallon = Double.valueOf(miles).doubleValue() / gallons;
		// TODO Auto-generated constructor stub
	}
	public AverageMilePerGallon(double totalMilesPerGallon){
		super();	
		this.totalMilesPerGallon = totalMilesPerGallon;
		setTotalMilesPerGalon(totalMilesPerGallon);				
		// TODO Auto-generated constructor stub
	}
	
	@Override	
	public String toString() {
		return "The Average Miles Per Galon is: " + totalMilesPerGallon;
	}
}
