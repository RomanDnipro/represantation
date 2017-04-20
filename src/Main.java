import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.pow;

public class Main {

    public static void main(String[] args) {

//        System.out.println("aS12 =0Edw".toUpperCase());

//        Scanner sc = new Scanner(System.in);
//        String regEx = "";
//
//        /**
//         * Принимем базу
//         * исходной системы счисления
//         */
//
//        System.out.println(UI.MESSAGE1);
//        int startSystem = Integer.parseInt(UI.stringStartSystem(sc, regEx));
//        System.out.println("start system: " + startSystem);
//        System.out.println("regEx: " + regEx);
//        System.out.println(Representation.posRepresentBinToDec("10000000001"));
        System.out.println(Representation.posRepresentHexToDec("64CB"));  //  positive Hex to Dec
        System.out.println(Representation.posRepresentDecToHex(25803));  //  positive Dec to Hex
        System.out.println(Arrays.toString(Representation.representDecToBin(256)));  //  POSITIVE Dec to Bin
        System.out.println(Arrays.toString(Representation.representDecToBin(-6)));  //  NEGATIVE Dec to Bin
        System.out.println(Representation.posRepresentBinToDec("10001"));  //  positive Bin to Dec
        System.out.println(Arrays.toString(Representation.posRepresentHexToBin("64CB")));  //  positive Hex to Bin
        System.out.println(Representation.posRepresentBinToHex(101111));  //  positive Bin to Hex


//        /**
//         * Принимем базу
//         * целевой системы счисления
//         */
//        System.out.println("Enter the base number of system TO which you want to represent:");
//        int endSystem = Helper.getInt(sc);
//
//        /**
//         * Принимем число, которое необходимо представить в
//         * другой системе счисления. Также берём модуль этого числа.
//         */
//        System.out.println("Enter the number you want to represent:");
//        int number = Helper.getInt(sc);
//        int absValOfNumber = Math.abs(number);
//
//
//
//        /**
//         * Создаём результирующий массив
//         */
//        int[] res;
//        switch (endSystem){
//            case 2:
//                res = new int[32];
//                break;
//            case 8:
//                res = new int[11];
//                break;
//            case 16:
//                res = new int[8];
//                break;
//            default:
//                res = new int[10];
//                break;
//        }
//
//        if (number >= 0){
//            Representation.posRepresentDecToBin(res, absValOfNumber, Integer.parseInt(args[0]));
//        } else {
//            Representation.posRepresentDecToBin(res,absValOfNumber - 1, Integer.parseInt(args[0]));
//            for (int i = 0; i < res.length; i++){
//                res[i] = res[i] < 1 ? 1 : 0;
//            }
//        }
//
//        System.out.println(Arrays.toString(res));
    }

//    private static int getInt() {
//        Scanner sc = new Scanner(System.in);
//        return sc.nextInt();
//    }


}
