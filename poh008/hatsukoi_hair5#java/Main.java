/**
POH vol.8 「ツインテール」ゲットチャレンジ.
https://paiza.jp/poh/hatsukoi/challenge/hatsukoi_hair5
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] arg) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = new Integer(br.readLine());
        int t = new Integer(br.readLine());
        char[] a = new char[s];
        for (int i=0;i<s;i++) a[i] = i == t-1?'+':'-';
        System.out.println(a);
    }
}