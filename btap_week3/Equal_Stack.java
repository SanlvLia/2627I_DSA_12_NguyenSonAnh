import java.util.Scanner;

public class Equal_Stack {
    public static void main(String[] args) {
        int res=0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int [] aa = new int[a+2];
        int [] bb = new int[b+2];
        int [] cc = new int[c+2];
        for(int i=1;i<=a;i++) aa[i] =sc.nextInt();
        for(int i=1;i<=b;i++) bb[i] =sc.nextInt();
        for(int i=1;i<=c;i++) cc[i] =sc.nextInt();
        aa[a+1]=0;bb[b+1]=0;cc[c+1]=0;
        for(int i=a;i>=1;i--) aa[i]=aa[i+1]+aa[i];
        for(int i=b;i>=1;i--) bb[i]=bb[i+1]+bb[i];
        for(int i=c;i>=1;i--) cc[i]=cc[i+1]+cc[i];
        int i=a,j=b,k=c;
        while(i>=0 && j>=0 && k>=0){
            if(aa[i]==bb[j] && bb[j]==cc[k]){
                res=Math.max(res, aa[i]);
                i--; j--; k--;
            }
            else{
                int mi=Math.min(aa[i],Math.min(bb[j],cc[k]));
                if(mi==aa[i]) i--;
                if(mi==bb[j]) j--;
                if(mi==cc[k]) k--;
            }
        }
        System.out.println(res);
    }
}
