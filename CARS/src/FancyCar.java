public class FancyCar extends Car {
    private double topSpeed;

    public FancyCar(String make, double weight, double topSpeed) {
        super(make, weight);
        this.topSpeed = topSpeed;
    }

    public boolean equals(Object obj) {
        if (obj instanceof FancyCar) {
            FancyCar fc = (FancyCar) obj;
            return super.equals(fc) && this.topSpeed == fc.topSpeed;
        } else {
            return false;
        }
    }
}
