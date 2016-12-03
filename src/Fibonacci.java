/**
 * Created by vano on 4.12.16.
 */
public class Fibonacci {

    private static final int COUNT = 12;

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        for(int i = 0; i < COUNT; i++ ) {
            System.out.println("fibonacci(" + i + ")=" + fibonacci.fibonacci(i));
        }
        System.out.println("=================");
        fibonacci.fibonacci(-1);

    }

    private int fibonacci(int i) {
        if(i < 0) {
            throw new IllegalArgumentException("Wrong argument: " +i);
        } else if(i == 0) {
            return 0;
        } else if (i == 1) {
            return 1;
        } else {
            return fibonacci(i - 1) + fibonacci(i - 2);
        }
    }
}
