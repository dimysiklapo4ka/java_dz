package InitDnepr.home_work;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by d1mys1klapo4ka on 27.03.2017.
 */
public class Anogramm {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String getStringText = scanner.nextLine();

        String[] text = getStringText.split(" ");
        String[] anagram = text.clone();

        for (int i = 0, n = text.length; i < n; i++) {
            char[] a = text[i].toCharArray();
            Arrays.sort(a);
            anagram[i] = Arrays.toString(a);
        }
        for (int i = 0, n = text.length; i< n; i++){
            for (int j = i + 1; j < n; j++){
                if (anagram[i].equals(anagram[j])){
                    System.out.println(text[i] + " - " + text[j]);
                }
            }
        }
    }
}

