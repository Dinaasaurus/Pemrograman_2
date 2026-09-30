package Module_01.Problem01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan nama lengkap: ");
        String name = input.nextLine();

        System.out.print("masukkan tempat lahir: ");
        String birthplace = input.nextLine();

        System.out.print("masukkan tanggal lahir: ");
        int birthdate = input.nextInt();

        System.out.print("masukkan bulan lahir: ");
        int birthmonth = input.nextInt();

        System.out.print("masukkan tahun lahir: ");
        int birthyear = input.nextInt();

        System.out.print("masukkan tinggi badan: ");
        int height = input.nextInt();

        System.out.print("masukkan berat badan: ");
        double weight = input.nextDouble();

        String monthName = switch (birthmonth) {
            case 1 -> "Januari";
            case 2 -> "Februari";
            case 3 -> "Maret";
            case 4 -> "April";
            case 5 -> "Mei";
            case 6 -> "Juni";
            case 7 -> "Juli";
            case 8 -> "Agustus";
            case 9 -> "September";
            case 10 -> "Oktober";
            case 11 -> "November";
            case 12 -> "Desember";
            default -> "Bulan invalid";
        };

        System.out.print("Nama lengkap " + name + ", Lahir di " +  birthplace + " pada tanggal " + birthdate +  monthName +  birthyear + " Tinggi badan " + height + " cm dan Berat Badan " + weight + " kilogram");
    }
}