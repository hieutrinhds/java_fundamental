import java.util.stream.IntStream;

public class SumArray {
    public static void main(String[] args) {
        int[] array = {87, 68, 94, 83, 78, 85, 91, 76, 87};
        int total = 0;

        // add each element's value to total
        for (int counter = 0; counter < array.length; counter++)
            total += array[counter];

        int total_stream = fasterSum(array);

        System.out.printf("Total of array elements: %d%n", total);
        System.out.printf("Total of array elements use stream: %d%n", total_stream);

    }

    // equivalent method
    public static int fasterSum(int[] array) {
        int total = IntStream.of(array).sum();
        return total;
    }
} // end class SumArray
