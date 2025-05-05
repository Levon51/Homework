package store;

public class Author {
    public static void main(String[] args) {

    }
}
class Mammal {
    public Mammal(int age) {
     System.out.print("Mammal");
          }
 }
  class Platypus extends Mammal {
    public Platypus() {
        super(5);
        System.out.print("Platypus");
    }
    public static void main(String[] args) {
             new Mammal(5);
          }
  }
