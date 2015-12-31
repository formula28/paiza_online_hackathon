/**
POH vol.7 「水着」ゲットチャレンジ.
階乗の計算結果10進数の部分抽出.
かける数を事前に割る解法.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] a) throws Exception {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        int i,j,n=new Integer(b.readLine());
        long x=1L;
        for(i=2;i<=n;i++){
            j=i;
            while(j%10==0)j/=10;
            while(j%5==0){j/=5;x/=2;}
            x*=(long)j;
            x%=1000000000000L;
        }
        System.out.println(x%1000000000L);
    }
}
