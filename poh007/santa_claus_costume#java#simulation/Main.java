/**
POH vol.7 「サンタ服」ゲットチャレンジ.
直方体分割時最小体積問題.
分割をシミュレートする解法.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] arg) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int i,d,a,mx=100,my=100;
        //x,y,z,n
        int[] n = new int[4];
        boolean[] x=new boolean[100],y=new boolean[100];
        String[] s = b.readLine().split(" ");
        for (i=0;i<4;i++)n[i]=new Integer(s[i]);
        //cut
        x[n[0]-1]=true;
        y[n[1]-1]=true;
        for (i=0;i<n[3];i++){
            s = b.readLine().split(" ");
            d = new Integer(s[0]);
            a = new Integer(s[1]);
            if (d==0)x[a-1]=true;
            else y[a-1]=true;
        }
        //search min space
        a=-1;
        for(i=0;i<n[0];i++){
            if(x[i]){
                if(mx>i-a)mx=i-a;
                a=i;
            }
        }
        a=-1;
        for(i=0;i<n[1];i++){
            if(y[i]){
                if(my>i-a)my=i-a;
                a=i;
            }
        }
        System.out.println(mx*my*n[2]);
    }
}
