import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        // create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);

        // initialization phase
        int total = 0; // initialize sum of grades entered by users
        int gradeCounter = 1; // initialize # of grade to be entered next

        System.out.print("Enter a grade or -1 to quit: ");
        int grade = input.nextInt();

        // processing phase uses counter-controlled repetition
        while (grade != -1) {// loop 10 times
            System.out.print("Enter grade or -1 to quit: "); // prompt
            grade = input.nextInt(); // input next grade
            total = total + grade; // add grade to total
            gradeCounter = gradeCounter + 1; // increment counter by 1
        }

        // terminate phase
        // if user entered at least one grad
        if (gradeCounter !=0) {
            double average = (double) total / gradeCounter; // integer division yields integer result

            // display total and average of grades
            System.out.printf("%nTotal of all %d grades entered is %d%n", gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
        }
        else // no grades were entered, so output appropriate message
            System.out.println("No grades were entered");
    } // end main
} // end class ClassAverage
