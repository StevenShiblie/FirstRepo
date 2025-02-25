class Patient{
	private String fN;
	private String mN;
	private String lN;
	private String sA;
	private String c;
	private String s;
	private String z;
	private String pN;
	private String eCFN;
	private String eCPN;
	
	//No arg constructor
	public Patient()
	{
		this.fN = "";
		this.mN = "";
		this.lN = "";
		this.sA = "";
		this.c = "";
		this.s = "";
		this.z = "";
		this.pN = "";
		this.eCFN = "";
		this.eCPN = "";
	}
	
	//Parameterized Constructor for Name
	public Patient(String fN, String mN, String lN)
	{
		this.fN = fN;
		this.mN = mN;
		this.lN = lN;
	}
	
	//Parameterized Constructor for Patient Attributes
	public Patient(String sA, String c, String s, String z, String pN, String eCFN, String eCPN)
	{
		this.sA = sA;
		this.c = c;
		this.s = s;
		this.z = z;
		this.pN = pN;
		this.eCFN = eCFN;
		this.eCPN = eCPN;
	}
	
	//Parameterized Constructor for everything so toString runs easier
	public Patient(String fN, String mN, String lN, String sA, String c, String s, String z, String pN, String eCFN, String eCPN)
	{
		this.fN = fN;
		this.mN = mN;
		this.lN = lN;
		this.sA = sA;
		this.c = c;
		this.s = s;
		this.z = z;
		this.pN = pN;
		this.eCFN = eCFN;
		this.eCPN = eCPN;
	}
	
	//Accessor methods
	public String getFirstName()
	{
		return fN;
	}
	
	public String getMiddleName()
	{
		return mN;
	}
	
	public String getLastName()
	{
		return lN;
	}
	
	public String getStreetAddress()
	{
		return sA;
	}
	
	public String getCity()
	{
		return c;
	}
	
	public String getState()
	{
		return s;
	}
	
	public String getZipcode()
	{
		return z;
	}
	
	public String getPhoneNumber()
	{
		return pN;
	}
	
	public String getEmergencyContactFullName()
	{
		return eCFN;
	}
	
	public String getEmergencyContactPhoneNumber()
	{
		return eCPN;
	}
	
	
	public String buildFullName()
	{
		return fN + " " + mN + " " + lN;
	}
	
	public String buildAddress()
	{
		return sA + " " + c + " " + s + " " + z;
	}
	
	public String buildEmergencyContact() 
	{
		return eCFN + " " + eCPN;
	}
	
	@Override
	public String toString(){
		return "Patient info: \nName: " + buildFullName() + "\nAddress: " + buildAddress() + "Phone Number: " + pN + "\nEmergency Contact: " + buildEmergencyContact();
	}
}
