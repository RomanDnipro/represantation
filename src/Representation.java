import static java.lang.Math.pow;

public class Representation {

    public static void posRepresentDecToBin(int[] arr, int posNumber, int base){

        for (int i = arr.length - 1; i >= 0; i--) {
            if (posNumber >= pow(base, i)) {
                for (int j = 1; j < base; j++) {
                    if (posNumber >= pow(base, i) * j){

                    }
                }
                arr[arr.length - 1 - i] = 1;
                posNumber -= pow(base, i);
            }
        }
    }

    public static String posRepresentDecToHex(int number){

        String res = "";
        int quotient = number;
        int numeral = number;
//        String numeralString = "";
        while (quotient >= 16){
            numeral = numeral / 16;
            quotient = numeral % 16;
            if (numeral > 9){
                res = ((char)(numeral + 55)) + res;
            }else {
                res = numeral + res;
            }
        }
        res = quotient + res;


        return res;
    }

    public static int posRepresentHexToDec(String number){

//        if (! number.matches("[d\\a-fA-F]+")){
//            return -1;
//        }


        return 0;
    }

    public static int posRepresentBinToDec(String number){
        int res = 0;
        for (int i = 0; i < number.length(); i++) {
             if (Character.getNumericValue(number.charAt(number.length() - i - 1)) == 1){
                 res += pow(2, i);
             }
        }
        return res;
    }



}
