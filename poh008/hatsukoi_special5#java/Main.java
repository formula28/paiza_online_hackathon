/**
POH vol.8 「マイク」ゲットチャレンジ.
https://paiza.jp/poh/hatsukoi/challenge/hatsukoi_special5
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] arg) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = new Integer(br.readLine());
        int m = new Integer(br.readLine());
        System.out.println((m-1)/(n*2)+1);
    }
}