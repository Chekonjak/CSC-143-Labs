public class TestCritter
{
  // Write description of and sound produced by Critter c.
  public static void writeInfo(Critter c) {
      System.out.println("Dynamic type = " + c.getClass());
      c.describe();
      c.speak();
      // if a Trainable, make it fetch and roll over
      // a instanceof B where a is a variable name and B a type name (definable by class, interface, or abstract class)
      // is true if a is_a B
      if (c instanceof Trainable) {
          Trainable t = (Trainable) c;
          t.fetch(); // if only as c.fetch(); the compiler will see a static type without the fetch method and will not compile
      }
      // int i = 10;
      //if (i instanceof Object) // Cannot cast int type to Object
  }

  // Test critter classes
  public static void main(String[] args)
  {
    // Create a poodle, a buffalo, a cow and a bird
    Critter[] a = {new Poodle(), new Buffalo(), new Cow()};
    // Call writeInfo for each critter
    //

    for (Critter c : a) {
        writeInfo(c);
        c.speak();
        c.describe();
    }
  }
}
