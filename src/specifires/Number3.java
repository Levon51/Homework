package specifires;
class Number3 {
    final String toBinary(int number) {
        return Integer.toBinaryString(number);
    }

    public static void main(String[] args) {
        Number3 converter = new Number3();
        System.out.println(converter.toBinary(25));
    }
}