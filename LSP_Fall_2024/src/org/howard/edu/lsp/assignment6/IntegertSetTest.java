package org.howard.edu.lsp.assignment6;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegertSetTest {
	@Test
	@DisplayName("Test case for add")
	public void testAdd() {
		IntegerSet setA= new IntegerSet();
		int[] numbers = {6,2,9,4,5,2,9};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		assertEquals("[6, 2, 9, 4, 5]",setA.toString());
		setA.add(6);
		assertNotEquals("[6, 2, 9, 4, 5, 6]", setA.toString());
		assertNotEquals("[]", setA.toString());
		assertNotEquals("[1,2,3]", setA.toString());			
	}
	
	@Test
	@DisplayName("Test case for clear")
	public void testClear() {
		IntegerSet setA= new IntegerSet();
		int[] numbers = {6,2,9,4,5};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		setA.clear();
		assertEquals("[]",setA.toString());
		assertNotEquals("[6,2,9,4,5]", setA.toString());
		assertNotEquals("", setA.toString());			
	}
	
	@Test
	@DisplayName("Test case for length")
	public void testLength() {
	
		IntegerSet setA= new IntegerSet();
		int[] numbers = {1,2,3,4,5};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		IntegerSet setB= new IntegerSet();
		int[] numbers1 = {1,2,3,4,5};
		for (int i = 0; i < numbers1.length; i ++) {
			setB.add(numbers1[i]);
		}
		assertEquals(5,setA.length());
		assertEquals(5,setB.length());
		assertEquals(setA.length(),setB.length());
	} 
	
	@Test
	@DisplayName("Test case for equals")
	public void testEquals() {
		IntegerSet setA= new IntegerSet();
		int[] numbers = {1,2,3,4,5,5};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		IntegerSet setB= new IntegerSet();
		int[] numbers1 = {1,2,3,4,4,5};
		for (int i = 0; i < numbers1.length; i ++) {
			setB.add(numbers1[i]);
		}
		assertEquals(setA.toString(),setB.toString());
	}
	
	@Test
	@DisplayName("Test case for contains")
	public void testContains() {
		IntegerSet setA= new IntegerSet();
		
		int[] numbers = {6,2,9,4,5};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		assertTrue(setA.contains(6));
		assertFalse(setA.contains(10));
		assertNotEquals(true,setA.contains(50));
	}
	
	@Test
	@DisplayName("Test case for largest")
	public void testLargest() throws Exception {
		IntegerSet setA= new IntegerSet();
		int[] numbers = {100,900,600,800};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		IntegerSet setB= new IntegerSet();
		int[] numbers1 = {1,2,3,4,500,700};
		for (int i = 0; i < numbers1.length; i ++) {
			setB.add(numbers1[i]);
		}
		assertEquals(900,setA.largest());
		assertEquals(700,setB.largest());
	}

	@Test
    @DisplayName("Test case for largest() throws IntegerSetException when set is empty")
    public void testLargestThrowsException() {
        IntegerSet setA = new IntegerSet();
        Exception exception = assertThrows(IntegerSetException.class, () -> {
            setA.largest();
        });
        
        String expectedMessage = "IntegerSetException -> Set is Empty";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }
	
	@Test
	@DisplayName("Test case for smallest")
	public void testSmallest() throws Exception {
		IntegerSet setA= new IntegerSet();
		int[] numbers = {100,900,600,800};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		IntegerSet setB= new IntegerSet();
		int[] numbers1 = {1,2,3,4,500,700};
		for (int i = 0; i < numbers1.length; i ++) {
			setB.add(numbers1[i]);
		}
		assertEquals(100,setA.smallest());
		assertEquals(1,setB.smallest());
	}

	@Test
	@DisplayName("Test case for Smallest_throws_exception")
	public void testSmallest_THROWS_EXCEPTION() {
		IntegerSet setA = new IntegerSet();
		Exception exception = assertThrows(IntegerSetException.class, ()->{
			setA.smallest();
		});
		String expectedMessage = "IntegerSetException -> Set is Empty";
		String actualMessage = exception.getMessage();
		
		assertTrue(actualMessage.equals(expectedMessage));
		assertNotNull(exception.getMessage());
	}
	
	@Test
	@DisplayName("Test case for remove")
	public void testRemove() throws org.howard.edu.lsp.assignment6.IntegerSetException {
	    IntegerSet setA = new IntegerSet();
	    int[] numbers = {6, 2, 9, 4, 5};
	    for (int i = 0; i < numbers.length; i++) {
	        setA.add(numbers[i]);
	    }
	    setA.remove(6);
	    setA.remove(2);
	    assertEquals("[9, 4, 5]", setA.toString()); 
	    assertNotEquals("[]", setA.toString());     
	    assertNotEquals("[6, 2, 9, 4, 5]", setA.toString()); 

	    setA.remove(2); 
	    assertEquals("[9, 4, 5]", setA.toString()); 
	}


	
	@Test
	@DisplayName("Test case for union")
	public void testUnion() {
		IntegerSet setA= new IntegerSet();
		int[] numbers = {6,2,10,4,5};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		IntegerSet setB= new IntegerSet();
		int[] numbers1 = {6,2,5,7,9};
		for (int i = 0; i < numbers1.length; i ++) {
			setB.add(numbers1[i]);
		}
		setA.union(setB);
		assertEquals("[6, 2, 10, 4, 5, 7, 9]",setA.toString());
		assertNotEquals("[6, 2, 10, 4, 5, 6, 2, 5, 7, 9]",setA.toString());
		assertTrue(setA.contains(6) && setA.contains(7) && setA.contains(10));
	}
	
	@Test
	@DisplayName("Test for intersection")
	public void testIntersection() {
		IntegerSet setA= new IntegerSet();
		int[] numbers = {1,2,3,4,5};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		IntegerSet setB= new IntegerSet();
		int[] numbers1 = {1,3,5,7,9};
		for (int i = 0; i < numbers1.length; i ++) {
			setB.add(numbers1[i]);
		}
		setA.intersect(setB);
		assertEquals("[1, 3, 5]",setA.toString());
		assertTrue(setA.contains(1) && setA.contains(3) && setA.contains(3));
		assertNotEquals("[1,2,3,4,5]",setA.toString());
	}
	
	@Test
	@DisplayName("Test case for difference")
	public void testDifference() {
	 
		IntegerSet setA= new IntegerSet();
		int[] numbers = {1,2,3,4,5,10};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		IntegerSet setB= new IntegerSet();
		int[] numbers1 = {1,3,5,7,9,10};
		for (int i = 0; i < numbers1.length; i ++) {
			setB.add(numbers1[i]);
		}
		setA.diff(setB);
		assertEquals("[2, 4]",setA.toString());
		assertNotEquals("[1, 3, 5]", setA.toString());
	}
	
	@Test
	@DisplayName("Test case for complement")
	void testComplement() {
		IntegerSet setA= new IntegerSet();
	    IntegerSet setB = new IntegerSet();
	    setA.add(1);
	    setA.add(2);
	    setB.add(2);
	    setB.add(3);
	    setB.add(4);
	    setA.complement(setB);
	    assertTrue(setA.contains(3) && setB.contains(4));
	    assertEquals(2, setA.length());
	}
	
	@Test
	@DisplayName("Test case for isEmpty")
	void testIsEmpty() {
		IntegerSet setA= new IntegerSet();
		setA.clear();
		assertEquals(0, setA.length());
		assertTrue(setA.isEmpty());
		setA.add(1);
		assertFalse(setA.isEmpty());
	}
	
	@Test
	@DisplayName("test toString")
	public void testToString() {
		IntegerSet setA= new IntegerSet();
		int[] numbers = {6,2,9,4,5};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		
		assertEquals("[6, 2, 9, 4, 5]",setA.toString());
		assertNotEquals("62945",setA.toString());
	}
}
