import java.util.Scanner;




public class Calculator {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in); // создаем объект и указываем, откуда объект будет брать файлы
        int x = console.nextInt(); // читаем число и записываем его в переменную
        int y = x * 5 + 3;
        System.out.println(y);
    }
}
