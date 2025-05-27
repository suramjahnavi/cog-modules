public class TypeCastingExample {
    public static void main(String[] args) {
        double myDouble = 9.78;
        int myInt = (int) myDouble;  // double to int

        int anotherInt = 100;
        double anotherDouble = (double) anotherInt; // int to double

        System.out.println("Double value: " + myDouble);
        System.out.println("Casted to int: " + myInt);
        System.out.println("Int value: " + anotherInt);
        System.out.println("Casted to double: " + anotherDouble);
    }
}