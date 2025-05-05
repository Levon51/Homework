package interface_abstract_enum_exercises;

abstract class Shape{
    abstract void draw();
    abstract void erase();
}
class Circle extends Shape{
 public void draw(){
     System.out.println("Drawing a circle");
 }
 public void erase(){
     System.out.println("Erasing a Circle");
 }
}
class Triangle extends Shape{
    public void draw(){
        System.out.println("Drawing a triangle");
    }
    public void erase(){
        System.out.println("Erasing a triangle");
    }
}
class Square extends Shape{
    public void draw(){
        System.out.println("Drawing a Square");
    }
    public void erase(){
        System.out.println("Erasing a square");
    }
}
class Main{
    public static void main(String[] args) {
        Shape a = new Circle();
        Shape a1 = new Triangle();
        Shape a2 = new Square();

        a.draw();
        a.erase();

        a1.draw();
        a1.erase();

        a2.draw();
        a2.erase();
    }
}