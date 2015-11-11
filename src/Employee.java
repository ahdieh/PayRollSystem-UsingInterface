
public abstract class Employee implements Payable {

	//PRIVATE VARIABLES +++++++++++++++++
	private final String _firstName;
	private final String _lastName;
	private final String _SSN;
	
	// CONSTRUCTOR ++++++++++++++++++++++
	
	public Employee(String firstName, String lastName, String SSN){
		this._firstName = firstName;
		this._lastName = lastName;
		this._SSN = SSN;
	}
	
		
	//PROPERTIES +++++++++++++++++++++
	
	public String getFirstName(){
		return this._firstName;
	}
	
	public String getLastName(){
		return this._lastName;
	}
	
	public String getSSN(){
		return this._SSN;
	}
	
	// PUBLIC METHODS
	
	public String toString(){
		return String.format("%s %s with the social security number: %s", getFirstName(),getLastName(),getSSN());
	}

	
}


