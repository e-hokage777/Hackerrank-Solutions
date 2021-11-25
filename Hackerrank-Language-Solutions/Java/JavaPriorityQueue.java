package Challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Stud implements Comparable<Stud>{
	private Integer id;
	private String name;
	private Double cgpa;

	public Stud(int id, String name, double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public double getCgpa() {
		return this.cgpa;
	}
	
	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public int compareTo(Stud student) {
		//Sorting by name should be case sensitive
		int cgpaCompare = this.cgpa.compareTo(student.cgpa);
		int nameCompare = this.name.compareTo(student.name);
		int idCompare = this.id.compareTo(student.id)
				;
		if(cgpaCompare != 0) {
			return -cgpaCompare;
		}
		else if(nameCompare != 0) {
			return nameCompare;
		}
		else {
			return idCompare;
		}
	}
}

class Priorities {
	private  List<Stud> students;
	
	public Priorities() {
		students = new ArrayList<Stud>();
	}

	List<Stud> getStuds(List<String> events) {
		for(String event : events) {
			if(event.startsWith("ENTER")) {
				String det[] = event.split(" ");
				String studentName =det[1].trim();
				int studentId = Integer.parseInt(det[3].trim());
				double studentCgpa = Double.parseDouble(det[2].trim());
				Stud student = new Stud(studentId, studentName, studentCgpa);
				this.students.add(student);
				Collections.sort(students);
			}
			else if (students.isEmpty() == false) {
				
				students.remove(0);
			}
		}
		return this.students;
	}
}

public class JavaPriorityQueue {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> events = new ArrayList<String>();
		Priorities priorities = new Priorities();
		
		System.out.print("Number of events: ");
		int numOfEvents = Integer.parseInt(input.nextLine());
		
		while(numOfEvents-- > 0) {
			System.out.print("Event: ");
			String event = input.nextLine().replaceAll("\\b(\\s)(?:\\1)+\\b"," ");
			events.add(event);
		}
		
		List<Stud> students = priorities.getStuds(events);
		
		if(students.isEmpty()) {
			System.out.println("EMPTY");
		}
		else {
			for(Stud s : students) {
				System.out.println(s);
			}
		}
		
		
	}

}
