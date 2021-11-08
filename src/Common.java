import java.util.Scanner;

public class Common {

    public static void main(String[] args) {

        int a = 0, b = 0, c = 0;

        String inttorom = "";
        System.out.println("Введите операцию:");

        Scanner sc = new Scanner(System.in);

        String num1 = sc.next();
        String oper = sc.next();
        String num2 = sc.next();

        if ((num1.equals("I") || num1.equals("II") || num1.equals("III") || num1.equals("IV") || num1.equals("V") || num1.equals("VI") || num1.equals("VII") || num1.equals("VIII") || num1.equals("IX") || num1.equals("X")) && (num2.equals("I") || num2.equals("II") || num2.equals("III") || num2.equals("IV") || num2.equals("V") || num2.equals("VI") || num2.equals("VII") || num2.equals("VIII") || num2.equals("IX") || num2.equals("X"))) {

            switch (num1) {
                case "I":
                    a = 1;
                    break;
                case "II":
                    a = 2;
                    break;
                case "III":
                    a = 3;
                    break;
                case "IV":
                    a = 4;
                    break;
                case "V":
                    a = 5;
                    break;
                case "VI":
                    a = 6;
                    break;
                case "VII":
                    a = 7;
                    break;
                case "VIII":
                    a = 8;
                    break;
                case "IX":
                    a = 9;
                    break;
                case "X":
                    a = 10;
                    break;
                default:
                    System.out.println("Первое число не поддерживается ");
            }

            switch (num2) {
                case "I":
                    b = 1;
                    break;
                case "II":
                    b = 2;
                    break;
                case "III":
                    b = 3;
                    break;
                case "IV":
                    b = 4;
                    break;
                case "V":
                    b = 5;
                    break;
                case "VI":
                    b = 6;
                    break;
                case "VII":
                    b = 7;
                    break;
                case "VIII":
                    b = 8;
                    break;
                case "IX":
                    b = 9;
                    break;
                case "X":
                    b = 10;
                    break;
                default:
                    System.out.println("Второе число не поддерживается ");
            }

                    switch (oper) {
                        case "+":
                            c = a+b;

                            break;
                        case "-":
                            if (a>b) {
                                c = a-b;
                            } else {
                                System.out.println("Результатом работы калькулятора с римскими числами могут быть только положительные числа");
                            }

                            break;
                        case "*":
                            c = a*b;

                            break;
                        case "/":
                            c = a/b;

                            break;
                        default:
                            System.out.println("Такой операции не существует. Доступные операции: *, /, +, -");
                    }


                    String s = "";


                    while (c >= 100) {
                        inttorom += "C";
                        c -= 100;
                    }
                    while (c >= 90) {
                        inttorom += "XC";
                        c -= 90;
                    }
                    while (c >= 50) {
                        inttorom += "L";
                        c -= 50;
                    }
                    while (c >= 40) {
                        inttorom += "XL";
                        c -= 40;
                    }
                    while (c >= 10) {
                        inttorom += "X";
                        c -= 10;
                    }
                    while (c >= 9) {
                        inttorom += "IX";
                        c -= 9;
                    }
                    while (c >= 5) {
                        inttorom += "V";
                        c -= 5;
                    }
                    while (c >= 4) {
                        inttorom += "IV";
                        c -= 4;
                    }
                    while (c >= 1) {
                        inttorom += "I";
                        c -= 1;
                    }

                    System.out.println(inttorom);
            }    else if ((num1.equals("I") || num1.equals("II") || num1.equals("III") || num1.equals("IV") || num1.equals("V") || num1.equals("VI") || num1.equals("VII") || num1.equals("VIII") || num1.equals("IX") || num1.equals("X")) && (num2.equals("1") || num2.equals("2") || num2.equals("3") || num2.equals("4") || num2.equals("5") || num2.equals("6") || num2.equals("7") || num2.equals("8") || num2.equals("9") || num2.equals("10"))) {

            System.out.println("Оба числа должны быть из одной системы счисления");
        } else if ((num1.equals("1") || num1.equals("2") || num1.equals("3") || num1.equals("4") || num1.equals("5") || num1.equals("6") || num1.equals("7") || num1.equals("8") || num1.equals("9") || num1.equals("10")) && (num2.equals("I") || num2.equals("II") || num2.equals("III") || num2.equals("IV") || num2.equals("V") || num2.equals("VI") || num2.equals("VII") || num2.equals("VIII") || num2.equals("IX") || num2.equals("X"))) {
            System.out.println("Оба числа должны быть из одной системы счисления");
        } else if ((num1.equals("1") || num1.equals("2") || num1.equals("3") || num1.equals("4") || num1.equals("5") || num1.equals("6") || num1.equals("7") || num1.equals("8") || num1.equals("9") || num1.equals("10")) && (num2.equals("1") || num2.equals("2") || num2.equals("3") || num2.equals("4") || num2.equals("5") || num2.equals("6") || num2.equals("7") || num2.equals("8") || num2.equals("9") || num2.equals("10"))) {

        Integer ch1 = Integer.valueOf(num1);
        Integer ch2 = Integer.valueOf(num2);

        switch (oper) {
            case "+":
                if (ch1 <= 10 && ch1 > 0 && ch2 <= 10 && ch2 > 0) {
                    System.out.println(ch1 + ch2);
                } else {
                    System.out.println("Недопустимое числовое значение");
                }
                break;
            case "-":
                if (ch1 <= 10 && ch1 > 0 && ch2 <= 10 && ch2 > 0) {
                    System.out.println(ch1 - ch2);
                } else {
                    System.out.println("Недопустимое числовое значение");
                }
                break;
            case "*":
                if (ch1 <= 10 && ch1 > 0 && ch2 <= 10 && ch2 > 0) {
                    System.out.println(ch1 * ch2);
                } else {
                    System.out.println("Недопустимое числовое значение");
                }
                break;
            case "/":
                if (ch1 <= 10 && ch1 > 0 && ch2 <= 10 && ch2 > 0) {
                    System.out.println(ch1 / ch2);
                } else {
                    System.out.println("Недопустимое числовое значение");
                }
                break;
            default:
                System.out.println("Такой операции не существует. Доступные операции: *, /, +, -");
        }
        } else {
            System.out.println("Недопустимое выражение");
        }

    }
}
