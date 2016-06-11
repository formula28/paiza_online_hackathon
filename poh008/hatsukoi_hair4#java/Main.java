/**
POH vol.8 「ポニーテール」ゲットチャレンジ.
https://paiza.jp/poh/hatsukoi/challenge/hatsukoi_hair4
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] arg) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in;
        int a = 0;
        for (int i=0;i<5;i++) {
            in = br.readLine().trim().split(" ");
            if (in[0].equals(in[1])) a++;
        }
        if (a>2) System.out.println("OK");
        else System.out.println("NG");
    }
}