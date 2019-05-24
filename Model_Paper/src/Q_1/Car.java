package Q_1;

public class Car extends Item {

	private String model;
	private String type;

	public Car(int itemNo, String description, double unitPrice, String model, String type) {
		super(itemNo, description, unitPrice);
		this.model = model;
		this.type = type;
	}

	public void display() {
		super.display();
		
		System.out.println("Model : "+ model);
		System.out.println("Type : "+ type);
		System.out.println("----------------------------");
	}
}
