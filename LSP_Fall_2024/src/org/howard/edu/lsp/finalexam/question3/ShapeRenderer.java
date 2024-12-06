package org.howard.edu.lsp.finalexam.question3;

/**
 * Main Class Shape Renderer
 */

public class ShapeRenderer {
	 /**
     * Renders a shape based on the specified shape type
     * @param shapeType the type of shape to render (e.g., "circle", "rectangle").
     */
    public void renderShape(String shapeType) {
        ShapeFactory shapeFactory = ShapeFactory.getInstance();
        Shape shape = shapeFactory.getShape(shapeType);
        if (shape != null) {
            shape.draw();
        } else {
            System.out.println("Unknown shape type: " + shapeType);
        }
    }

    public static void main(String[] args) {
        ShapeRenderer renderer = new ShapeRenderer();

        renderer.renderShape("circle");    
        renderer.renderShape("rectangle"); 
        renderer.renderShape("triangle");  
        renderer.renderShape("hexagon");  
    }
}