package shapes;

public class Pyramid extends Shape3D{

    double height;

    public Pyramid(Shape base,double height) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }
}
