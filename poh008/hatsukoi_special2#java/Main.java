/**
POH vol.8 「水着」ゲットチャレンジ.
https://paiza.jp/poh/hatsukoi/challenge/hatsukoi_special2
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] arg) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().trim().split(" ");
        String s = br.readLine();
        String t = br.readLine();
        int[] sa = new int[26], ta = new int[26];
        for (int i=0;i<s.length();i++) sa[s.charAt(i)-'a']++;
        for (int i=0;i<t.length();i++) ta[t.charAt(i)-'a']++;
        int a = 0;
        for (int i=0;i<26;i++) {
            a += ta[i]>sa[i]?ta[i]-sa[i]:0;
        }
        System.out.println(a);
    }
}
