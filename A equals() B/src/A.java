public class A {
    private int i;

    public boolean equals(Object obj) {
        if (obj instanceof A) {
            return ((A) obj).i == i;
        } else {
            return false;
        }
    }
    public A(int i) {
        this.i = i;
    }
}
