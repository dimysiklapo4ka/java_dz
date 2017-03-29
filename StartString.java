package InitDnepr.home_work;

/**
 * Created by d1mys1klapo4ka on 27.03.2017.
 */
public class StartString {

    public static void main(String[] args) {

        String a = "мама ";
        String b = "мыла ";
        String c = "раму";

        int lenghtA = a.length();
        System.out.println(lenghtA);

        String abc = a.concat(b).concat(c);
        System.out.println(abc);

        float flot = (float) 5.3;
        int Int = 34;
        double Dob = 2.4;

//        System.out.printf("Значение переменной float = %f " +
//                "пока значение integer = %d " +
//                "переменная с плавающей точкой = %d, и string = %s" +
//                flot, Int, Dob, abc);

        String fs;
        fs = String.format("Значение переменной float = " +
                "%f, пока значение integer " +
                "переменная = %d, и string " +
                "= %s" + " double = %f", flot, Int, abc, Dob);
        System.out.println(fs);


    }
}
