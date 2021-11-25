package AlgorithmChallenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class MLRResult {
	static int startingRow = 0;
	static int startingColumn = 0;
	static int leftOverRight = 0;
	static int leftOverLeft = 0;

	// For up and left movement
	static int osr = 0;
	static int osc = 0;

	public static void downAndUpMovement(int matrix[][], int numOfRows, int numOfColumns) {
		leftOverRight = matrix[numOfRows - 1 - startingRow][startingColumn];
		leftOverLeft = matrix[osr][numOfColumns - 1 - osc];

		for (int i = ((numOfRows - 1) - startingRow); i > startingRow; i--) {
			// For downward movement
			int replacement = matrix[i - 1][startingColumn];
			matrix[i][startingColumn]  = replacement;

			// For upward movement
			replacement = matrix[numOfRows - i][numOfColumns - 1 - osc];
			matrix[numOfRows - 1 - i][numOfColumns - 1 - osc] = replacement;

		}

		startingRow = numOfRows - 1 - startingRow;
		startingColumn += 1;

	}

	public static void rightandLeftMovement(int matrix[][], int numOfColumns) {
		for (int i = ((numOfColumns - 1) - osc); i > startingColumn; i--) {
			// For right movement
			int replacement = matrix[startingRow][i - 1];
			matrix[startingRow][i] = replacement;

			// For left movement
			replacement = matrix[osr][numOfColumns - i];
			matrix[osr][numOfColumns - 1 - i] = replacement;

		}

		// Setting starting row with received leftover
		matrix[startingRow][startingColumn] = leftOverRight;
		matrix[osr][numOfColumns - 2 - osc] = leftOverLeft;

		// Changing my starting row and my starting column
		startingRow -= 1;
		startingColumn = (numOfColumns - 1) - osc;

	}

	public static void matrixRotation(int matrix[][], int numOfRotations, int numOfRows, int numOfColumns) {

		// Determining least among rows and columns for number of sqaures

		int numOfSquares = Math.min(numOfRows, numOfColumns) / 2;

		for (int n = 0; n < numOfRotations; n++) {
			for (int i = 0; i < numOfSquares; i++) {
				startingRow = i;
				startingColumn = i;
				osr = i;
				osc = i;

				downAndUpMovement(matrix, numOfRows, numOfColumns);
				rightandLeftMovement(matrix, numOfColumns);

			}
		}

		for (int i = 0; i < numOfRows; i++) {
			for (int j = 0; j < numOfColumns; j++) {
				System.out.print(matrix[i][j] + " ");
			}

			System.out.println();
		}
	}
}

public class MatrixLayerRotation {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Number of rows: ");
		int numberOfRows = Integer.parseInt(input.nextLine());
		System.out.print("Number of columns: ");
		int numberOfColumns = Integer.parseInt(input.nextLine());
		System.out.print("Number of rotations: ");
		int numberOfRotations = Integer.parseInt(input.nextLine());

		int matrix[][] = new int[numberOfRows][numberOfColumns];

		for(int i = 0; i < numberOfRows; i++) {
			for(int j = 0; j < numberOfColumns; j++) {
				matrix[i][j] = input.nextInt();
			}
		}

		MLRResult.matrixRotation(matrix, numberOfRotations,numberOfRows,numberOfColumns);
		
		
	}
}
