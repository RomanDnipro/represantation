import java.util.Scanner;

public class UI {

    static final String MESSAGE1 = "Enter the base number of system FROM which you want to represent";
    static final String MESSAGE2 = "Usage: 2/10/16:";

    static String stringStartSystem(Scanner sc, String regEx){

        String numberString = "";
            do {
                System.out.println(MESSAGE2);

                numberString = sc.nextLine();
//            String regEx = "";

                switch (numberString) {
                    case "2":
                        regEx = "dwa"/*"[10]{1,32}"*//*new int[32]*/;
                        break;

                    case "16":
                        regEx = "[d\\a-fA-F]{1,8}"/*new int[8]*/;
                        break;

                    case "10":
                        regEx = "d\\+"/*new int[10]*/;
                        break;

                    default:
                        numberString = "";
                }
            }while (numberString == "");
            return numberString;
    }



}
