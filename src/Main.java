
import java.util.Scanner;


public class Main {

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


        //ОХУЕННО ЧИСЛОВОЙ КАЛЬКУЛЯТОР РАБОТАЕТ ЗАЕБИСЬ ДВИГАЕМСЯ ДАЛЬШЕ ПО РИМСКИМ



    }
}









        /* String num1 = sc.next();//первая переменная
        String oper = sc.next();//стринг опер нормально считывает знаки, поэтому мы ее можем расписать как switch case
        String num2 = sc.next();//вторая переменная
        int a = 0;

        switch (num1) {                                  //считываем первое число
            case "1":
                Integer ar1_1 = Integer.valueOf(num1);
                break;
            case "2":
                Integer ar1_2 = Integer.valueOf(num1);
                break;
            case "3":
                Integer ar1_3 = Integer.valueOf(num1);
                break;
            case "4":
                Integer ar1_4 = Integer.valueOf(num1);
                break;
            case "5":
                Integer ar1_5 = Integer.valueOf(num1);
                break;
            case "6":
                Integer ar1_6 = Integer.valueOf(num1);
                break;
            case "7":
                Integer ar1_7 = Integer.valueOf(num1);
                break;
            case "8":
                Integer ar1_8 = Integer.valueOf(num1);
                break;
            case "9":
                Integer ar1_9 = Integer.valueOf(num1);
                break;
            case "10":
                Integer ar11_0 = Integer.valueOf(num1);
                break;
            case "I":
                Integer rim11 = Integer.valueOf(num1);
                break;
            case "II":
                Integer rim12 = Integer.valueOf(num1);
                break;
            case "III":
                Integer rim13 = Integer.valueOf(num1);
                break;
            case "IV":
                Integer rim14 = Integer.valueOf(num1);
                break;
            case "V":
                Integer rim15 = Integer.valueOf(num1);
                break;
            case "VI":
                Integer rim16 = Integer.valueOf(num1);
                break;
            case "VII":
                Integer rim17 = Integer.valueOf(num1);
                break;
            case "VIII":
                Integer rim18 = Integer.valueOf(num1);
                break;
            case "IX":
                Integer rim19 = Integer.valueOf(num1);
                break;
            case "X":
                Integer rim110 = Integer.valueOf(num1);
                break;
            default:
                System.out.println("Первое число не поддерживается ");
        }


        switch (num2) {                                     // считываем второе число
            case "1":
                Integer ar2_1 = Integer.valueOf(num2);
                break;
            case "2":
                Integer ar2_2 = Integer.valueOf(num2);
                break;
            case "3":
                Integer ar2_3 = Integer.valueOf(num2);
                break;
            case "4":
                Integer ar2_4 = Integer.valueOf(num2);
                break;
            case "5":
                Integer ar2_5 = Integer.valueOf(num2);
                break;
            case "6":
                Integer ar2_6 = Integer.valueOf(num2);
                break;
            case "7":
                Integer ar2_7 = Integer.valueOf(num2);
                break;
            case "8":
                Integer ar2_8 = Integer.valueOf(num2);
                break;
            case "9":
                Integer ar2_9 = Integer.valueOf(num2);
                break;
            case "10":
                Integer ar2_10 = Integer.valueOf(num2);
                break;
            case "I":
                Integer rim2_1 = Integer.valueOf(num2);
                break;
            case "II":
                Integer rim2_2 = Integer.valueOf(num2);
                break;
            case "III":
                Integer rim2_3 = Integer.valueOf(num2);
                break;
            case "IV":
                Integer rim2_4 = Integer.valueOf(num2);
                break;
            case "V":
                Integer rim2_5 = Integer.valueOf(num2);
                break;
            case "VI":
                Integer rim2_6 = Integer.valueOf(num2);
                break;
            case "VII":
                Integer rim2_7 = Integer.valueOf(num2);
                break;
            case "VIII":
                Integer rim2_8 = Integer.valueOf(num2);
                break;
            case "IX":
                Integer rim2_9 = Integer.valueOf(num2);
                break;
            case "X":
                Integer rim2_10 = Integer.valueOf(num2);
                break;
            default:
                System.out.println("Второе число не поддерживается ");
        }
*/











