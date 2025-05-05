package specifires;

/**
 *
 2.	Create a class with a static method that accepts an array of
 integers and returns the index of the maximum value in the array.
 Use this method in another class to find the index of the maximum value in a randomly
 generated array of integers.

 */
class Array{
    static int array(int[] a){
        int maxIndex = 0;
        for(int i = 0; i<a.length; i++){
            if(a[i]>a[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {2,333,444,789,555,666,};
        int maxIndex =Array.array(numbers);
        System.out.println(maxIndex);
    }
}
