
public class SalariedEmployee extends Employee implements Payable {

	//PRIVATE VARIABELS +++++++++++++++++++++++

		private double _weeklySalary;
		
    // CONSTRUCTOR ++++++++++++++++++++++
		
		public SalariedEmployee(String firstName, String lastName, String SSN, double weeklySalary){
			super(firstName, lastName,SSN);
			if (weeklySalary<0){
				throw new IllegalArgumentException("The weekly salary must be greater than 0");
			}
		this._weeklySalary = weeklySalary;
			
			}

			
		// PROPERTIES ++++++++++++++++++
		
		public double getWeeklySalary() {
			return this._weeklySalary;
		}

		public void setWeeklySalary(double weeklySalary) {
			if (this._weeklySalary<0){
				throw new IllegalArgumentException("The weekly salary must be greater than 0");
			}
			this._weeklySalary = weeklySalary;
		}
		
	// PUBLIC METHODS +++++++++++++++++
		
		public String toString(){
			return String.format("%n%s: %s%nwith the weekly salary: $%,02f", "Salaried employee", super.toString(),getWeeklySalary());
		}
		
		public double getPaymentAmount(){
			return getWeeklySalary();
		}
}

	

