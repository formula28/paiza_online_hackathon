/**
POH vol.8 「ショートヘア」ゲットチャレンジ.
https://paiza.jp/poh/hatsukoi/challenge/hatsukoi_hair2
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] arg) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = new Integer(br.readLine());
        String s = br.readLine();
        for (int i=0;i<n;i++) System.out.println(s);
    }
}
