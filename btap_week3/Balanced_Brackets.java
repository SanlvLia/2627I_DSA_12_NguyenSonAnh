
import java.util.Scanner;
import java.util.Stack;

public class Balanced_Brackets {
    static String check(String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            Character c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{') st.push(c);
            else if(!st.isEmpty()){
                if(c == ')' && st.peek() == '(') st.pop();
                else if(c == ']' && st.peek() == '[') st.pop();
                else if(c == '}' && st.peek() == '{') st.pop();
                else return "NO";
            }
            else return "NO";
        }
        if(st.isEmpty()) return "YES";
        else return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(check(s));
    }
}
