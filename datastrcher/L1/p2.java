/**
 * Created by abdulmuain alhorsomi on 31/03/22.
 */
import java.util.Arrays;
public class p2 {

    public static void main(String[] args) {
        int[]x={11,12,13,14,15};
        System.out.println(Arrays.toString(x));
        System.out.println("copy in anathor arry =");
        int [] new_x=(int[])Arrays.copyOf(x,5);
        for (int j = 0; j < 1; j++) {
            System.out.println(Arrays.toString(new_x));
        }
    }

}

