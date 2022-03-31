/**
 * Created by  abdulmuain alhoraomi on 31/03/22.
 */
import java.util.Arrays;
public class p1 {


    public static void main(String[] args) {
        int[]m={10,20,30,40,50};
        System.out.println(Arrays.toString(m));
        System.out.println("inverted =");
        System.out.println(Arrays.toString(inverted(m)));
    }
    public static int[] inverted(int[]m){
        int t=m.length-1;
        for (int i = 0; i < m.length/2; i++) {
            int temp=m[i];
            m[i]=m[t];
            m[t]=temp;
            t--;

        }
        return m;
    }
}



