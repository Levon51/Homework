package specifires;

import java.util.Arrays;

public class Comparable2 {
    public static void main(String[] args) {
        Person1[] p = {
                new Person1("Valod",55),
                new Person1("Vzgo",99),
                new Person1("Gexaznik",1)
        };
        Person1 older =p[0];
        for(int i = 1; i<p.length;i++) {
            if(p[i].age1>older.age1){
                older = p[i];
            }
        }
        System.out.println(older.age1 + " - " + older.name1);

    }
}
