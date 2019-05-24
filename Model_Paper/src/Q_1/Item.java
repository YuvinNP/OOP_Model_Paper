package Q_1;

public abstract class Item {
	
	private int itemNo;
	private String description;
	private double unitPrice;
	
	public Item(int itemNo, String description, double unitPrice) {
		
		this.itemNo = itemNo;
		this.description = description;
		this.unitPrice = unitPrice;
	}
	
	public void display() {
		
		System.out.println("Item No : "+itemNo);
		System.out.println("Description : "+description);
		System.out.println("Unit Price : "+unitPrice);
		
	}
	
	

}
