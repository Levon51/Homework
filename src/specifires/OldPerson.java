package specifires;

public class OldPerson {
    public static Person getOldestPerson(Person[] people){
        Person oldest = people[0];
        for(Person person : people){
            if(person.getAge() > oldest.getAge()){
                oldest = person;
            }
        }
        return oldest;
    }

    public static void main(String[] args) {
        Person person = new Person(36, "Lora");
        Person person1 = new Person(11, "Bob");
        Person person2 = new Person(74,"Valod");

        Person[] people = {person,person1, person2};

        Person oldest = getOldestPerson(people);

        System.out.println("The oldest person is: " + oldest);
    }
}
