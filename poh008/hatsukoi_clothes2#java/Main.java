/**
POH vol.8 「Cute衣装」ゲットチャレンジ.
https://paiza.jp/poh/hatsukoi/challenge/hatsukoi_clothes2
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] arg) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().trim().split(" ");
        int n = new Integer(in[0]);
        int m = new Integer(in[1]);
        if (m%n == 0 ) System.out.println("ok");
        else System.out.println("ng");
    }
}
