/**
POH vol.8 「たれ目」ゲットチャレンジ.
https://paiza.jp/poh/hatsukoi/challenge/hatsukoi_eye2
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] arg) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().trim().split(" ");
        int s = new Integer(in[0]);
        int n = new Integer(in[1]);
        if (s >= n) System.out.println("OK");
        else System.out.println("NG");
    }
}
