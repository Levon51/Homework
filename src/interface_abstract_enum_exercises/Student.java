package interface_abstract_enum_exercises;

abstract class Marks {
    abstract double getPercentage();
}

class U extends Marks {
    int mark1, mark2, mark3;

    U(int m1, int m2, int m3) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    double getPercentage() {
        return (mark1 + mark2 + mark3) / 3.0;
    }
}

class B extends Marks {
    int mark1, mark2, mark3, mark4;

    B(int m1, int m2, int m3, int m4) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
        mark4 = m4;
    }

    double getPercentage() {
        return (mark1 + mark2 + mark3 + mark4) / 4.0;
    }
}

class TestMarks {
    public static void main(String[] args) {
        Marks studentA = new U(80, 90, 85);
        Marks studentB = new B(70, 75, 80, 90);

        System.out.println("Student A Percentage: " + studentA.getPercentage() + "%");
        System.out.println("Student B Percentage: " + studentB.getPercentage() + "%");
    }
}
