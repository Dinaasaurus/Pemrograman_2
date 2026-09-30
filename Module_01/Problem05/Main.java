package Module_01.Problem05;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan jari jari: ");
        double finger = input.nextDouble();

        System.out.print("masukkan tinggi: ");
        double height = input.nextDouble();

        Double PI = 3.14;

        double volume = PI * finger * finger * height;

        System.out.printf("Volume tabung dengan jari jari " + finger + " cm dan tinggi " + height + " cm adalah %.3f m3", volume);
    }
}