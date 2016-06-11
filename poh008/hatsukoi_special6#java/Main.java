/**
POH vol.8 「カチューシャ」ゲットチャレンジ.
https://paiza.jp/poh/hatsukoi/challenge/hatsukoi_special6
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] arg) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().trim().split(" ");
        String[] in2 = br.readLine().trim().split(" ");
        int n = new Integer(in[0]);
        int p = new Integer(in[1]);
        int m = new Integer(in2[0]);
        int q = new Integer(in2[1]);
        System.out.println(n*p+((n-1)/m+1)*q);
    }
}
