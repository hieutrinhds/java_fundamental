public class Increment {
    public static void main(String[] args) {
        // demonstrate post-fix increment operator
        int c = 5;
        System.out.printf("c before post-increment: %d%n", c);
        System.out.printf("     post-incrementing: %d%n", c++);
        System.out.printf("c after post-increment: %d%n", c);

        System.out.println(); // skip a line

        // demonstrate prefix increment operator

        c = 5;
        System.out.printf("c before pre-increment: %d%n", c);
        System.out.printf("     pre-incrementing: %d%n", ++c);
        System.out.printf("c after pre-increment: %d%n", c);
    }
} //end class Increment
