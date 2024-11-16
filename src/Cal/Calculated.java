package Cal;

import java.util.InputMismatchException;

class Calculated{


    static int calculated(int operand1, int operand2, char operation) {

        int resultCalculated = 0;


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
                System.out.println("Exception : " + e);
                System.out.println("Only integer non-zero parameters allowed");

            }

            return resultCalculated;

        }
        return resultCalculated = 0;
    }


}
