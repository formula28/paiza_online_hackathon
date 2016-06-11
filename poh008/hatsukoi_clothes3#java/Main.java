/**
POH vol.8 「Sexy衣装」ゲットチャレンジ.
https://paiza.jp/poh/hatsukoi/challenge/hatsukoi_clothes3
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] arg) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().trim().split(" ");
        int m = new Integer(in[0]);
        int n = new Integer(in[1]);
        System.out.println(m>n?m-n:0);
    }
}