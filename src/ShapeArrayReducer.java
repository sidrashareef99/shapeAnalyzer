import java.util.ArrayList;

public interface ShapeArrayReducer {
    /**
     * will be implemented in main to reduce the array to two shapes
     * and will be then further reduced using the specific shapeSelector
     *
     * @param array
     * @param shape
     * @return
     */
    Shape reduce(ArrayList<Shape> array, ShapeSelector shape);
}
