/**
POH vol.8 「つり目」ゲットチャレンジ.
https://paiza.jp/poh/hatsukoi/challenge/hatsukoi_eye3
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] arg) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int p = new Integer(br.readLine());
        int q = p / 100;
        if (p>=1000) q+=10;
        System.out.println(q);
    }
}
