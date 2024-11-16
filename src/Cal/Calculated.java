package Cal;

import java.util.InputMismatchException;

class Calculated{


    static int calculated(int operand1, int operand2, char operation) {

        int resultCalculated = 0;
        if (resultCalculated == 0){
            System.out.println("Возможно Вы ввели неверную операцию:\n введены числа(-о), превышающие параметры установленного условия\n и/или\n Вы попытались произвести деление на 0.\n Попробуйте еще раз.   ");
        }


        if (operation == '+' && 0 < operand1 && operand1 < 11 && 0 < operand2 && operand2 < 11) {
            resultCalculated = operand1 + operand2;
            return resultCalculated;


        } else if (operation == '-' && 0 < operand1 && operand1 < 11 && 0 < operand2 && operand2 < 11) {
            resultCalculated = operand1 - operand2;
            return resultCalculated;


        } else if (operation == '*' && 0 < operand1 && operand1 < 11 && 0 < operand2 && operand2 < 11) {
            resultCalculated = operand1 * operand2;
            return resultCalculated;

        } else if (operation == '/' && 0 < operand1 && operand1 < 11 && 0 < operand2 && operand2 < 11) {

            try {

                resultCalculated = operand1 / operand2;

            } catch (ArithmeticException | InputMismatchException e) {
                System.out.println("ArithmeticException : " + e);
                System.out.println("Разрешены только целые ненулевые параметры");

            }

            return resultCalculated;

        }
        return resultCalculated;
    }


}
