package Q_1;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		
		ArrayList<Item> al = new ArrayList<>();
		Book b1 = new Book(001, "GOT1", 800, "Sarasavi", "Sci-Fi", 450);
		Book b2 = new Book(002, "GOT2", 800, "Sarasavi", "Sci-Fi", 450);
		
		al.add(b1);
		al.add(b2);
		
		Car c1 = new Car(003, "Nissan", 4000000, "Bluebird", "sedan");
		Car c2 = new Car(004, "Toyota", 14000000, "Fortuner", "SUV");
		
		al.add(c1);
		al.add(c2);
		
		for (Item val : al) {
			
			val.display();
		}
		
		
		
	}

}
