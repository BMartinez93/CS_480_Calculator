package calculator;
import java.util.*;

/**
 * ConvertToPostfix.java
 * CS 480 - Vajda 
 * Lab 3 
 * Last Update: 3 November 2016
 * @author Bryan Martinez
 */
public class ConvertToPostfix {

    /**
     * Simple method that converts infix to postfix
     * 
     * @param str string representation of a prefix equation
     * @return ArrayList of type String with separated values 
     * in post fix form
     */
    public static ArrayList<String> convertToPostfix(String str){
        Stack<String> stack = new Stack();
        String[] temp = str.split(" ");//splits on every single character
        String temp2 = pasteLongNumbers(temp);//join single digits into numbers
        String[] preFix = temp2.split(" ");
        
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
                else{}
            }
        }

        //pop whatever is left in stack into result
        while (!stack.isEmpty())
            result.add(stack.pop());
        return result;
    }
    
    /**
     * Pastes together separated digits into single strings
     * @param exp separated string expression to evaluate
     * @return string with correctly grouped numbers
     */
    public static String pasteLongNumbers(String[] exp) {
        StringBuilder tempNum = new StringBuilder();
        StringBuilder newExp = new StringBuilder();
        
        for (int i = 0; i < exp.length; i++){
            if ((isDigit(exp[i])) && (i < exp.length-1))
                tempNum.append(exp[i]);
            else if (!isDigit(exp[i]) && tempNum.length() != 0){
                newExp.append(tempNum.toString() + " ");
                newExp.append(exp[i] + " ");
                tempNum.delete(0, tempNum.length());
            }
            else if ((isDigit(exp[i])) && (i == exp.length-1))
                newExp.append(exp[i] + " ");
            else
                newExp.append(exp[i] + " ");      
        }
        
        return newExp.toString();
    }
 
    /**
     * Checks if a string is an integer
     * @param str string to check
     * @return boolean if int or not
     */
    public static boolean isDigit(String str){
        try{
            int i = Integer.parseInt(str);
        }
        catch (NumberFormatException e){
            return false;
        }
        return true;
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
    /**
    public static void main(String[] args){
        String test = "1 2 / 4 ";
        ArrayList<String> testPrint = convertToPostfix(test);
        for (String str : testPrint)
            System.out.print(str + " ");
    } 
    */
}
