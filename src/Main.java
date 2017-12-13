import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int n = scanner.nextInt();
        System.out.println("Случайное число из отрезка " + -n + " и " + n + " " +"равно "+ ((int) (Math.random() * n) - n));
    }
}
