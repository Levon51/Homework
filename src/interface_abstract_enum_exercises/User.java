package interface_abstract_enum_exercises;

abstract class User{
    public abstract void login();
    public abstract void logout();
}
abstract class NormalUser extends User{
    public void login(){
        System.out.println("The user log in");
    }
    public void logout(){
        System.out.println("The user log out ");
    }
}
interface Admin{
    void addUsers();
    void deleteUsers();
}

 class AdminUser extends NormalUser implements Admin{
    public void addUsers(){
        System.out.println("Adding users");
    }
    public void deleteUsers(){
        System.out.println("Deleting Users");
    }

     public static void main(String[] args) {
         AdminUser ad = new AdminUser();
         ad.login();
         ad.addUsers();
         ad.deleteUsers();
         ad.logout();
     }
}