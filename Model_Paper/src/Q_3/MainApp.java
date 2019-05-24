package Q_3;

public class MainApp {

	public static void main(String[] args){
		try {
			Student s = new Student(1, "Nimal");

			s.input();
			System.out.println("Average: " + s.getAverage());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			e.getStackTrace();
		}

	}

}
