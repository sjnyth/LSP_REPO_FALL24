package org.howard.edu.lsp.assignment5;
import java.util.List;
import java.util.ArrayList;

/** 
 * Saujanya Thapaliya
 * @author Saujanya
 * **/

/**
 * IntegerSet class that provides set operations for integers.
 */
public class IntegerSet  {
	// Store the set elements in an ArrayList.
	private List<Integer> set = new ArrayList<Integer>();

	/**
	 * Default constructor that creates an empty IntegerSet.
	 */
	public IntegerSet() {
		
	}

	/**
	 * Constructor that initializes the IntegerSet with an existing list of integers.
	 * @param set the list of integers to initialize the set with
	 */
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}

	// Clears the internal representation of the set. 5 pts.
	public void clear() {
		set.clear();
	};

	/**
	 * Returns the number of elements in the set.
	 * @return the length of the set
	 */
	public int length() {
		return set.size(); // returns the length
	}; 

	// Two sets are equal if they contain all of the same values in ANY order.  This overrides
    // the equal method from the Object class. 10 pts.
	/**
     * Returns true if the 2 sets are equal, false otherwise;
     * @param o the object to compare with
	 * @return true if the sets are equal, false otherwise
     */
	public boolean equals(Object o) {
		if (!(o instanceof IntegerSet)) {
			return false;
		}
		IntegerSet otherSet = (IntegerSet) o;
		return this.set.containsAll(otherSet.set) && otherSet.set.containsAll(this.set);
	}; 

	// Returns true if the set contains the value, otherwise false. 5 pts.
    /**
	 * @param value the value to check for
	 * @return true if the set contains the value, otherwise false
	 */
	public boolean contains(int value) {
		return set.contains(value);
	};
	
	// Returns the largest item in the set. 5 pts.
    /**
	 * @return the largest integer in the set
	 */
	public int largest()  {
		int curr_max = this.set.get(0);
		for (int val: this.set) {
			if (val > curr_max) {
				curr_max = val;
			}
		}
		return curr_max;
	 }; 
	
	//Returns the smallest item in the set. 5 pts.
	/**
     * @return the smallest integer in the set
     */
	public int smallest()  {
		int curr_min = this.set.get(0);
		for (int val: this.set) {
			if (val < curr_min) {
				curr_min = val;
			}
		}
		return curr_min;
	};

	/**
	 * Adds an item to the set or does nothing it already there. 5 pts.	
	 * @param item the item to add
	 */ 
	public void add(int item) {
		if (!contains(item)) {
			set.add(item); 
		}
	}; 
	
	
	/**
	 * Removes an item from the set or does nothing if not there. 5 pts.
	 * @param item the item to remove
	 */
	public void remove(int item) {
		if(contains(item)) {
			set.remove(item);
		}
	}; 
	
	// Set union. 11 pts.
	/**
	 * Modifies this set to be the union of this set and another IntegerSet.
	 * @param intSetb the other IntegerSet
	 */
	public void union(IntegerSet intSetb) {
		for (int num: intSetb.set) {
			this.add(num);
		}
	};
	
	// Set intersection, all elements in s1 and s2. 12 pts.
	/**
	 * Modifies this set to be the intersection of this set and another IntegerSet.
	 * @param intSetb the other IntegerSet
	 */
	public void intersect(IntegerSet intSetb) {
		set.retainAll(intSetb.set);
	}; 
	
	// Set difference, i.e., s1 –s2. 12 pts.
	/**
	 * Modifies this set to be the difference of this set and another IntegerSet.
	 * The resulting set contains elements that are in this set but not in intSetb.
	 * @param intSetb the other IntegerSet
	 */
	public void diff(IntegerSet intSetb) {
		// set difference, i.e. s1 - s2
		set.removeAll(intSetb.set);
	}; 
	
	// Set complement, all elements not in s1. 11 pts.
	/**
	 * Modifies this set to be the complement relative to another IntegerSet.
	 * The resulting set contains elements that are in intSetb but not in this set.
	 * @param intSetb the other IntegerSet
	 */
	public void complement(IntegerSet intSetb) {
		List<Integer> complementSet = new ArrayList<Integer>();
		for (int i = 0; i < intSetb.set.size(); i++) {
			if (!set.contains(intSetb.set.get(i))) {
				complementSet.add(intSetb.set.get(i));
			}
		}
		set = complementSet;
	}
	
	// Returns true if the set is empty, false otherwise. 5 pts.
	/**
	 * Checks if the set is empty.
	 * @return true if the set is empty, false otherwise
	 */
	boolean isEmpty() {
		return set.isEmpty();
	}; 
	
	/**
	 * Returns a string representation of the set.
	 * Overrides the toString method from the Object class.
	 * @return a string representation of the set
	 */
	
	public String toString() {
		// return String representation of your set
		return this.set.toString();
	};	
	
}

