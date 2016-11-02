package calculator;
import static calculator.ConvertToPostfix.convertToPostfix;
import java.util.*;

/**
 * CalculatePostfix.java
 * CS 480 - Vajda 
 * Lab 3 
 * Last Update: 1 November 2016
 * @author Bryan Martinez
 */
public class CalculatePostfix {
    
    /**
     * Solve simple expressions given in postfix notation
     * @param eq equation in postfix notation to be evaluated
     * @return result of operations
     */
    public static Double evaluateExpression(ArrayList<String> eq){
        Stack<String> stack = new Stack();
        char c;
        double op1, op2;
        String e;       //hold arraList element
        double value;
        for (int i =0; i < eq.size(); i++){
            c = eq.get(i).charAt(0);
            e = eq.get(i);
            
            //if c is an operand, push to stack
            if (!ConvertToPostfix.isValidOperator(c)){
                stack.push(e);
            }
            else{//c is an operator
                op2 = Double.parseDouble(stack.pop());
                op1 = Double.parseDouble(stack.pop());
                value = getResult(op1, op2, c);
                stack.push(Double.toString(value));
            }
        }
        
        value = Double.parseDouble(stack.pop());
        return value;
    }
    
    /**
     * Evaluates small expressions.
     * @param a first number to be evaluated
     * @param b second number
     * @param op operator to be used
     * @return result of a with b evaluated with the operator op
     */
    public static double getResult (double a, double b, char op){
        double result = 0.0;
        switch (op){
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '^':
                result = Math.pow(a, b);
        }
        return result;
    }
    
    //Quick semantics check
    public static void main(String[] args){
        String test = "( ( ( ( 5 ^ ( 9 / 3 ) ) ) ) ) + ( ( 12 * 3 ) ) ";
        ArrayList<String> testPrint = ConvertToPostfix.convertToPostfix(test);
        double result = evaluateExpression(testPrint);
        System.out.println(result);
    }
}
