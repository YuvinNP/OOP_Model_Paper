package Q_3;

import java.util.Scanner;

public class Student {

	private int id;
	private String name;
	private int noOfSubjects;
	private float marks[];

	public Student(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public float inputMarks(int index) throws MarksException {

		Scanner scn = new Scanner(System.in);
		float mark;

				System.out.println("Enter Marks " + (index + 1) + ": ");
			mark = scn.nextInt();

			if (mark < 0 || mark > 100) {

				throw new MarksException(mark);
			}

			else {
				marks[index] = mark;

			}
		
		return marks[index];

	}

	public void input() throws Exception {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter no of subjects: ");
		this.noOfSubjects = scn.nextInt();

	
			if (noOfSubjects <= 0) {
				throw new MarksException(noOfSubjects);
			}

			else {

				marks = new float[noOfSubjects];
				for (int i = 0; i < marks.length; i++) {

					inputMarks(i);
				}

			}
		
	}

	public float getAverage() {
		float total = 0, avg = 0;

		try {
			for (int i = 0; i < marks.length; i++) {

				total = total + marks[i];
			}

			avg = total / marks.length;

		} catch (ArithmeticException e) {
			System.out.println(e);
		}

		return avg;
	}

}
