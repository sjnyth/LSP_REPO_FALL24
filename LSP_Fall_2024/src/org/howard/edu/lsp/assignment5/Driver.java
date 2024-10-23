package org.howard.edu.lsp.assignment5;

//import java.util.ArrayList;
//import java.util.List;

/**
 * Driver class to test the IntegerSet operations, including:
 * - Union, intersection, difference, complement
 * - Equality check
 * - Empty set check
 * 
 * @author Saujanya Thapaliya
 */

public class Driver {
	public static void main(String[] args) {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);

		System.out.println("Value of Set1 is:" + set1.toString());
		System.out.println("Smallest value in Set1 is:" + set1.smallest());
		System.out.println("Largest value in Set1 is:" + set1.largest());

		IntegerSet set2 = new IntegerSet();
		set2.add(3);
		set2.add(4);
		set2.add(5);

		System.out.println("Union of Set1 and Set2");
		System.out.println("Value of Set1 is:" + set1.toString());
		System.out.println("Value of Set2 is:" + set2.toString());
		set1.union(set2);	// union of set1 and set2
		System.out.println("Result of union of Set1 and Set2");
		System.out.println(set1.toString());	// result of union of set1 and set2]

		// Test case 2: Intersection operation
        set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2 = new IntegerSet();
        set2.add(2);
        set2.add(3);
        set2.add(5);

        set1.intersect(set2);
        System.out.println("Intersection of Set1 and Set2: " + set1.toString());  // Expected: [2, 3]

        // Test case 3: Difference operation (Set1 - Set2)
        set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2 = new IntegerSet();
        set2.add(2);
        set2.add(3);
        set2.add(5);

        set1.diff(set2);
        System.out.println("Difference of Set1 and Set2 (Set1 - Set2): " + set1.toString());  // Expected: [1]

        // Test case 4: Complement operation (relative to another set)
        set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2 = new IntegerSet();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);

        set1.complement(set2);
        System.out.println("Complement of Set1 relative to Set2: " + set1.toString());  // Expected: [4, 5]

        // Test case 5: Checking for equality
        set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2 = new IntegerSet();
        set2.add(3);
        set2.add(2);
        set2.add(1);

        System.out.println("Set1 equals Set2: " + set1.equals(set2));  // Expected: true

        // Test case 6: Check if set is empty
        set1 = new IntegerSet();
        System.out.println("Set1 is empty: " + set1.isEmpty());  // Expected: true

        set1.add(10);
        System.out.println("Set1 is empty after adding element: " + set1.isEmpty());  // Expected: false
	}
}
