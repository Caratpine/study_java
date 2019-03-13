package generics;

public class Java8Tester {

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void saidMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    public static void main(String[] args) {
        Java8Tester tester = new Java8Tester();

        MathOperation addition = (int a, int b) -> a + b;

        MathOperation subtraction = (a, b) -> a - b;

        MathOperation multiplication = (int a, int b) -> {return a * b;};

        MathOperation division = (int a, int b) -> a / b;

        System.out.println(tester.operate(10, 5, addition));
        System.out.println(tester.operate(10, 5, subtraction));
        System.out.println(tester.operate(10, 5, multiplication));
        System.out.println(tester.operate(10, 5, division));

    }
}
