package calculator;
import java.util.*;

/**
 * CS 480 - Vajda 
 * Lab 3 
 * Last Update: 1 November 2016
 * @author Bryan Martinez
 */
public class ConvertToPostfix {

    /**
     * Simple method that converts infix to postfix
     * 
     * @param str string representation of a prefix equation
     * @return ArrayList of type String with seperated values 
     * in post fix form
     */
    public static ArrayList<String> convertToPostfix(String str){
        Stack<String> stack = new Stack();
        String[] preFix = str.split(" ");
        ArrayList<String> result = new ArrayList();
        char c;
        String value;
        
        for (int i=0; i < preFix.length; i++){
            c = preFix[i].charAt(0);
            value = preFix[i];
            
            //if value is an operand, add to output
            if (!(isValidOperator(c)))
                result.add(value);
            
            else{
                if (stack.isEmpty() || stack.peek().charAt(0) == '(' 
                        && c != ')')
                    stack.push(value);
                
                else if (c == '(')
                    stack.push(value);
                
                else if (c == ')'){
                    String next = stack.peek();
                    while (next.charAt(0) != '('){
                        if (next.charAt(0) == ')')
                            stack.pop();
                        else {
                            result.add(stack.pop());
                            next = stack.peek();
                        }
                    }
                    stack.pop();
                }
                    
                else if (getPriority(c) > getPriority(stack.peek().charAt(0)))
                    stack.push(value);
                
                else if (getPriority(c) == getPriority(stack.peek().charAt(0))){
                    result.add(stack.pop());
                    stack.push(value);
                }
                
                else if(getPriority(c) < getPriority(stack.peek().charAt(0))){
                    result.add(stack.pop());
                    i -= 1;
                }       
            }
        }

        //pop whatever is left in stack into result
        while (!stack.isEmpty())
            result.add(stack.pop());
        return result;
    }
    
    /**
     * Takes in a char and determines the priority for the 
     * postfix conversion
     * 
     * @param a char that represents a symbol
     * @return integer representing priority of char a
     */
    public static int getPriority(char a){
        switch (a){
            case '(':
            case ')':
                return 4; 
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
      
            default:
                return 1;
        }
    }
    
    /**
     * Check if the character is a supported operator
     * @param c character that represents operator
     * @return boolean
     */
    public static boolean isValidOperator(char c){
        if (c == '^' || c == '*' || c == '/' || c == '+' || c == '-' ||
                c == '(' || c == ')')
            return true;
        return false;
    }
    
    //Test the functionality of the postfix conversion.
    public static void main(String[] args){
        String test = "( ( ( ( 5 + 3 ) ) ) ) * ( ( 12 / 3 ) ) ";
        ArrayList<String> testPrint = convertToPostfix(test);
        for (String str : testPrint)
            System.out.print(str + " ");
    }
}
