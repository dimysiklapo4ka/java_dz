package InitDnepr.home_work;

import java.util.Scanner;

/**
 * Created by d1mys1klapo4ka on 25.03.2017.
 */
public class Round {

    public static void main(String[] args) {

        double d = getDouble();
        if (d  == 0.0){
            return;
        }
        int a = positiveOrNegativeRound(d);
        System.out.println(a);
        int f = myRound(d);
        System.out.println(f);
    }

    private static double getDouble() {

        Scanner scanner = new Scanner(System.in);
        double roundingNumber = 0.0;

        if (!scanner.hasNextDouble()) {

            System.out.println("get double number");
        }else {
            roundingNumber = scanner.nextDouble();
        }
        return roundingNumber;
    }

    private static int positiveOrNegativeRound(double roundingNumber) {

        int afterRound = 0;
        String strRoundNumb = Double.toString(roundingNumber);
        for (int i = 0, n = strRoundNumb.length(); i < n; i++) {
            if (strRoundNumb.charAt(i) == '-') {
                for (int a = 0, p = strRoundNumb.length(); a < p; a++){
                if (strRoundNumb.charAt(a) == '.') {

                    if (strRoundNumb.charAt(a + 1) >= '5') {
                        roundingNumber = Double.parseDouble(strRoundNumb);
                        afterRound = (int) roundingNumber;
                        afterRound--;
                    } else {
                        roundingNumber = Double.parseDouble(strRoundNumb);
                        afterRound = (int) roundingNumber;
                    }
                }
            }
            return afterRound;

            }else if (strRoundNumb.charAt(i) == '.') {

                    if (strRoundNumb.charAt(i + 1) >= '5') {
                        roundingNumber = Double.parseDouble(strRoundNumb);
                        afterRound = (int) roundingNumber;
                        afterRound++;
                    } else {
                        roundingNumber = Double.parseDouble(strRoundNumb);
                        afterRound = (int) roundingNumber;
                    }
                }

            }
        return afterRound;
    }

    private static int myRound(double needRound){
        int numberAfterRound = (int) (needRound * 10) % 10;
        if (needRound < 0){
            numberAfterRound = (int) ((-1)*needRound * 10) % 10;
            if (numberAfterRound < 5){
                numberAfterRound = (int) needRound;
            }else {
                numberAfterRound = (int) needRound - 1;
            }
        }else if (numberAfterRound < 5){
            numberAfterRound = (int) needRound;
        }else {
            numberAfterRound = (int) needRound + 1;
        }
        return numberAfterRound;
    }
}
