package data_structures;

import java.util.HashSet;
import java.util.Set;

public class SetUsage {
    void iterateSetUsingIterator(HashSet<String> s) {
        for (String string: s) {
            System.out.println(string);
        }
    }

    void iterateUsingIterator(HashSet<String> s) {

    }

    public static void main(String[] args) {
        // This set can contain multiple types of elements
        Set set = new HashSet();
        // This set can only contain string elements
        Set stringSet = new HashSet<String>();
        // Immutable Set instance - Only in JAVA 9
//        Set immutableSet = Set.of();
    }
}
