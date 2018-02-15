public class B {
    private A[] array;

    public boolean equals(Object obj) {
        // if (obj instanceof B) { instead of this line because instanceof covers null
        if (obj != null && obj.getClass() == this.getClass()) { // care for short-circuiting
            B b = (B) obj;
            if (b.array.length == this.array.length) {
                for (int i = 0; i < b.array.length; i++) {
                    if (!b.array[i].equals(this.array[i])) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false; // no need for an else because if nothing happens before this point equals() must return false
    }
    // equals:
    // two Bs are equal if they have same array with the same elements
    public B(A[] aList) {
        this.array = aList;
    }

}
