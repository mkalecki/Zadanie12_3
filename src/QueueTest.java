import java.util.*;

public class QueueTest {

    public static void main(String[] args) {

        Queue<Integer> numbers = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Podaj liczbę:");
            numbers.offer(scanner.nextInt());
        }

        String components = String.valueOf(numbers.peek());
        int sum = numbers.poll();
        do {
            components = components + " + " + String.valueOf(numbers.peek());
            sum = sum + numbers.poll();
        } while (!numbers.isEmpty());

        System.out.println(components + " = " + sum);

    }
}
