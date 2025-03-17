package employees;

/**
 * Սահմանել Employee class-ը, որը ունի
 * instance  fields (id, departmentNumber, age , gender)
 * methods printEmployees() որը տպում է Employee  մասին ամբողջական ինֆորմացիա։
 * Ստեղծել  3 աշխատող( 2 տղա և 1 աղջիկ), որոնցից երկուսը աշխատում են նույն դեպարտամենտում
 * և ունեն նույն տարիքը։
 */
public class Employees {
    public int id;
    public int departmentNumber;
    public int age;
    public char gender;
            public Employees() {

            }
                public void printEmployees() {
                    System.out.println(id);
                    System.out.println(departmentNumber);
                    System.out.println(age);
                    System.out.println(gender);

                }




            public static void main(String[] args) {
                Employees girl = new Employees();
                 girl.id = 6;
                 girl.departmentNumber = 20;
                 girl.age = 25;
                 girl.gender = 'F';
                 girl.printEmployees();
                 Employees boy = new Employees();
                boy.id = 9;
                boy.departmentNumber = 20;
                boy.age = 25;
                boy.gender = 'M';
                boy.printEmployees();
                Employees boy1 = new Employees();
                boy1.id = 21;
                boy1.departmentNumber = 60;
                boy1.age = 34;
                boy1.gender = 'M';
                boy1.printEmployees();



            }

}
