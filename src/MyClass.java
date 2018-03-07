import java.util.ArrayList;
import java.util.Arrays;

// just some test program... Output = ["8", "9", "10", "11", "13", "22"]

public class MyClass {
    static ArrayList<String> required_tests = new ArrayList();
    public static void main(String args[]) {
        // Set the required_tests values String [1-8]
        required_tests.add("1");
        required_tests.add("2");
        required_tests.add("3");
        required_tests.add("4");
        required_tests.add("5");
        required_tests.add("6");
        required_tests.add("7");
        required_tests.add("8");

        // Make the tests
        String []tests = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "13", "22"};

        // Use the ExtendedArrayListMethods
        ExtendedArrayListMethods ealm = new ExtendedArrayListMethods();

        // Print out the result
        System.out.println(ealm.differenceOfArrayList(required_tests, tests).toString());
    }
}
