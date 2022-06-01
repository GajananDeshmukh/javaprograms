package demo.assesmentcapgemini;

public class Amstrongnumbers {

    public static void main(String args[]) {
        int i, n = 999, a, b, c, d, e;
        System.out.println("Amstromg number betweeen 100 to 999 are:");
        for (i = 100; i < n; i++) {
            a = i / 10;
            b = i % 10;
            c = a / 10;
            d = a % 10;
            b = b * b * b;
            c = c * c * c;
            d = d * d * d;
            e = b + c + d;
            if (i == e) {

                System.out.println(i);
            }
        }

    }

}
