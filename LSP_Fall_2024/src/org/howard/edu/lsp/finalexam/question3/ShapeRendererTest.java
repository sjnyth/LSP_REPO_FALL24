package org.howard.edu.lsp.finalexam.question3;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShapeRendererTest {

    @Test
    @DisplayName("Test for lowercase circle")
    public void testLowercaseCircle() {
        ShapeFactory shapeFactory = ShapeFactory.getInstance();
        Shape shape = shapeFactory.getShape("circle");
        assertNotNull(shape);
        assertTrue(shape instanceof Circle);
    }

    @Test
    @DisplayName("Test for uppercase rectangle")
    public void testUppercaseRectangle() {
        ShapeFactory shapeFactory = ShapeFactory.getInstance();
        Shape shape = shapeFactory.getShape("RECTANGLE");
        assertNotNull(shape);
        assertTrue(shape instanceof Rectangle);
    }

    @Test
    @DisplayName("Test for mixed case triangle")
    public void testMixedCaseTriangle() {
        ShapeFactory shapeFactory = ShapeFactory.getInstance();
        Shape shape = shapeFactory.getShape("TriAnGle");
        assertNotNull(shape);
        assertTrue(shape instanceof Triangle);
    }

    @Test
    @DisplayName("Test for null input")
    public void testNullInput() {
        ShapeFactory shapeFactory = ShapeFactory.getInstance();
        assertThrows(IllegalArgumentException.class, () -> {
            shapeFactory.getShape(null);
        }, "Expected getShape(null) to throw IllegalArgumentException.");
    }

    @Test
    @DisplayName("Test for empty string input")
    public void testEmptyStringInput() {
        ShapeFactory shapeFactory = ShapeFactory.getInstance();
        assertThrows(IllegalArgumentException.class, () -> {
            shapeFactory.getShape("");
        }, "Expected getShape(\"\") to throw IllegalArgumentException.");
    }
    
    @Test
    @DisplayName("Test for unsupported shape input")
    public void testUnsupportedShape() {
        ShapeFactory shapeFactory = ShapeFactory.getInstance();
        assertThrows(IllegalArgumentException.class, () -> shapeFactory.getShape("pentagon"), 
                     "Expected getShape(\"pentagon\") to throw IllegalArgumentException.");
    }
}
