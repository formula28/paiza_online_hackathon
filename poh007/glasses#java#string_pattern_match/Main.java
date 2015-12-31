/**
POH vol.7 「めがね」ゲットチャレンジ.
2次元配列パターンマッチ.
文字列のパターンマッチを利用した解法.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // NxN画像の読み込み.
        int N = Integer.parseInt(br.readLine());
        for (int i=0;i<N;i++) sb.append(br.readLine().replace(" ", ""));
        String q = sb.toString();
        // MxMパターンの読み込み.
        int M = Integer.parseInt(br.readLine());
        String w = String.format(".{%d}",N-M);
        sb = new StringBuilder();
        sb.append(br.readLine().replace(" ", ""));
        for (int i=1;i<M;i++) {
            sb.append(w);
            sb.append(br.readLine().replace(" ", ""));
        }
        String p = sb.toString();
        // パターンマッチ.
        Pattern pat = Pattern.compile(p);
        Matcher m = pat.matcher(q);
        m.find();
        // マッチ位置取得し,出力.
        int x = m.start();
        System.out.printf("%d %d",x/N,x%N);
    }
}
