
import java.util.Scanner;


public class Numbers {

    public static void main(String[] args) {

        System.out.println("Введите операцию:");

        Scanner sc = new Scanner(System.in);

        String num1 = sc.next();
        String oper = sc.next();
        String num2 = sc.next();

        Integer a = Integer.valueOf(num1);
        Integer b = Integer.valueOf(num2);

        switch (oper) {
            case "+":
                if (a <= 10 && a > 0 && b <= 10 && b > 0) {
                    System.out.println(a + b);
                } else {
                    System.out.println("Недопустимое числовое значение");
                }
                break;
            case "-":
                if (a <= 10 && a > 0 && b <= 10 && b > 0) {
                    System.out.println(a - b);
                } else {
                    System.out.println("Недопустимое числовое значение");
                }
                break;
            case "*":
                if (a <= 10 && a > 0 && b <= 10 && b > 0) {
                    System.out.println(a * b);
                } else {
                    System.out.println("Недопустимое числовое значение");
                }
                break;
            case "/":
                if (a <= 10 && a > 0 && b <= 10 && b > 0) {
                    System.out.println(a / b);
                } else {
                    System.out.println("Недопустимое числовое значение");
                }
                break;
            default:
                System.out.println("Такой операции не существует. Доступные операции: *, /, +, -");
        }






    }
}





















