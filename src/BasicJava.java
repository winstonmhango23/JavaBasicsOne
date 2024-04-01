public class BasicJava {
    public  void basicJava(String[] args) {
//        main method body
        System.out.println("Hello world!");
        System.out.println();
        /*
        System.out.println(10 + 20);
        System.out.println("another method");
         */

//        Variables
/*
 primitives (store simple values)
 [boolean, byte, short, char, int, long, float, double]
 */
        int number1 = 20;
        int number2 = 10;
        int result = number1 + number2;
        System.out.println(result);

        double pi = 3.14;
        boolean isMale = true;
        char a = 'A';

        byte n = 120;
//        byte b =200; this wont work..value too big to be stored in byte!
        short m = 32000;
//        short k = 40000;this won't work...value too big to be stored in short data type
        int bigInteger = 400000000;
//        add underscores for readability
        int readableBigInteger = 400_000_000;
        System.out.println(readableBigInteger);

        double readableBigDouble = 3000_000_000.00;
        System.out.println(readableBigDouble);

//        arithmetic operations
        int numberOne = 20;
        int numberTwo =10;
        int numberThree = 9;

        System.out.println(numberOne + numberTwo);
        System.out.println(numberOne - numberTwo);
        System.out.println(numberOne / numberTwo);
        System.out.println(numberOne * numberTwo);
        System.out.println(numberOne % numberThree);

//        BODMAS
        /*
        B-Brackets
        O Orders (powers/indices or roots)
        D-Division
        M-Multiplication
        A-Addition
        S-Subtraction
         */
        System.out.println((2+3) * (5/1) * 5);
    }
}


