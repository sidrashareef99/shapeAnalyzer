public class ShapeFactory {

    public static Shape create(String string) {

        Shape shape = null;

        String[] tokens = string.split(",");

        ShapeType shapeType = ShapeType.valueOf(tokens[0].trim());


        switch (shapeType) {
            case SPHERE:
                shape = new Sphere(string);
                break;
            case BLOCK:
                shape = new Block(string);
                break;
            default:
                return null;
        }
        return shape;
    }

}
