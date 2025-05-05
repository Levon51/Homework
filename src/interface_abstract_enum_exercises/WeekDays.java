package interface_abstract_enum_exercises;

enum Day{
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday, Sunday
}
public class WeekDays{
    public static void main(String[] args) {
        Day d = Day.Thursday;
        switch(d){
            case Monday:
            case Tuesday:
            case Wednesday:
            case Thursday:
                System.out.println("Այս օրը աշխատանքային օր է ");
                break;
            case Friday:
            case Saturday:
            case Sunday:
                System.out.println("Այս օրը ոչ աշխատանքային օր է ");
                break;
        }
    }
}