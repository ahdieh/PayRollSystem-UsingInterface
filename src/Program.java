
public class Program {

	public static void main(String[] args) {

		Payable[] payable = new Payable[4];

		payable[0] = new Invoice("01234", "seat", 2, 375.00);
		payable[1] = new Invoice("56789", "tire", 4, 79.95);
		payable[2] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
		payable[3] = new SalariedEmployee("Lisa", "Barnes", "888-88-8888", 1200.00);

	
		
		for (Payable currentPayable : payable){
			System.out.printf("%s%npayment due: $%,.2f%n",currentPayable.toString(),currentPayable.getPaymentAmount());
		}
	}

}
