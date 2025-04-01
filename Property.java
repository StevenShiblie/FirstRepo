public class Property {
	private String propertyName = "";
	private String city =  "";
	private String owner = "";
	private double rentalAmount;
	private Plot plot;
	
	public Property() {
		this.propertyName = "";
		this.city = "";
		this.rentalAmount = 0.0;
		this.owner = "";
		this.plot = new Plot();
	}
	
	public Property(String propertyName, String city, double rentalAmount, String owner) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentalAmount = rentalAmount;
		this.owner = owner;
		this.plot = new Plot();
	}
	
	public Property(String propertyName, String city, double rentalAmount, String owner, int x, int y, int width, int depth) {
		this.propertyName = propertyName;
		this.city = city;
		this.owner = owner;
		this.rentalAmount = rentalAmount;
		this.plot = new Plot(x, y, width, depth);
	}
	
	public Property(Property p) {
		this.propertyName = p.propertyName;
		this.city = p.city;
		this.owner = p.owner;
		this.rentalAmount = p.rentalAmount;
		this.plot = new Plot(p.plot);
	}
	
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	
	public String getPropertyName() {
		return propertyName;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setRentalAmount(double rentalAmount) {
		this.rentalAmount = rentalAmount;
	}
	
	public double getRentalAmount() {
		return rentalAmount;
	}
	
	public void setPlot(Plot plot) {
		this.plot = plot;
	}
	
	public Plot getPlot() {
		return plot;
	}
	@Override
	public String toString() {
		return propertyName + "," + city + "," + owner + "," + rentalAmount;
	}
}
