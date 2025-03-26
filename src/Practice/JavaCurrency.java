package Practice;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();

        DecimalFormat indianCurrencyFormat = new DecimalFormat("##,##,###.00");
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat chineseFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + usFormat.format(payment));
        System.out.println("India: Rs." + indianCurrencyFormat.format(payment));
        System.out.println("China: " + chineseFormat.format(payment));
        System.out.println("France: " + franceFormat.format(payment));

        scanner.close();
    }
}
