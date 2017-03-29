package InitDnepr.home_work;

import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;

/**
 * Created by d1mys1klapo4ka on 27.03.2017.
 */
public class Anogramm {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String getStringText = getString();
        String[] anogram = getStringText.split(" ");

        for (int i = 0, n = anogram.length; i < n; i++){
            for (int j = 0; j < n; j++){
                if (anogram[i].equals(anogram[j])){
                    System.out.println(anogram[i] + anogram[j]);
                }
            }
        }
    }

    static String getString(){
        String getStringText = scanner.nextLine();

        return getStringText;
    }
}
