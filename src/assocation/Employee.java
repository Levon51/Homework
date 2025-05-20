package assocation;

/**
 * 5. Aggregation -  child can exist independently of the parent.
 * Example: Bank and Employee, delete the Bank and the Employee still exist.
 * Create 3   different examples of  aggregation  principles
 */
class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.println("Employee: " + name);
    }
}

class Bank {
    String name;
    Employee[] employees;

    public Bank(String name, Employee[] employees) {
        this.name = name;
        this.employees = employees;
    }

    public void showEmployees() {
        System.out.println("Employees of " + name + ":");
        for (int i = 0; i < employees.length; i++) {
            employees[i].showInfo();
        }
    }
}

class Main {
    public static void main(String[] args) {
        Employee h1 = new Employee("Gexam");
        Employee h2 = new Employee("Valod");
        Employee[] h3 = {h1, h2};

        Bank b1 = new Bank("Ameriabank", h3);
        b1.showEmployees();
    }
}

class Player {
    String name;

    public Player(String name) {
        this.name = name;
    }

    public void showPlayers() {
        System.out.println("Player : " + name);
    }
}

class Team {
    String name;
    Player[] players;

    public Team(String name, Player[] players) {
        this.name = name;
        this.players = players;
    }

    public void show() {
        System.out.println("Players of " + name + ":");
        for (int i = 0; i < players.length; i++) {
            players[i].showPlayers();
        }
    }
}

class Main1 {
    public static void main(String[] args) {
        Player pl = new Player("Harut");
        Player pl1 = new Player("Simon");
        Player pl2 = new Player("Lusine");
        Player[] pl3 = {pl, pl1, pl2};
        Team t1 = new Team("Fast", pl3);
        t1.show();
        Player dl = new Player("Astxik");
        Player dl1 = new Player("Hakob");
        Player dl2 = new Player("Arev");
        Player[] dl3 = new Player[]{dl, dl1, dl2};
        Team t2 = new Team("Slow", dl3);
        t2.show();
    }
}

class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public void showStudent() {
        System.out.println("Student : " + name);
    }
}

class Course {
    String name;
    String name1;
    Student[] study;

    public Course(String name, String name1, Student[] study) {
        this.name = name;
        this.name1 = name1;
        this.study = study;
    }

    public void showCourse() {

        System.out.println("Course of " + name + ":");
        System.out.println("Teacher : " + name1);
        for (int i = 0; i < study.length; i++) {
            study[i].showStudent();
        }
    }
}

class Main2 {
    public static void main(String[] args) {
        Student[] boys = {
                new Student("Gor"),
                new Student("Gexam"),
                new Student("Gevorg"),
                new Student("Garnik")
        };
        Course c1 = new Course("Course for boys", "Mr. Arman", boys);
        c1.showCourse();
        Student[] girls = {
                new Student("Anush"),
                new Student("Anna"),
                new Student("Asya"),
                new Student("Arpine")
        };
        Course c2 = new Course("Course for girls", "Ms. Sona", girls);
        c2.showCourse();
    }
}

/**
 * Composition -   child cannot exist independent of the parent.
 * Example: Human and heart, heart don’t exist separate to a Human.
 * Create 3   different examples of  composition principles.
 */
class CPU {
    String model;
    double speedGHz;

    public CPU(String model, double speedGHz) {
        this.model = model;
        this.speedGHz = speedGHz;
    }

    public void showCPU() {
        System.out.println("CPU model: " + model + ", speed: " + speedGHz + " GHz");
    }
}

class Computer {
    String name;
    CPU cpu;

    public Computer(String name) {
        this.name = name;
        this.cpu = new CPU("Lenovo",49.22);
    }

    public void showComputer() {
        System.out.println("Computer: " + name);
        cpu.showCPU();
    }
}

class Main3 {
    public static void main(String[] args) {
        Computer c = new Computer("Gaming pc");
        c.showComputer();
    }
}

class Chapter {
    String name;

    public Chapter(String name) {
        this.name = name;
    }

    public void chapterName() {
        System.out.println("Chapter: " + name);
    }
}

class Book {
    String name;
    Chapter[] chapters;

    public Book(String name, int numChapters) {
        this.name = name;
        this.chapters = new Chapter[numChapters];
        for (int i = 0; i < numChapters; i++) {
            chapters[i] = new Chapter("Chapter " + (i + 1));
        }
    }

    public void bookName() {
        System.out.println("Book: " + name);
        for (int i = 0; i < chapters.length; i++) {
            chapters[i].chapterName();
        }
    }
}

class Main4 {
    public static void main(String[] args) {
        Book book1 = new Book("Learn Java", 3);
        book1.bookName();;
    }
}

class Floor {
    int floorNumber;

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public void showFloor() {
        System.out.println("Floor number: " + floorNumber);
    }
}

class Building {
    String buildingName;
    Floor floors;

    public Building(String buildingName) {
        this.buildingName = buildingName;
        this.floors = new Floor(5);
    }

    public void showBuilding() {
        System.out.println("Building: " + buildingName);
       floors.showFloor();
    }
}

class Main5 {
    public static void main(String[] args) {
        Building b = new Building("NEW");
        b.showBuilding();
    }
}
/**
 * .  Create Address and User  classes using  one-to-many relation.
 */
class Addresses{
   String city;
   String street;
   public Addresses(String city, String street){
       this.city = city;
       this.street =street;
   }
   public void showAddress(){
       System.out.println("City:" + city + "Street: " + street);
   }
}
class User{
    String name;
    Addresses[] address;
    public User(String name, Addresses[] address){
        this.name = name;
    }
    public void userName(){
        System.out.println("User:" + name);
        System.out.println("Addresses:");
        for(Addresses ad : address){
            ad.showAddress();
        }
    }
}
class Main6{
    public static void main(String[] args) {
        Addresses a1 = new Addresses("Yerevan", "Baghramyan");
        Addresses a2 = new Addresses("Gyumri", "Shahumyan");
        Addresses[] addresses = {a1, a2};

        User u1 = new User("Narek", addresses);
        u1.userName();
    }
}