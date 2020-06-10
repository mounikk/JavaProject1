package Topic1;

import java.util.Scanner;
public class  Monika{
    private static Scanner input;

	public static void main(String[] Strings) {
        double A = 60 * 24 * 365;
        input = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");
        double min = input.nextDouble();
        long years = (long) (min / A);
        int days = (int) (min / 60 / 24) % 365;
        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
    }
}
