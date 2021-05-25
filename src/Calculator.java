import java.util.Scanner;




public class Calculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        int y = x * 5 + 3;
        System.out.println(y);
    }
}
