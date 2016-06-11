/**
POH vol.8 「ロングヘア」ゲットチャレンジ.
https://paiza.jp/poh/hatsukoi/challenge/hatsukoi_hair3
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = new Integer(br.readLine());
        if (n % 7 == 0) System.out.println("lucky");
        else System.out.println("unlucky");
    }
}
