package Module_01.Problem03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = input.nextInt();
        int startNumber = input.nextInt();

        int counter = 0;

        do {
            if (startNumber %2 != 0) {
                System.out.print(startNumber + ", ");
                counter++;
            }
            startNumber+=2;
            count--;
        } while (counter < count);
    }
}

