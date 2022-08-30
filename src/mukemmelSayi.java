import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Bir Sayı Giriniz:");
        number = input.nextInt();

        for (int i = 1; i <= 1; i++) {
            if (number % 2 == 0) {
                System.out.print(number + " Sayısı Mükemmel Sayıdır.");

            } else if (number <= 0) {
                System.out.print("Lütfen pozitif bir tam sayı giriniz.");
            } else {
                System.out.print(number + " Sayısı Mükemmel Sayı Değildir. ");
            }

        }

    }
}
