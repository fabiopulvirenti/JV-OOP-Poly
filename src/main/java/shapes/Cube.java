package shapes;

public class Cube extends Shape3D{

    double size;
    public Cube(double size) {
        this.size = size;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }
}
