package random;

import java.util.Random;

public class Random01 {
    public static void main(String[] args) {
        Random r = new Random();
        int n = 5;
        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(n)+1;
            System.out.println(num);
        }
    }
}
