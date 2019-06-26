import java.util.Scanner;
public class PrintGrades {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter exam score: ");
        int examScore = Integer.parseInt(reader.nextLine());
        while (examScore != 0) {

            if (examScore <= 100 && examScore >= 97) {
                System.out.println("A +");
            } else if (examScore <= 96 && examScore >= 94) {
                System.out.println("A ");
            } else if (examScore <= 93 && examScore >= 90) {
                System.out.println("A -");
            } else if (examScore <= 89 && examScore >= 87) {
                System.out.println("B +");
            } else if (examScore <= 86 && examScore >= 84) {
                System.out.println("B ");
            } else if (examScore <= 83 && examScore >= 80) {
                System.out.println("B -");
            } else if (examScore <= 79 && examScore >= 77) {
                System.out.println("C +");
            } else if (examScore <= 76 && examScore >= 74) {
                System.out.println("C ");
            } else if (examScore <= 73 && examScore >= 70) {
                System.out.println("C -");
            } else if (examScore <= 69 && examScore >= 60) {
                System.out.println("D ");
            } else {
                System.out.println("Go back to School if you get below 60! ");
            }
            System.out.println("Do you want to enter another score (Yes/No)? ");
            String anScore = reader.nextLine();
            if (anScore.equalsIgnoreCase("yes")) {
                System.out.println("Enter another score: ");
                examScore = Integer.parseInt(reader.nextLine());
            } else if (anScore.equalsIgnoreCase("no")) {
                System.out.println("Goodbye! ");

            }

        }
    }
}



