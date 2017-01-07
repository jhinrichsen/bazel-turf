
package name.hinrichsen.jochen;

import name.hinrichsen.jochen.A;

public class B {
  public static void main(String args[]) {
    System.out.println("Hello B, it is now " + new A().getNow());
    System.out.println("Twice 2 equals " + A.twice(2));
  }
}

