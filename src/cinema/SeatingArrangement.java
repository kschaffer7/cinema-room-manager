package cinema;

import java.util.Scanner;

public class SeatingArrangement {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // User Input
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seatsPerRow = scanner.nextInt();

        // method calls
        seatingArrangement(seatsPerRow, rows);
    }

    // Stage 1
    public static void seatingArrangement(int seatsPerRow, int rows) {
        // Title row
        System.out.println("Cinema:");

        // First theater row
        String[] seatsPerRowInfoArray = new String[seatsPerRow + 1];
        for (int i = 0; i < seatsPerRow + 1; i++) {
            if (i == 0) {
                seatsPerRowInfoArray[i] = " ";
            } else {
                seatsPerRowInfoArray[i] = Integer.toString(i);
            }
            System.out.print(seatsPerRowInfoArray[i] + " ");
        }
        System.out.println();

        // Preceding theater rows
        String[][] rowsArray = new String[rows][seatsPerRow + 1];
        for (int i = 0; i < rowsArray.length; i++) {
            for (int j = 0; j < rowsArray[i].length; j++) {
                if (j == 0) {
                    rowsArray[i][j] = Integer.toString(i + 1);
                } else {
                    rowsArray[i][j] = "S";
                }
                System.out.print(rowsArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
