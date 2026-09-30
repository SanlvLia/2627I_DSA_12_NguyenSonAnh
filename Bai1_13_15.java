import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Bai1_13_15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> q = new ArrayDeque<>();
        int n = sc.nextInt();
        int k= sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=n;i++){
            String s = sc.next();
            q.add(s);
            while(q.size()>k && !q.isEmpty()) q.poll();
        }
        System.out.println();
        System.out.println(q.peek());
        sc.close();
    }
}