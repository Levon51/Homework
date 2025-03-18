package rectangle;

/**
 * Սահմանել Rectangle class : instance  fields (int length, int width )  , methods ( calculateArea() ) .
 * Ստեղծել  ուղղանկյուն (բարձրություն 5,  լայնություն 14)  և հաշվել  ուղղանկյան մակերեսը
 */

public class Rectangle {
    public int length;
    public int width;


    public void calculateArea(int length, int width) {
        int area = length * width;
        System.out.println(area);

    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.calculateArea(5, 14);

    }
}
