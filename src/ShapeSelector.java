@FunctionalInterface
public interface ShapeSelector {

    /**
     * This is an abstract method within the ShapeSelector functional interface.
     * It is used to create lambda functions in order to calculate min and max values for volume and surface of Shape.
     *
     * @param a
     * @param b
     * @return
     */
    Shape select(Shape a, Shape b);

}
