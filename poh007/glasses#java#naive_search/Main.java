/**
POH vol.7 「めがね」ゲットチャレンジ.
素朴な解法.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] a) throws Exception {
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        char[] q,p;
        int i,k,N,M;

        // NxN画像の読み込み.
        N=new Integer(r.readLine());
        q=new char[N*N];
        for(i=0;i<N*N;i+=(q[i]=='0'||q[i]=='1'?1:0))q[i]=(char)r.read();
        r.readLine();
        // MxMパターンの読み込み.
        M=new Integer(r.readLine());
        p=new char[M*M];
        for(i=0;i<M*M;i+=(p[i]=='0'||p[i]=='1'?1:0))p[i]=(char)r.read();
        // 探索.
        boolean f;
        for(i=0;i<N*N;i+=(i%N==N-M?M:1)){
            f=true;
            for(k=0;k<M*M;k++){
                if(q[i+k/M*N+k%M]!=p[k]){
                    f=false;
                    break;
                }
            }
            if(f){
                System.out.print(i/N+" "+i%N);
                return;
            }
        }
    }
}
