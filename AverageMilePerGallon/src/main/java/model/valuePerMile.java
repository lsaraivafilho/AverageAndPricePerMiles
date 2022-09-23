package model;

public class valuePerMile {
	private int miles;
	private double cost;
	private double pricePerGallon;
	private double totalPricePerGallon;
	
	public double getTotalPricePerGallon() {
		return totalPricePerGallon;
	}

	public void setTotalPricePerGallon(double totalPricePerGallon) {
		this.totalPricePerGallon = totalPricePerGallon;
	}

	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

	public double getCost() {
		return cost;
	}	

	public double getPricePerGallon() {
		return pricePerGallon;
	}

	public void setPricePerGallon(double pricePerGallon) {
		this.pricePerGallon = pricePerGallon;
	}

	public valuePerMile(double calcCost,int calcMiles) {
		this.miles = calcMiles;
		this.cost = calcCost;
		totalPricePerGallon = cost / Double.valueOf(miles).doubleValue();
		
		// TODO Auto-generated constructor stub
	}
	public valuePerMile(double totalPricePerGallon) {
		super();
		this.totalPricePerGallon = totalPricePerGallon;
		setTotalPricePerGallon(cost / Double.valueOf(miles).doubleValue());
		// TODO Auto-generated constructor stub
	}
	public void setCost(double cost) {
		this.cost = cost;
		
	}
	
}
