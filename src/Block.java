public class Block extends Shape implements Sizeable {

    Block() {
        super();
    }

    Block(String string) {
        super(string);
    }

    @Override
    public double surface() {
        double surfaceArea;
        surfaceArea = (2 * (this.getSize().getX() * this.getSize().getY())) + (2 * (this.getSize().getX() * this.getSize().getZ())) + (2 * (this.getSize().getY() * this.getSize().getZ()));
        return surfaceArea;

    }

    @Override
    public double volume() {
        double vol = this.getSize().getX() * (this.getSize().getY() * this.getSize().getZ());
        return vol;
    }


}
