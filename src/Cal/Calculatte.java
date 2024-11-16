package Cal;


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


            ConversionArabianToRoman conversionA = new ConversionArabianToRoman();
            ConversionRomanToArabian conversionR = new ConversionRomanToArabian();

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

            String[] blacks = under_charString.split(" ");
            String string03 = null;
            String string04 = null;
            try {
                String stable00 = blacks[0];
                String stable01 = blacks[1];
                String stable02 = blacks[2];
                string03 = stable00.trim();
                string04 = stable02.trim();
            } catch (Exception e) {
                String message = e.getMessage();
                message = "Введенное Вами не является числовой операцией";
                System.out.println(message);
            }

            if (operand1 < 0 && operand2 < 0) {
                System.out.println("-Иллюзии, мистер Андерсон, причуды восприятия.\"\n Отрицательные числа не допускаются. Попробуйте еще раз.");
            } else {

                if (under_charString.contains("I") || under_charString.contains("II") || under_charString.contains("III") ||
                        under_charString.contains("IV") || under_charString.contains("V") || under_charString.contains("VI") ||
                        under_charString.contains("VII") || under_charString.contains("VIII") || under_charString.contains("IX") ||
                        under_charString.contains("X")) {


                    operand1 = conversionR.romanToArabian(string03);
                    operand2 = conversionR.romanToArabian(string04);

                    resultOperation = Calculated.calculated(operand1, operand2, operation);
                    System.out.println("---Результат для римских цифр----");
                    String resultRoman = conversionA.arabianToRoman(resultOperation);
                    System.out.println(string03 + " " + operation + " " + string04 + " = " + resultRoman);


                } else if (under_charString.contains("1") || under_charString.contains("2") || under_charString.contains("3") ||
                        under_charString.contains("4") || under_charString.contains("5") || under_charString.contains("6") ||
                        under_charString.contains("7") || under_charString.contains("8") || under_charString.contains("9") ||
                        under_charString.contains("10")) {


                    operand1 = Integer.parseInt(string03);
                    operand2 = Integer.parseInt(string04);

                    resultOperation = Calculated.calculated(operand1, operand2, operation);
                    System.out.println("--Результат для арабских цифр----");
                    System.out.println(operand1 + " " + operation + " " + operand2 + " = " + resultOperation);

                } else {
                    System.out.println("-Иллюзии, мистер Андерсон, причуды восприятия.\" Попробуйте еще раз.");
                }
            }

        }


    }


}






