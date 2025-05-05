package specifires;
 class Person1 implements Comparable<Person1>{
      String name1;
      int age1;
    Person1(String name1, int age1){
        this.age1 = age1;
        this.name1 = name1;
    }
    public int compareTo(Person1 other){
        return this.age1 - other.age1;

    }
 }
