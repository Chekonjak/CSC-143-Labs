public class Car {
    private String make;
    private double weight;

    public Car(String make, double weight) {
        this.make = make;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == this.getClass()) {
            Car c = (Car) obj;
            return this.make.equals(c.make) && this.weight == c.weight;
        } else {
            return false;
        }
    }

//	@Override // detects that this is not an override
//	public boolean equals(Car c) {
//		// NOT an override but an overload
//	}

    @Override
    public String toString() {
        return "Make: " + make + "\n" + "Weight: " + weight;
    }

    public Car shallowCopy() {
        // returns a shallow copy of this car
        return new Car(this.make, this.weight);
        // because a String is immutable (i.e. can't be modified), there is
        // no practical difference between the shallow and deep copies
    }

    public Car deepCopy() {
        // returns a deep copy of this car
        return new Car(new String(this.make), this.weight);
    }

}
