public class Sphere extends Shape implements Sizeable {


    Sphere() {
        super();
    }


    Sphere(String string) {
        super(string);
    }

    /**
     * setting radius for the sphere object
     *
     * @return the radius
     */
    public double radius() {
        double radius;
        radius = Math.min(this.getSize().getX(), Math.min(this.getSize().getY(), this.getSize().getZ())) / 2;
        return radius;
    }


    @Override
    public double surface() {
        double surfaceArea;
        surfaceArea = 4 * (Math.PI * (Math.pow(this.radius(), 2)));
        return surfaceArea;
    }


    @Override
    public double volume() {
        double vol;
        vol = (4 / 3) * (Math.PI * (Math.pow(this.radius(), 3)));
        return vol;
    }
}
