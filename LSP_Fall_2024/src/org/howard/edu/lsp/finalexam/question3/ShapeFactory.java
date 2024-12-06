package org.howard.edu.lsp.finalexam.question3;

import java.util.HashMap;
import java.util.Map;


public class ShapeFactory {
    private static final ShapeFactory INSTANCE = new ShapeFactory();
    private final Map<String, Shape> shapeCache;

    private ShapeFactory() {
        shapeCache = new HashMap<>();
        shapeCache.put("circle", new Circle());
        shapeCache.put("rectangle", new Rectangle());
        shapeCache.put("triangle", new Triangle());
    }

    public static ShapeFactory getInstance() {
        return INSTANCE;
    }

    public Shape getShape(String shapeType) {
        if (shapeType == null || shapeType.isEmpty()) {
            throw new IllegalArgumentException("Shape type cannot be null or empty.");
        }
        Shape shape = shapeCache.get(shapeType.toLowerCase());
        if (shape == null) {
            throw new IllegalArgumentException("Unknown shape type:" + shapeType);
        }
        return shape;
    }
}
