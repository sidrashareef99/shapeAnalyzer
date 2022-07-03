public class Vector3 {

    private double x, y, z;

    /**
     * create default vector3 object constructor
     */
    Vector3() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
    }

    /**
     * @param x
     * @param y
     * @param z
     */
    Vector3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * @return the z
     */
    public double getZ() {
        return z;
    }

    /**
     * @param z the z to set
     */
    public void setZ(double z) {
        this.z = z;
    }
}
