public abstract class Shape {
    private ShapeType type;

    private final Vector3 size;

    /**
     * create default shape constructor
     */
    Shape() {
        this.type = ShapeType.UNKNOWN;
        this.size = new Vector3();
    }

    /**
     * take string and tokenize it to set variables to tokens
     *
     * @param initialValuesString
     */
    Shape(String initialValuesString) {
        this();
        String[] tokens = initialValuesString.split(",");
        this.type = ShapeType.valueOf(tokens[0].trim());
        this.size.setX(Double.parseDouble(tokens[1].trim()));
        this.size.setY(Double.parseDouble(tokens[2].trim()));
        this.size.setZ(Double.parseDouble(tokens[3].trim()));

    }

    /**
     * surface and volume methods created to be implemented in block and sphere classes
     */
    public abstract double surface();

    public abstract double volume();

    /**
     * @return the type
     */
    public ShapeType getType() {
        return type;
    }

    /**
     * @return the size
     */
    public Vector3 getSize() {
        return size;
    }

    /**
     * format and create string
     */
    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append(this.type);
        builder.append("\n\t" + String.format("%.2f", this.surface()));
        builder.append("\n\t" + String.format("%.2f", this.volume()));

        return builder.toString();

    }

}
