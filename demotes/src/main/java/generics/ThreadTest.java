package generics;

public class ThreadTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(() -> {
                System.out.println(Thread.currentThread().getName());
            });
            t.start();
        }
    }
}
