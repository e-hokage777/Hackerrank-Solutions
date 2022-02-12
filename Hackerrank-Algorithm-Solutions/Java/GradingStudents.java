import java.util.*;


public class GradingStudents{

	public static List<Integer> gradingStudents(List<Integer> grades){
		List<Integer> newGrades = new ArrayList<Integer>();
		int diff = 0;
		int grade = 0;
		for(int n: grades){

			grade = n;
			if(grade >= 38){
			while((grade+(++diff))%5 != 0);

			if(diff < 3){
				grade = grade + diff;
			}

		}
		diff = 0;
		newGrades.add(grade);
	}

		return newGrades;



	}

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		List<Integer> grades = new ArrayList<>();
		int numOfGrades = 0;
		int grade= 0;

		System.out.print("Number of Grades: ");
		numOfGrades = input.nextInt();

		while(numOfGrades-- > 0){
			System.out.print("Grade: ");
			grade = input.nextInt();
			grades.add(grade);
		}

		for(int n : gradingStudents(grades))
			System.out.println(n);
	}
}