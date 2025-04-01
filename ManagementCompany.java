public class ManagementCompany {
	private String mgmtCompanyName;
	private String taxId;
	private double mgmtFee;
	public static final int MAX_PROPERTY = 5, MGMT_WIDTH = 10, MGMT_DEPTH = 10;
	private Property[] properties;
	private Plot plot;
	private int numberOfProperties;
	
	public ManagementCompany() {
		this.mgmtCompanyName = "";
		this.taxId = "";
		this.mgmtFee = 0;
		this.properties = new Property[MAX_PROPERTY];
		this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		this.numberOfProperties = 0;
	}
	
	public ManagementCompany(String mgmtCompanyName, String taxId, double mgmtFee) {
		this.mgmtCompanyName = mgmtCompanyName;
		this.taxId = taxId;
		this.mgmtFee = mgmtFee;
		this.properties = new Property[MAX_PROPERTY];
		this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		this.numberOfProperties = 0;
	}
	
	public void managementCompany(String mgmtCompanyName, String taxId, double mgmtFee, int x, int y, int width, int depth) {
		this.mgmtCompanyName = mgmtCompanyName;
		this.taxId = taxId;
		this.mgmtFee = mgmtFee;
		this.properties = new Property[MAX_PROPERTY];
		this.plot = new Plot(x, y, width, depth);
		this.numberOfProperties = 0;
	}
	
	public void setMgmtCompanyName(String mgmtCompanyName) {
		this.mgmtCompanyName = mgmtCompanyName;
	}
	
	public String getMgmtCompanyName() {
		return mgmtCompanyName;
	}
	
	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}
	
	public String getTaxId() {
		return taxId;
	}
	
	public void setMgmtFee(double mgmtFee) {
		this.mgmtFee = mgmtFee;
	}
	
	public double getMgmtFee() {
		return mgmtFee;
	}
	
	public void setProperties(Property[] properties) {
		this.properties = properties;
	}
	
	public Property[] getProperties() {
		return properties;
	}
	
	public void setPlot(Plot plot) {
		this.plot = plot;
	}
	
	public Plot getPlot() {
		return plot;
	}
	
	public void setNumberOfProperties(int numberOfProperties) {
		this.numberOfProperties = numberOfProperties;
	}
	
	public int getNumberOfProperties() {
		return numberOfProperties;
	}
	
	public int addProperty(Property property) {
		if(numberOfProperties >= MAX_PROPERTY) {
			return -1;
		}
		if(property == null) {
			return -2;
		}
		if(!plot.encompasses(property.getPlot())) {
			return -3;
		}
		for(int i = 0; i < numberOfProperties; i++) {
			if(properties[i].getPlot().overlaps(property.getPlot())) {
				return -4;
			}
		}
		properties[numberOfProperties] = property;
		return numberOfProperties++;
	}
	
	public double getTotalRent() {
		double totalRent = 0;
		for(int i = 0; i < numberOfProperties; i++) {
			totalRent += properties[i].getRentalAmount();
		}
		return totalRent;
	}
	
	public Property getHighestRentProperty(){
		if(numberOfProperties == 0)
			return null;
		
		Property highest = properties[0];
		for(int i = 1; i < numberOfProperties; i++) {
			if(properties[i].getRentalAmount() > highest.getRentalAmount()) {
				highest = properties[i];
			}
		}
		return highest;
	}
	
	public void removeLastProperty() {
		if(numberOfProperties > 0) {
			properties[numberOfProperties - 1] = null;
			numberOfProperties--;
		}
	}
	
	public boolean isPropertiesFull() {
		return numberOfProperties == MAX_PROPERTY;
	}
	
	public int getPropertiesCount() {
		return numberOfProperties;
	}
	
	public boolean isManagementFeeValid() {
		return mgmtFee >= 0 && mgmtFee <= 100;
	}
	
	@Override
	public String toString() {
		String result= "List of the properties for " + mgmtCompanyName + ", taxID: " + taxId + "\n______________________________________________________\n";
		for(int i = 0; i < numberOfProperties; i++) {
			result += properties[i].toString() + "\n";
		}
		result += "______________________________________________________\n\nTotal management Fee: " + (getTotalRent() * mgmtFee / 100);
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
