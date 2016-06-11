/**
POH vol.8 「めがね」ゲットチャレンジ.
https://paiza.jp/poh/hatsukoi/challenge/hatsukoi_eye4
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] arg) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = new Integer(br.readLine());
        String[] in = br.readLine().trim().split(" ");
        boolean[] b = new boolean[100];
        for (int i=0;i<n;i++) {
            int j = new Integer(in[i]);
            b[j-1] = true;
        }
        int k = 0;
        for (int i=0;i<100;i++) {
            if (b[i])k++;
            if (k == (n+1)/2) {
                System.out.println(i+1);
                break;
            }
        }
    }
}
