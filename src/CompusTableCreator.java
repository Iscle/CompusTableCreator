public class CompusTableCreator {
    public static void main(String[] args) {

        double step1 = (181.0 / 256.0);

        for (int i = 0; i < 256; i += 2) {
            //System.out.println("DB 0x" + Long.toHexString(Math.round(step1 * i)) + ", 0x" + Long.toHexString(Math.round(step1 * (i + 1))));
        }

        double step2 = (181.0/ 168.0);

        for (int i = 0; i < 168; i += 2) {
            System.out.println("DB 0x" + Long.toHexString(Math.round(step2 * i)) + ", 0x" + Long.toHexString(Math.round(step2 * (i + 1))));
        }

    }
}
