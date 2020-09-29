import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {
        // create a new ArrayList of Strings with an initial capacity of 10
        ArrayList<String> items = new ArrayList<String>();
        items.add("red"); // append an item to the list
        items.add(0,"yellow"); // insert "yellow" at index 0

        // header
        System.out.printf("Display list contents with counter-controlled loop:");

        // display the colors in the list
        for (int i=0; i < items.size(); i++)
            System.out.printf(" %s", items.get(i));

        // display colors using enhanced for in the display method
        display(items, "%nDisplay list contents with enhanced for statement:");

        items.add("green");
        items.add("yellow");
        display(items, "List with two new elements:");

        items.remove("Yellow"); // remove the first "yellow"
        display(items, "Remove second list element (green)");

        items.remove(1); // remove item at index 1
        display(items, "Remove second list element (green)");

        // check if a value is in the List
        System.out.printf("\"red\" is %sin the list%n", items.contains("red") ? "": "not ");

        // display number of elements in the List
        System.out.printf("Size: %s%n", items.size());
    }

    // display the ArrayList's elements on the console
    public static void display(ArrayList<String> items, String header) {
        System.out.printf(header); // display header

        // display each element in items
        for (String item : items)
            System.out.printf(" %s", item);

        System.out.println();
    }
}
