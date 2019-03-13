package generics;

public class Java8Tester {

    private final static String salutation = "fff";

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

        GreetingService greetingService = message -> {
            System.out.println("Hello " + message);
        };

        GreetingService greetingService1 = (message) -> {
            System.out.println("Hello " + message);
        };

        GreetingService greetingService2 = message ->
                System.out.println(salutation + message);

        greetingService.saidMessage("world");
        greetingService1.saidMessage("google");
        greetingService2.saidMessage("facebook");
    }
}
