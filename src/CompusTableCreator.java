public class CompusTableCreator {
    public static void main(String[] args) {

        double step = (181.0 / 256.0);

        for (int i = 0; i < 256; i += 2) {
            System.out.println("DB 0x" + Long.toHexString(Math.round(step * i)) + " 0x" + Long.toHexString(Math.round(step * (i + 1))));
        }

    }
}
