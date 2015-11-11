
public class Invoice implements Payable {

	// PRIVATE VARIABELS +++++++++++++++++++
	
	private final String _partNamber;
	private final String _partDescription;
	private int _quantity;
	private double _pricePerItem;
	
	// CONSTRUCTOR +++++++++++++++++++++++
	
	public Invoice(String partNamber,String partDescription,int quantity,double pricePerItem){
		this._partNamber = partNamber;
		this._partDescription = partDescription;
		if(quantity<0){
			throw new IllegalArgumentException("Quantity should be greater than 0");
		}
		if(pricePerItem<0){
			throw new IllegalArgumentException("price Per Item should be greater than 0");
		}
		this._quantity = quantity;
		this._pricePerItem = pricePerItem;
	}

	
	// PROPERTIES +++++++++++++++++++++++++++
	
	public String getPartNamber() {
		return this._partNamber;
	}

	public String getPartDescription() {
		return this._partDescription;
	}
	public int getQuantity() {
		return this._quantity;
	}

	public void setQuantity(int quantity) {
		if(quantity<0){
			throw new IllegalArgumentException("Quantity should be greater than 0");
		}
		this._quantity = quantity;
	}

	public double getPricePerItem() {
		return this._pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		if(pricePerItem<0){
			throw new IllegalArgumentException("price Per Item should be greater than 0");
		}
		this._pricePerItem = pricePerItem;
	}

	// PUBLIC METHODS ++++++++++++++++++++++++++
	
	public String toString(){
		return String.format("%nPart Numbe: %s%nPart Description: %s%nQuantity: %d%nPrice per Item:$%,.2f", getPartNamber(), getPartDescription(), getQuantity(), getPricePerItem());
	}
	
	public double getPaymentAmount(){
		return getQuantity()* getPricePerItem();
	}
}
