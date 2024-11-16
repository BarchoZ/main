package Cal;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Calculatte {

    static Scanner scanner = new Scanner(System.in);
    static int operand1;
    static char operation;
    static int operand2;
    static int resultOperation;

    public static void main(String[] args) {

        while (true) {

            System.out.println("Используя арабские (от 1 до 10) или римские (от I до X) числа,\n введите операцию с двумя операндами: ");



            Conversion conversion1 = new Conversion();
            Calculated calculated = new Calculated();

            String userInput = scanner.nextLine();

            char[] under_char = new char[10];

            for (int i = 0; i < userInput.length(); i++) {
                under_char[i] = userInput.charAt(i);
                if (under_char[i] == '+') {
                    operation = '+';
                }
                if (under_char[i] == '-') {
                    operation = '-';
                }
                if (under_char[i] == '*') {
                    operation = '*';
                }
                if (under_char[i] == '/') {
                    operation = '/';
                }
            }
            String under_charString = String.valueOf(under_char);
            String[] blacks = under_charString.split("[+-/*]");
            String stable00 = blacks[0];
            String stable01 = blacks[1];
            String string03 = stable01.trim();
            operand1 = conversion1.romanToArabian(stable00);
            operand2 = conversion1.romanToArabian(string03);
            if (operand1 < 0 && operand2 < 0) {
                resultOperation = 0;
            } else {
                resultOperation = Calculated.calculated(operand1, operand2, operation);
                System.out.println("---Результат для римских цифр----");
                String resultRoman = conversion1.arabianToRoman(resultOperation);
                System.out.println(stable00 + " " + operation + " " + string03 + " = " + resultRoman);
            }
            operand1 = Integer.parseInt(stable00);
            operand2 = Integer.parseInt(string03);
            resultOperation = Calculated.calculated(operand1, operand2, operation);
            System.out.println("--Результат для арабских цифр----");
            System.out.println(operand1 + " " + operation + " " + operand2 + " = " + resultOperation);


        }


    }

}



