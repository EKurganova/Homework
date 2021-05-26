import java.util.Scanner;




public class Calculator {

    public static void main(String[] args) {
        System.out.print("Введите число х ");
        Scanner x = new Scanner(System.in);
        System.out.println("y = " + (x.nextInt() * 5 + 3));
    }
}
