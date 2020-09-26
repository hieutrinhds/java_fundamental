public class GradeBook {
    private String courseName; // name of course this GradeBook represents
    private int[] grades; // array of student grades

    // constructor
    public GradeBook(String courseName, int[] grades) {
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

    // perform various operation on the data
    public void processGrades() {
        // output grades array
        outputGrades();

        // call methods getMinimum and getMaximum
        System.out.printf("Lowest grade is %d%nHighest grade is %d%n",
                getMinimum(), getMaximum());

        // call outputBarChart to print grade distribution chart
        outputBarChart();
    }

    // find minimum grade
    public int getMinimum() {
        int lowGrade = grades[0]; // initial lowest as grades[0]

        // loop through grades array
        for (int grade : grades) {
            if (grade < lowGrade) // if grade lower than lowGrade, assign it to  lowGrade
                lowGrade = grade; // new lowest grade
        }
        return lowGrade;
    }

    // find maximum grade
    public int getMaximum() {
        int highGrade = grades[0]; // initial lowest as grades[0]

        // loop through grades array
        for (int grade : grades) {
            if (grade < highGrade) // if grade lower than highGrade, assign it to  highGrade
                highGrade = grade; // new lowest grade
        }
        return highGrade;
    }

    // determine average grade for test
    public double getAverage() {
        int total = 0;

        // sum grades for one student
        for (int grade : grades)
            total += grade;

        // return average of grade
        return (double) total / grades.length;
    }

    // output bar chart displaying grade distribution
    public void outputBarChart() {
        System.out.println("Grade distribution:");

        // stores frequency of grades in each range of 10 grades
        int[] frequency = new int[11];

        // for each grade, increment the appropriate frequency
        for (int grade : grades)
            ++frequency[grade/10];

        // for each grade frequency, print bar in chart
        for (int count = 0; count < frequency.length; count++) {
            // output bar label ("00-09: ", ..., "90-99: ", "100: ")
            if (count == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ",
                        count * 10, count * 10 + 9);
            // print bar of asterisks
            for (int stars = 0; stars < frequency[count]; stars++)
                System.out.println("*");

            System.out.println();
        }
    }

    // output the contents of grades array
    public void outputGrades() {
        System.out.printf("The grades are:%n%n");

        // output each student's grade
        for (int student = 0; student < grades.length; student++)
            System.out.printf("Student %2d: 3%d%n",
                    student + 1, grades[student]);
    }
} // end class GradeBook
