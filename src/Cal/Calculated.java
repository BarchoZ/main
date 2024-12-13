package Cal;

import java.util.InputMismatchException;

class Calculated{


    static int calculated(int operand1, int operand2, char operation) {

        int resultCalculated = 1;
        if (operand1 < 0 || operand2 < 0|| operand1 > 10 || operand2 > 10){
            System.out.println("Возможно Вы ввели неверную операцию:\n > введены числа(-о), превышающие параметры установленного условия\n Попробуйте еще раз.");
        } else if (operation == '+' && 0 < operand1 && operand1 < 11 && 0 < operand2 && operand2 < 11) {
            resultCalculated = operand1 + operand2;
            return resultCalculated;


        } else if (operation == '-' && 0 < operand1 && operand1 < 11 && 0 < operand2 && operand2 < 11) {

            resultCalculated = operand1 - operand2;

            return resultCalculated;


        } else if (operation == '*' && 0 < operand1 && operand1 < 11 && 0 < operand2 && operand2 < 11) {
            resultCalculated = operand1 * operand2;
            return resultCalculated;

        } else if (operation == '/' || 0 < operand1 || operand1 < 11 || 0 < operand2 || operand2 < 11 || operand2 != 0) {



            try {
                resultCalculated = operand1 / operand2;
            } catch (Exception e) {
                System.out.println("На 0 делить нельзя. Начните сначала.");
            }


            return resultCalculated;

        }
        return resultCalculated;
    }


}
