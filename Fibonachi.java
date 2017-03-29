package InitDnepr.home_work;

import java.util.Scanner;

/**
 * Created by d1mys1klapo4ka on 27.03.2017.
 */
public class Fibonachi {
    public static void main(String[] args) {

        while (true){
            int f = getInt();
            if (f > 46) {
                System.out.println("Enter a number less than 47");
            }
            else {
                int f1 = getNumberFibonachi(f);
            System.out.println(f1);

                int fibRec = getNumberFibonachiRecurs(f);
                System.out.println(fibRec);

            break;
            }
        }
    }

    private static int getInt() {

        Scanner scanner = new Scanner(System.in);
        int fibonachiNumber = 0;

        if (!scanner.hasNextInt()) {

            System.out.println("get integer number");
        }else {
            fibonachiNumber = scanner.nextInt();
        }
        return fibonachiNumber;
    }

    private static int getNumberFibonachi(int fib){
        int numberFibonachi = 0;
        int a = 1, b = 1;

        if (fib < 1){
            return 0;
        }
        if (fib > 0 && fib < 3 ){
            return 1;
        }

        for (int i = 2; i < fib; i++){

            numberFibonachi = a + b;
            a = b;
            b = numberFibonachi;
        }
        return numberFibonachi;
    }

    private static int getNumberFibonachiRecurs(int fib){
        if (fib <= 0) {
            return 0;
        } else if (fib <= 2) {
            return 1;
        } else {
            return getNumberFibonachiRecurs(fib - 1) + getNumberFibonachiRecurs(fib - 2);
        }
    }
}
