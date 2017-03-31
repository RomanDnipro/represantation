import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

import static java.lang.Integer.parseInt;
import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int n = abs(number);

        int[] res = new int [32];

        if (number >= 0){
            posRepresent(res, n, args[0]);
        } else {
            posRepresent(res,n - 1, args[0]);

            for (int i = 0; i < res.length; i++){

                res[i] = res[i] < 1 ? 1 : 0;
//                if (res[i] < 1){
//                    res[i] = 1;
//                } else {
//                    res[i] = 0;
//                }
            }
        }

        System.out.println(Arrays.toString(res));
    }

//    private static int getInt() {
//        Scanner sc = new Scanner(System.in);
//        return sc.nextInt();
//    }

    private static void posRepresent(int[] arr, int k, String arg){

        for (int i = arr.length - 1; i >= 0; i--) {

            if (k >= pow(parseInt(arg), i)) {

                arr[arr.length - 1 - i] = 1;
                k -= pow(parseInt(arg), i);
            }
        }
    }
}
