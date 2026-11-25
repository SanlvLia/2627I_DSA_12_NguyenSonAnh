import java.util.*;

public class Pairs {
    public static int sol(int k, List<Integer> arr){
        int cnt = 0;
        Set<Long> hash = new HashSet<>();
        for(int x : arr){
            hash.add(x - 2l);
        }
        for(int x : arr){
            if(hash.contains((long)x)){
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(sc.nextInt());
        }
        System.out.println(sol(k, arr));
        sc.close();
    }
}
