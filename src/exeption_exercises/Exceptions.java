package exeption_exercises;

class MyException1 extends Exception {
    public MyException1(String message) {
        super(message);
    }
}

class MyException2 extends Exception {
    public MyException2(String message) {
        super(message);
    }
}

class MyException3 extends Exception {
    public MyException3(String message) {
        super(message);
    }
}

public class Exceptions {
    public static void throwSomething(int choice) throws MyException1, MyException2, MyException3 {
        if (choice == 1) {
            throw new MyException1("Սա MyException1 է");
        } else if (choice == 2) {
            throw new MyException2("Սա MyException2 է");
        } else if (choice == 3) {
            throw new MyException3("Սա MyException3 է");
        } else {
            System.out.println("Ոչ մի exception չի նետվել");
        }
    }


    public static void main(String[] args) {
        try {
            throwSomething(2);
        } catch (Exception e) {
            System.out.println("Բռնվեց բացառություն՝ " + e.getMessage());
        }
    }
}
