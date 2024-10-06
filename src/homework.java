import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int health = scanner.nextInt();
        scanner.close();

        int count = 0;
        int consecutiveHits = 0;

        while (health > 0) {
            count++;
            consecutiveHits++;
            health -= 2;

            if (consecutiveHits == 3) {
                health -= 10;
                consecutiveHits = 0;
            }

            if (health <= 0) {
                break;
            }
        }

        System.out.println(count);
    }
}