package java_building_blocks;


public class JavaTesting {

}

class Initializers {
    {
        System.out.println("Initializing Java");
    }

    static {
        System.out.println("Initializing Java");
    }

    public static void main(String[] args) {
        Initializers i = new Initializers();
    }
}

class Variables {
    int instanceVariable = 1;
    static int staticVariable = 2;

    public int method() {
        int localVariable = 3;
        return localVariable + 1;

    }
}

class Chick {
    private String name = "Fluffy";

    {
        System.out.println("Instance initialization");
    }

    static {
        System.out.println("Static initialization");
    }

    Chick() {
        name = "Bulldog";
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        Chick c = new Chick();
        System.out.println(c.name);
    }
}
class Scope{
    public static void main(String[] args) {
        String one, two;
        one = new String("a");
        two = new String("b");
        one = two;
        String three = one;
        one = null;
    }
}