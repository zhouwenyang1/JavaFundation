package random;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        System.out.println("开始猜数吧");
        int answer = sc.nextInt();
        while (answer != num){
            if (answer<num){
                System.out.println("太小了，继续猜吧");
            }else if (answer>num){
                System.out.println("太大了，继续猜吧");
            }
            answer = sc.nextInt();
        }
        System.out.println("恭喜你猜对了");
    }
}
