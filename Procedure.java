public class Procedure {
	private String procedureName;
	private String procedureDate;
	private String procedurePractitioner;
	private Double procedureCost;
	
	//No-arg constructor
	public Procedure()
	{
		this.procedureName = "";
		this.procedureDate = "";
		this.procedurePractitioner = "";
		this.procedureCost = null;
	}
	
	//Parameterized constructor for name and date
	public Procedure(String procedureName, String procedureDate)
	{
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
	}
	
	//Parameterized constructor for all attributes
	public Procedure(String procedurePractitioner, Double procedureCost)
	{
		this.procedurePractitioner = procedurePractitioner;
		this.procedureCost = procedureCost;
	}
	
	//Parameterized constructor for everything
	public Procedure(String procedureName, String procedureDate, String procedurePractitioner, Double procedureCost)
	{
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
		this.procedurePractitioner = procedurePractitioner;
		this.procedureCost = procedureCost;
	}
	
	//Accessor methods
	public String getProcedureName()
	{
		return procedureName;
	}
	
	public String getProcedureDate()
	{
		return procedureDate;
	}
	
	public String getProcedurePractitioner()
	{
		return procedurePractitioner;
	}
	
	public Double getProcedureCost()
	{
		return procedureCost;
	}
	
	//To-string
	@Override
	public String toString()
	{
		return "Procedure: " + procedureName + "\n\tProcedure Date: " + procedureDate + "\n\tPractitioner: " + procedurePractitioner + "\n\tCharge: " + procedureCost;
	}
}
