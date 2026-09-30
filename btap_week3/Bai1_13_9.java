
import java.util.Scanner;
import java.util.Stack;

public class Bai1_13_9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<String> s1 = new Stack<>();
        Stack<String> s2 = new Stack<>();
        int n = s.length();
        String val = "";
        for (int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(c == ' ') continue;
            if(c >= '0' && c <= '9')
                val += c;
            else{
                if(!val.isEmpty()){
                    s1.push(val);
                    val = "";
                }
                if(c == '+' || c == '-' || c == '*' || c == '/'){
                    s2.push(String.valueOf(c));
                }
                else if(c == ')'){
                    String val2 = s1.pop();
                    String val1 = s1.pop();
                    String op = s2.pop();
                    String res = "( " + val1 + " " + op + " " + val2 + " )";
                    s1.push(res);
                }
            }
        }
        System.out.println();
        if(!s1.empty()) System.out.println(s1.pop());
        sc.close();
    }
}