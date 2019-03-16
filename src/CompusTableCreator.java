import java.util.Scanner;

public class CompusTableCreator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert the start value: ");
        int startValue = sc.nextInt();

        System.out.print("Insert the end value: ");
        int endValue = sc.nextInt();

        for (int i = 0; i < startValue; i++) {
            System.out.println("DB 0x00, 0x00");
        }

        int step = (endValue - startValue) / 180;

        for (int i = startValue; i < endValue; i++) {
            System.out.println("DB 0x" + Long.toHexString(step * (i - startValue)) + ", 0x" + Long.toHexString(step * ((i + 1) - startValue)));
        }

        for (int i = endValue; i < 256; i++) {
            System.out.println("DB 0x00, 0x00");
        }

    }
}
