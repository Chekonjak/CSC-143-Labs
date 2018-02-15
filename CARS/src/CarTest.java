class CarTest {

    public static void main(String[] args) {
        Car c1 = new Car("Ford", 2000);
        Car c2 = new Car("Ford", 2000);
        System.out.println("c1.equals(null) is " + c1.equals(null));
        System.out.println("c1.equals(c1) is " + c1.equals(c1));
        System.out.println("c2.equals(c2) is " + c2.equals(c2));

        // with FancyCar objects
        System.out.println();
        FancyCar fc1 = new FancyCar("Ford", 2000, 180);
        System.out.println("fc1.equals(c1) is " + fc1.equals(c1));
        System.out.println("c1.equals(fc1) is " + c1.equals(fc1));
        // remember equals uses the prefix class's equals method. How can we rework this so that it is symmetric?
        // USE get class

        // Copy tests
        System.out.println();
        Car s = c1.shallowCopy();
        Car d = c1.deepCopy();
        System.out.println("Debug");
    }

}
