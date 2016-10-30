package calculator;
import java.util.Stack;

/**
 *
 * @author Dasmann
 */
public class ConvertToPostfix {
    
    public static String convertToPostfix(String str){
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        char c;
        
        for (int i=0; i < str.length(); i++){
            c = str.charAt(i);
            
            if (!(isValidOperator(c)))
                result.append(c);
            else{
                if (stack.isEmpty() || stack.peek() == '(')
                    stack.push(c);
                
                else if (c == '(')
                    stack.push(c);
                
                else if (c == ')'){
                    char next = stack.peek();
                    while (next != '('){
                        if (next == ')')
                            stack.pop();
                        else {
                            result.append(stack.pop());
                            next = stack.peek();
                        }
                    }
                    stack.pop();
                }
                    
                else if (getPriority(c) > getPriority(stack.peek()))
                    stack.push(c);
                
                else if (getPriority(c) == getPriority(stack.peek())){
                    result.append(stack.pop());
                    stack.push(c);
                }
                
                else if(getPriority(c) < getPriority(stack.peek())){
                    //while (!stack.isEmpty())
                    result.append(stack.pop());
                    i -= 1;
                }
                    
            }
            
        }

        while (!stack.isEmpty())
            result.append(stack.pop());
        return result.toString();
    }
    
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
    
    public static boolean isValidOperator(char c){
        if (c == '^' || c == '*' || c == '/' || c == '+' || c == '-' ||
                c == '(' || c == ')')
            return true;
        return false;
    }
    
    public double calculatePostfix(String str){
        
        return 0.0;
    }
    
    public static void main(String[] args){
        String test = "A*(B+C*D)*(F+E)";
        
        System.out.println(convertToPostfix(test));
    }
}
