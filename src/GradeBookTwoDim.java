public class GradeBookTwoDim {
    private String courseName; // name of course this grade book respresent
    private int[][] grades; // two dimensional array of student grades

    // two-argument constructor initializes courseName and grades array
    public GradeBookTwoDim(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    // method to set the course name
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // method to retrieve the course name
    public String getCourseName() {
        return courseName;
    }

    // perform various operations on the data
    public void processGrades() {
        // output grades array
        outputGrades();

        // call methods getMinimum and getMaximum
        System.out.printf("%n%s %d%n%s %d%n%n",
                "Lowest grade in the grade book is", getMinimum(),
                "Highest grade in the grade book is", getMaximum());

        // output grade distribution chart of all grades on all test
        outputBarChart();
    }

    // find minimum grade
    public int getMinimum() {
        // assume first element of grades arry is smallest
        int lowGrade = grades[0][0];

        // loop through rows of grades array
        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                if (grade < lowGrade)
                    lowGrade = grade;
            }
        }
        return lowGrade;
    }

    // find maximum grade
    public int getMaximum() {
        // assume first element of grades arry is smallest
        int highGrade = grades[0][0];

        // loop through rows of grades array
        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                if (grade < highGrade)
                    highGrade = grade;
            }
        }
        return highGrade;
    }

    // determine average grade for particular student
    public double getAverage(int[] setOfGrades) {
        int total = 0;

        // sum grades for one student
        for (int grade : setOfGrades)
            total += grade;

        return (double) total / setOfGrades.length;
    }

    // output bar chart displaying overall grade distribution
    public void outputBarChart() {
        System.out.println("Overall grade distribution:");

        // stores frequency of grades in each range of 10 grades
        int[] frequency = new int[11];

        // for each grade in GradeBook; increment the appropriate frequency
        for (int[] studentGrades : grades) {
            for (int grade : studentGrades)
                ++frequency[grade / 10];
        }
        for (int count = 0; count < frequency.length; count++) {
            // output bar label
            if (count == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-02d: ", count * 10, count * 10 + 9);

            // print bar of asterisks
            for (int stars = 0; stars < frequency[count]; stars++);
            System.out.print("*");

            System.out.println();
        }
    }
    // output the contents of grades array
    public void outputGrades() {
        System.out.printf("The grades are:%n%n");
        System.out.print("          "); // align column heads

        // create a column heading for each of the tests
        for (int test = 0; test < grades[0].length; test++)
            System.out.printf("Teest %d   ", test + 1);
        System.out.println("Average"); // student average column heading

        // create rows/columns of text representing any array grades
        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d", student + 1);

            for (int test : grades[student]) // output student's grades
                System.out.printf("%8d", test);

            // call method getAverage to calculate student's average grade;
            // pass row of grades as the argument to getAverage
            double average =  getAverage(grades[student]);
            System.out.printf("%9.2f%n", average);
        }
    }
} // end class GradeBookTwoDim
