public class TestCritter {
	// Write description of and sound produced by Critter c.
	public static void writeInfo(Critter c) {
		c.describe();
		c.speak();

		// If a Trainable, make it fetch and roll over.
		// a instanceOf B where a is a variable name and B a type name.
		// is true if a is-a B.
		if (c instanceof Trainable) {
			Trainable t = (Trainable) c;
			((Trainable) c).rollOver();
			((Trainable) c).fetch();
		}
	}

	// Test critter classes
	public static void main(String[] args) {
		// Create a poodle, a buffalo, a cow and a bird
		// Critter[] a = new Critter[3];
		// a[0] = new Poodle();
		// a[1] = new Buffalo();
		// a[2] = new Cow();
		Critter[] a = { new Poodle(), new Buffalo(), new Cow() };
		// Call writeInfo for each critter
		// for (int i = 0; i<a.length;i++) {
		// writeInfo(a[i]);
		// System.out.println();
		//
		// }
		for (Critter c : a) {
			writeInfo(c);
			System.out.println();
		}
	}
}