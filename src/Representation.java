import static java.lang.Math.pow;

public class Representation {

    public static void posRepresentDecToBin(int[] arr, int posNumber, int base) {

        for (int i = arr.length - 1; i >= 0; i--) {
            if (posNumber >= pow(base, i)) {
//                for (int j = 1; j < base; j++) {
//                    if (posNumber >= pow(base, i) * j) {
//
//                    }
//                }
                arr[arr.length - 1 - i] = 1;
                posNumber -= pow(base, i);
            }
        }
    }

    public static int[] representDecToBin(int dec){

        int[] res = new int[32];
        if(dec >= 0) {
            posRepresentDecToBin(res, Math.abs(dec), 2);
        }else{
            posRepresentDecToBin(res, Math.abs(dec) - 1, 2);
            for (int i = 0; i < res.length; i++) {
                res[i] = res[i] == 0 ? 1 : 0;
            }
        }
        return res;
    }

    //        if (number >= 0){
//            Representation.posRepresentDecToBin(res, absValOfNumber, Integer.parseInt(args[0]));
//        } else {
//            Representation.posRepresentDecToBin(res,absValOfNumber - 1, Integer.parseInt(args[0]));
//            for (int i = 0; i < res.length; i++){
//                res[i] = res[i] < 1 ? 1 : 0;
//            }
//        }

    public static String posRepresentDecToHex(int decimal) {

        String hex = "";

        do {
            switch (decimal % 16) {

                case 10:
                    hex = 'A' + hex;
                    break;

                case 11:
                    hex = 'B' + hex;
                    break;

                case 12:
                    hex = 'C' + hex;
                    break;

                case 13:
                    hex = 'D' + hex;
                    break;

                case 14:
                    hex = 'E' + hex;
                    break;

                case 15:
                    hex = 'F' + hex;
                    break;

                default:
                    hex = (decimal % 16) + hex;
            }
            decimal = decimal / 16;
        }
        while (decimal > 0);

//        hex = decimal + hex;


//        int quotient = number;
//        int numeral = number;
////        String numeralString = "";
//        while (quotient >= 16){
//            numeral = numeral / 16;
//            quotient = numeral % 16;
//            if (numeral > 9){
//                hex = ((char)(numeral + 55)) + hex;
//            }else {
//                hex = numeral + hex;
//            }
//        }
//        hex = quotient + hex;


        return hex;
    }

    public static int posRepresentHexToDec(String hex) {

        hex = hex.toUpperCase();
        int dec = 0;
        char character = '0';
        for (int i = 0; i < hex.length(); i++) {
            character = hex.charAt(hex.length() - 1 - i);
            if (character >= 65) {
                character = (char) (character - 55);
            } else {
                character = (char) (character - 48);
            }
            dec += character * (int) Math.pow(16, i);
        }
        return dec;
//        if (! number.matches("[d\\a-fA-F]+")){
//            return -1;
//        }


    }

    public static int posRepresentBinToDec(String number) {
        int res = 0;
        for (int i = 0; i < number.length(); i++) {
            if (Character.getNumericValue(number.charAt(number.length() - i - 1)) == 1) {
                res += pow(2, i);
            }
        }
        return res;
    }

    public static int[] posRepresentHexToBin(String hex){
        return representDecToBin(posRepresentHexToDec(hex));
    }

    public static String posRepresentBinToHex(int bin){
        return posRepresentDecToHex(posRepresentBinToDec(String.valueOf(bin)));
    }


}
