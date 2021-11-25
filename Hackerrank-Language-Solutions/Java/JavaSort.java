package Challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student>{
	private String firstName;
	private Integer id;
	private Double cgpa;
	
	public Student( int id,String firstName, double cgpa) {
		setFirstName(firstName);
		setId(id);
		setCgpa(cgpa);
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	
	public double getCgpa() {
		return this.cgpa;
	}
	
	public String toString() {
		return this.firstName;
	}

	@Override
	public int compareTo(Student o) {
		int cgpaCompare = this.cgpa.compareTo(o.cgpa);
		int fNameCompare = this.firstName.compareTo(o.firstName);
		int idCompare = this.id.compareTo(o.id);
		
		//Check this method well for the comparison of the Double
		if (cgpaCompare != 0) {
			return -cgpaCompare;
		}
		else if(fNameCompare != 0){
			return fNameCompare;
		}
		else {
			return idCompare;
		}
	}
}

public class JavaSort {
	
	public static void main(String args[]) {
		List<Student> students = new ArrayList<Student>();
		System.out.println("This is a simple program to arrange students based on certain criteria");
		System.out.println("Sorts according to CGPA first, if equal, moves to first names, if that too is equal, moves to id");
		
		System.out.println("For how many students would you like to make records for?");
		Scanner input = new Scanner(System.in);
				
		int numOfStudents = Integer.parseInt(input.nextLine());
		
		System.out.println("Enter the students's cgpas, first names and ids respectively");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i < numOfStudents; i++) {
			try {
				String sInfo[] = reader.readLine().replaceAll("\\s+$", "").split(" ");
				
				int id  = Integer.parseInt(sInfo[0]);
				String fName = sInfo[1];
				double cgpa = Double.parseDouble(sInfo[2]);
				
				Student student = new Student(id, fName, cgpa);
				
				students.add(student);
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		Collections.sort(students);
		
		for(Student student : students) {
			System.out.println(student);
		}
		
	}
	
}
